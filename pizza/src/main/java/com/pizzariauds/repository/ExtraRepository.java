/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzariauds.repository;

/**
 *
 * @author root
 */
import com.pizzariauds.model.Extra;
import org.springframework.data.jpa.repository.JpaRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface ExtraRepository extends JpaRepository<Extra, Integer> {

}
