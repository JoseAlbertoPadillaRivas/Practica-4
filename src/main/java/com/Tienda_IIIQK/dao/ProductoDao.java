/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IIIQK.dao;

import com.Tienda_IIIQK.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author josep
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
