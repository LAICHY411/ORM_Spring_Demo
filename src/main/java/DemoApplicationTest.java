import entities.Patient;
import repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private PatientRepository patientRepository;

    @Test
    void testCreatePatient() {
        Patient patient = new Patient(null, "Mohamed", new Date(), false, 120);
        patientRepository.save(patient);
    }

    @Test
    void testFindAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p -> System.out.println(p.getNom()));
    }

    // Ajouter d'autres méthodes de test pour chaque opération
}