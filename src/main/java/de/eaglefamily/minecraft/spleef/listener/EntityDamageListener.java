package de.eaglefamily.minecraft.spleef.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageListener implements Listener {

  private static final int FIRE_DAMAGE = 9;

  @EventHandler
  public void onEntityDamage(EntityDamageEvent event) {
    if (event.getCause() != EntityDamageEvent.DamageCause.LAVA) {
      event.setCancelled(true);
      return;
    }

    event.setDamage(FIRE_DAMAGE);
  }
}
