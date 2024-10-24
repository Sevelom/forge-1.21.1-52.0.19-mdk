package net.Sevelom.GravityFallsMod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class FlashlightItem extends Item
{

    public FlashlightItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext)
    {
        if(!pContext.getLevel().isClientSide)
        {
            BlockPos positionClickied = pContext.getClickedPos();
            Player player = pContext.getPlayer();
        }

        return InteractionResult.SUCCESS;
    }
}
