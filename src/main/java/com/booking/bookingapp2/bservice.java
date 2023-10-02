package com.booking.bookingapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class bservice {

   @Autowired
   private brepository repository;

   public bservice() {
   }

   public bservice(brepository repository) {
      this.repository = repository;
   }

   public brepository getRepository() {
      return this.repository;
   }

   public void setRepository(brepository repository) {
      this.repository = repository;
   }

   public bservice repository(brepository repository) {
      setRepository(repository);
      return this;
   }

   @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof bservice)) {
            return false;
        }
        bservice bservice = (bservice) o;
        return Objects.equals(repository, bservice.repository);
   }



   @Override
   public String toString() {
      return "{" +
         " repository='" + getRepository() + "'" +
         "}";
   }



}



    
