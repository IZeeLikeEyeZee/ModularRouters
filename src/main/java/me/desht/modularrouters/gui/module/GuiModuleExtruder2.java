package me.desht.modularrouters.gui.module;

import me.desht.modularrouters.container.ContainerModule;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class GuiModuleExtruder2 extends GuiModule {
    public GuiModuleExtruder2(ContainerModule containerItem, EnumHand hand) {
        this(containerItem, null, -1, hand);
    }

    public GuiModuleExtruder2(ContainerModule containerItem, BlockPos routerPos, Integer slotIndex, EnumHand hand) {
        super(containerItem, routerPos, slotIndex, hand);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
        this.drawTexturedModalRect(guiLeft + 128, guiTop + 16, 202, 52, 54, 54);
    }
}
