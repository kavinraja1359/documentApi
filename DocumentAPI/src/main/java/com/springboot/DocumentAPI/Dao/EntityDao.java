package com.springboot.DocumentAPI.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.DocumentAPI.Entities.EntityData;

public interface EntityDao extends JpaRepository<EntityData, String> {
	@Query("select documentId from EntityData d where d.entityId = :entityId")
	String findByEntityId(String entityId);
	
	@Query("select d from EntityData d where d.entityId LIKE 'truck%'")
	List<EntityData> findByTruckType();
	
	@Query("select d from EntityData d where d.entityId LIKE 'transporter%'")
	List<EntityData> findByTransporterType();
	
	@Query("select d from EntityData d where d.entityId LIKE 'shipper%'")
	List<EntityData> findByShipperType();
}
