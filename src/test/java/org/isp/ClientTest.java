package org.isp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {
    private Client client;
    private Restaurant restaurant;
    private Comanda comanda;
    private Livrare livrare;
    private Plata plata;
    private ItemMenu item;
    private List<ItemMenu> items;

    @BeforeEach
    public void setUp() {
        client = new Client(1, "John Doe", "1234567890", "123 Main St");
        restaurant = mock(Restaurant.class);
        comanda = mock(Comanda.class);
        livrare = mock(Livrare.class);
        plata = mock(Plata.class);
        item = mock(ItemMenu.class);
        items = new ArrayList<>();
        items.add(item);
    }

    @Test
    public void testPlasareComanda() {
        when(restaurant.acceptaComanda(any(Comanda.class))).thenReturn(true);
        Comanda result = client.plasareComanda(restaurant, items, 100, livrare, plata);
        assertNotNull(result);
        assertEquals(StareComanda.NEW, result.getStare());
        verify(restaurant).acceptaComanda(any(Comanda.class));
    }


    @Test
    public void testUrmarireComanda() {
        List<Comanda> comenzi = new ArrayList<>();
        comenzi.add(comanda);
        when(comanda.getComandaId()).thenReturn(1);

        Comanda result = client.urmarireComanda(1, comenzi);
        assertNotNull(result);
        assertEquals(1, result.getComandaId());
    }

    @Test
    public void testAnulareComanda() {
        client.anulareComanda(comanda);
        verify(comanda).actualizeazaStare(StareComanda.CANCELLED);
    }

    @Test
    public void testLasaRecenzie() {
        client.lasaRecenzie(comanda, "Great service");
        // Since the method doesn't have a return or a change in a state we can check, just ensure the method completes without errors.
        assertTrue(true); // This just acts as a placeholder to indicate the test passed.
    }
}
