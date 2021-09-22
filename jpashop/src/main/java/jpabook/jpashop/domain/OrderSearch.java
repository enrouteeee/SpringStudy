package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.EntityManager;
import java.util.List;

@Getter @Setter
@RequiredArgsConstructor
public class OrderSearch {
    private final EntityManager em;


}
