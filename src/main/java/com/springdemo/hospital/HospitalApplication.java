package com.springdemo.hospital;

import com.springdemo.hospital.entities.Patient;
import com.springdemo.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // This method is executed after the application context is loaded
        // You can add your initialization code here if needed

        // Constructeur par defaut
        // Patient patient= new Patient();
        // patient.setId(null);
        // patient.setNom("John Doe");
        //patient.setDateNaissance(new Date());
        //patient.setMalade(false);
        // patient.setScore(25);

        // Contructeur avec parametres
        //Patient patient2= new Patient(null, "Jane Doe", new Date(), true, 30);

        //Builder
        //Patient patient3= Patient.builder()
          //      .nom("Jack Doe")
        //       .dateNaissance(new Date())
        //     .malade(false)
        //     .score(20)
        //      .build();

        // Enregistrement d'un patient
        patientRepository.save(new Patient(null, "John Doe", new Date(), false, 25));
        patientRepository.save(new Patient(null, "Jane Doe", new Date(), true, 30));
        patientRepository.save(new Patient(null, "Jack Doe", new Date(), false, 20));

    }

}
