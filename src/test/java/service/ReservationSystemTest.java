package service;

import model.ConferenceRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationSystemTest {

    private ReservationSystem system;

    @BeforeEach
    public void setUp() {
        system = new ReservationSystem();
    }

    @Test
    public void testReserveRoom() {
        // Implementar pruebas aqu
        ReservationSystem reservationSystem= new ReservationSystem();
        String roomIdToReserve="A1";
        boolean result= reservationSystem.reserveRoom(roomIdToReserve);
        
        assertTrue(result);
        
    }

    @Test
    public void testCancelReservation() {
        // Implementar pruebas aquí
        ReservationSystem reservationSystem= new ReservationSystem();
        String roomIdReserved="A2";
        
        boolean result= reservationSystem.cancelReservation(roomIdReserved);
        
        assertFalse(result);
    }

    // Puedes añadir más pruebas según lo consideres necesario

    
}
