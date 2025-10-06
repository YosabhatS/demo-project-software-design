package com.cp.lab08sec1.demo.model;

import jakarta.persistence.*; // 💡 ใช้ jakarta.persistence (สำหรับ Spring Boot 3+)

@Entity
@Table(name = "order_item") // 💡 กำหนดชื่อตารางตาม ER Diagram
public class OrderItem {

    @Id // 💡 Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 💡 ให้ DB สร้าง ID อัตโนมัติ
    private Long id;

    // Foreign Key ไปยัง OrderInfo (column: order_id)
    @Column(name = "order_id")
    private Long orderId;

    // Foreign Key ไปยัง MenuItem (column: menu_id)
    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "quantity")
    private Integer quantity;

    // 💡 หากใช้ Lombok สามารถเพิ่ม @Data, @NoArgsConstructor, @AllArgsConstructor ได้
    
    // --- Getters and Setters (ถ้าไม่ได้ใช้ Lombok) ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
