package divinerpg.objects.entities.entity.projectiles;

import divinerpg.objects.entities.entity.vanilla.EntitySaguaroWorm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntitySaguaroWormShot extends EntityThrowable {

    public EntitySaguaroWormShot(World var1) {
        super(var1);
    }

    public EntitySaguaroWormShot(World var1, EntityLivingBase var2) {
        super(var1, var2);
    }

    public EntitySaguaroWormShot(World var1, double var2, double var4, double var6) {
        super(var1, var2, var4, var6);
    }

    @Override
    protected void onImpact(RayTraceResult var1) {
        if (var1.entityHit != null && !(var1.entityHit instanceof EntitySaguaroWorm)) {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 4.0F);
        } else if (var1.entityHit == null) {
            if (!this.world.isRemote)
                this.setDead();
        }
    }

    @Override
    public float getGravityVelocity() {
        return 0;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.world.isRemote && this.ticksExisted > 30)
            this.setDead();
    }
}