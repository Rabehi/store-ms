package rabehi.store.shoppingms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rabehi.store.shoppingms.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
