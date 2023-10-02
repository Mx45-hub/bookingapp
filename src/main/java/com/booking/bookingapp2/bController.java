package com.booking.bookingapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;


@Controller
public class bController {
 
    private final brepository rBrepository;
    private final bservice bService;


    @Autowired
    public bController(brepository rBrepository, bservice bService) {
        this.rBrepository = rBrepository;
        this.bService = bService;
    }



    public brepository getRBrepository() {
        return this.rBrepository;
    }


    public bservice getBService() {
        return this.bService;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof bController)) {
            return false;
        }
        bController bController = (bController) o;
        return Objects.equals(rBrepository, bController.rBrepository) && Objects.equals(bService, bController.bService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rBrepository, bService);
    }

    @Override
    public String toString() {
        return "{" +
            " rBrepository='" + getRBrepository() + "'" +
            ", bService='" + getBService() + "'" +
            "}";
    }


    @GetMapping("/")
    public String home() {
        return "home"; // The name of your HTML form file without the extension
    }


    
    @GetMapping("/booking")
    public String showDateInputForm() {
        return "booking"; // The name of your HTML form file without the extension
    }

    @PostMapping("/booking")
    public String processDateInput(@RequestParam("inputDate") String inputDate,
                                   @RequestParam("firstName") String firstName,
                                   @RequestParam("surname") String surname,
                                   @RequestParam("email") String email,
                                   @RequestParam("cellphone") String cellphone,
                                   @RequestParam("inputTime") String inputTime,
                                   @RequestParam("style") String style,
                                   Model model) {
    
        try {
            // Process the inputDate (e.g., save it to a database, perform some operations)
            System.out.println("Input Date: " + inputDate);
            System.out.println("Input Date: " + inputTime);
            System.out.println("First Name: " + firstName);
            System.out.println("Surname: " + surname);
            System.out.println("Email: " + email);
            System.out.println("Cellphone: " + cellphone);
    
            // Save data to the database
            bmodel entity = new bmodel();
            entity.setFirstname(firstName);
            entity.setSurname(surname);
            entity.setEmail(email);
            entity.setCellphone(cellphone);
            entity.setInputTime(inputTime);
            entity.setInputDate(inputDate);
            entity.setStyle(style);
            rBrepository.save(entity);
    
            // Set a success message and redirect to a success page
            model.addAttribute("successMessage", "Your booking is successfull ");
     
            return "booking";
        } catch (Exception e) {
            // Handle errors here
            e.printStackTrace();
            model.addAttribute("errorMessage", "Your was not successfull. Please try again");

            return "booking"; // Redirect to an error page or show an error message
        }
    }

    
    @GetMapping("/allbookings")
    public String allbookings(Model model) {
        List<bmodel> bookings = rBrepository.findAll(); 
        model.addAttribute("bookings", bookings);
        return "allbookings"; // The name of your HTML form file without the extension
    }



 
    
    
}
