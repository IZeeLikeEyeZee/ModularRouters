package me.desht.modularrouters.item.module;

import me.desht.modularrouters.block.tile.TileEntityItemRouter;
import me.desht.modularrouters.client.IPositionProvider;
import me.desht.modularrouters.config.ConfigHandler;
import me.desht.modularrouters.logic.ModuleTarget;
import me.desht.modularrouters.logic.compiled.CompiledModule;
import me.desht.modularrouters.logic.compiled.CompiledPullerModule2;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nonnull;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PullerModule2 extends TargetedModule implements IRangedModule, IPositionProvider {
    @Override
    public CompiledModule compile(TileEntityItemRouter router, ItemStack stack) {
        return new CompiledPullerModule2(router, stack);
    }

    @Override
    public boolean isDirectional() {
        return false;
    }

    @Override
    public int getBaseRange() {
        return ConfigHandler.module.puller2BaseRange;
    }

    @Override
    public int getHardMaxRange() {
        return ConfigHandler.module.puller2MaxRange;
    }

    @Override
    public Color getItemTint() {
        return new Color(128, 128, 255);
    }

    @Override
    public List<BlockPos> getStoredPositions(@Nonnull ItemStack stack) {
        ModuleTarget target = TargetedModule.getTarget(stack);
        return target == null ? Collections.emptyList() : Collections.singletonList(target.pos);
    }

    @Override
    public int getRenderColor(int index) {
        return 0x808080FF;
    }
}
