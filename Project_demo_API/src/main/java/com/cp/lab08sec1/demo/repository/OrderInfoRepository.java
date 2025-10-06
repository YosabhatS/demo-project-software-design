package com.cp.lab08sec1.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.lab08sec1.demo.model.OrderInfo;


public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long>{
	Optional<OrderInfo> findFirstByTableIdAndStatus(Long tableId, String status);

}
