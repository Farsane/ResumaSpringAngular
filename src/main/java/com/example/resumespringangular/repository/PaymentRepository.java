package com.example.resumespringangular.repository;
import com.example.resumespringangular.entities.Payment;
import com.example.resumespringangular.entities.PaymentStatus;
import com.example.resumespringangular.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
}
