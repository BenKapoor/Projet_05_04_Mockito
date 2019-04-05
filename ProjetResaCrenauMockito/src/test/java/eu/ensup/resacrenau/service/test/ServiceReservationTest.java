package eu.ensup.resacrenau.service.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import eu.ensup.resacrenau.dao.DaoReservation;
import eu.ensup.resacrenau.domaine.Reservation;
import eu.ensup.resacrenau.exception.DAOException;
import eu.ensup.resacrenau.service.ResaCrenauService;

public class ServiceReservationTest {
	Reservation reservation;
	
	@Mock
	private DaoReservation daoMock;
	
	@InjectMocks
	private ResaCrenauService service;
	
	@Before
    public void setUp() throws Exception {
		reservation = new Reservation("aa", "aa");	
		reservation.setId(1);
		MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testAjoutReservation() throws DAOException {
		// mock l'objet
		DaoReservation daoResaMock = mock(DaoReservation.class);
		
		// définit un paterne comportemental
		when(daoResaMock.ajouterReservation(reservation)).thenReturn(false);
		
		//assertion
		assertFalse(daoResaMock.ajouterReservation(reservation));

	}

	@Test
	public void testListUneReservation() throws DAOException {
		Reservation reservation = new Reservation(1, "", "");
		ArrayList<Reservation>reservationList = new ArrayList<Reservation>();
		reservationList.add(reservation);
		
		// mock l'objet
		DaoReservation daoResaMock = mock(DaoReservation.class);
		
		//On définit le comportement
		when(daoResaMock.listUneReservation(reservation.getId()).thenReturn(reservationList));
	}
}
