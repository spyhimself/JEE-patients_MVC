package ma.emsi.patientsmvc;

import ma.emsi.patientsmvc.entities.Patient;
import ma.emsi.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {

            patientRepository.save(new Patient(null, "Mohammed", new Date(), false, 15));
            patientRepository.save(new Patient(null, "Hassan", new Date(), true, 30));
            patientRepository.save(new Patient(null, "Driss", new Date(), true, 25));
            patientRepository.save(new Patient(null, "Yasmine", new Date(), false, 10));

            patientRepository.findAll().forEach(
                    patient -> {
                        System.out.println(patient.getNom());
                    }
            );

        };
    }

}
