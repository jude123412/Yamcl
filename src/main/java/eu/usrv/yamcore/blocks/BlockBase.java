
package eu.usrv.yamcore.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    private boolean _mIsOpaqueCube;
    private int _mRenderBlockPass;

    public BlockBase(Material pMaterial) {
        super(pMaterial);
        _mIsOpaqueCube = true;
    }

    public void setInner_IsOpaque(boolean pFlag) {
        _mIsOpaqueCube = pFlag;
    }

    public void setInner_RenderBlockPass(int pPass) {
        _mRenderBlockPass = pPass;
    }

    @Override
    public boolean isOpaqueCube() {
        return _mIsOpaqueCube;
    }

    @Override
    public int getRenderBlockPass() {
        return _mRenderBlockPass;
    }
}
