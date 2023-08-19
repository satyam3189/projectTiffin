package com.app.repository;

import com.app.model.TiffinDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiffinDetailRepository extends JpaRepository<TiffinDetail, Long> {
}
