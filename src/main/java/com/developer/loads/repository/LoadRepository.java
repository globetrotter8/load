package com.developer.loads.repository;
import com.developer.loads.LoadsApplication;
import com.developer.loads.entity.LoadEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoadRepository extends JpaRepository<LoadEntity,Long>{
}
