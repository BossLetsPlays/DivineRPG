package divinerpg.entities.projectile;

import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class EntityMerikMissile extends EntityHeatSeekingProjectile {
    float damage = 8.0F;

    public EntityMerikMissile(EntityType<? extends ThrowableEntity> type, World world) {
        super(type, world);
    }

    public EntityMerikMissile(EntityType<? extends ThrowableEntity> type, World world, LivingEntity entity, float damage) {
        super(type, entity, world);
        this.damage = damage;
    }

    @Override
    protected void onHitEntity(EntityRayTraceResult pos) {
        if (pos.getEntity() != null) {
            Entity entity = pos.getEntity();
            entity.hurt(DamageSource.thrown(this, this.getOwner()), this.damage);
        }
        if (!this.level.isClientSide) {
            this.level.explode(this, this.xo, this.yo, this.zo, 2, false, Explosion.Mode.BREAK);
            this.kill();
        }
    }

    @Override
    protected void onHit(RayTraceResult result) {
        if (!this.level.isClientSide) {
        this.level.explode(this, this.xo, this.yo, this.zo, 2, false, Explosion.Mode.BREAK);
        this.kill();
    }
    }
}