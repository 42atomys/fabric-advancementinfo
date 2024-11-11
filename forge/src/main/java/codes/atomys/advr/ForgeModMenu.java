package codes.atomys.advr;

import codes.atomys.advr.config.gui.ConfigurationScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.common.MinecraftForge;

/**
 * This class integrates with the Mod Menu API to provide a configuration screen
 * for the mod. It implements the ModMenuApi interface and overrides the
 * getModConfigScreenFactory method to return a ConfigScreenFactory.
 *
 * @see <a href="https://github.com/TerraformersMC/ModMenu">Mod Menu</a>
 * @see ConfigurationScreen#screen(Screen)
 */
public final class ForgeModMenu {

  private ForgeModMenu() {
  }

  /**
   * Registers AdvancementsReloaded in the mod menu.
   *
   * <p>
   * The method registers a mod configuration screen in the mod menu. The
   * configuration screen is provided by the
   * {@link ConfigurationScreen#screen(Screen)} method.
   * </p>
   */
  public static void registerModsPage() {
    MinecraftForge.registerConfigScreen(modsScreen -> ConfigurationScreen.screen(modsScreen));
  }
}
