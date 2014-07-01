package io.endertech.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import io.endertech.common.CommonProxy;
import io.endertech.tile.TileSpinningCube;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerTickerHandlers()
    {
        super.registerTickerHandlers();

        FMLCommonHandler.instance().bus().register(new KeyBindingHandler());
    }

    @Override
    public void registerTESRs()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(TileSpinningCube.class, new SpinningCubeRenderer());
    }
}
