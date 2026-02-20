package com.orderflow.orderservice.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.orderflow.orderservice.entity.Order;

/**
 * ORDER REPOSITORY INTERFACE
 * - Provides a clean data-access boundary between the Service layer and the database.
 * - Spring Data generates the implementation automatically at runtime.
 * - Extends JpaRepository to get standard CRUD methods and pagination support.
 * - Optional<Order> to explicitiy handle "not found" cases without returning null.
 * - Pageable to let caller control page size and page number.
 * 
 * @author Emmanuel Taylor
 */
public interface OrderRepository extends JpaRepository<Order, UUID> {
    Optional<Order> findByIdempotencyKey(String idempotencyKey);
    Page<Order> findAllByOrderByCreatedAtDesc(Pageable pageable);
}