package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

        // Assert
        assertEquals(true, result);
    }
    @Test
  void  szamol() {
    TorpedoStore store = new TorpedoStore(5);
    assertEquals(5, store.getTorpedoCount());
  }

  @Test
  void fire_csokkentes() {
    TorpedoStore store = new TorpedoStore(5);
    store.fire(2);
    assertEquals(3, store.getTorpedoCount());
  }

  @Test
  void fire_utolso() {
    TorpedoStore store = new TorpedoStore(1);
    assertTrue(store.fire(1));
    assertEquals(0, store.getTorpedoCount());
    assertTrue(store.isEmpty());
  }

  @Test
  void ures_bal() {
    TorpedoStore store = new TorpedoStore(3);
    assertFalse(store.isEmpty());
  }

  
  @Test
  void ures_nulla() {
    TorpedoStore store = new TorpedoStore(0);
    assertTrue(store.isEmpty());
  }

  @Test
  void fire_valami_legyenen_mar() {
    TorpedoStore store = new TorpedoStore(0);
    assertThrows(IllegalArgumentException.class, () -> store.fire(1));
  }

    
}
