package com.martinbrunzell.solarquest.game.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.martinbrunzell.solarquest.game.Assets;
import com.martinbrunzell.solarquest.util.Constants;

public class Space extends AbstractWorldObject{
    private TextureRegion spaceReg;
    private Sprite background;

    public Space() {
        init();
    }


    private void init() {
        spaceReg = Assets.instance.space.space;

        float size = Constants.BACKGROUND_DIMENSION;
        dimension.set(size, size);
        position.set(-size / 2, -size / 2);

        //Setting text sprite
        background = new Sprite(spaceReg.getTexture());
    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(SpriteBatch batch) {
        TextureRegion reg = null;
        reg = spaceReg;

        batch.begin();
        // Renders the background to the window
        batch.draw(reg.getTexture(), position.x, position.y, origin.x, origin.y,
                dimension.x, dimension.y, scale.x, scale.y, rotation, reg.getRegionX(), reg.getRegionY(),
                reg.getRegionWidth(), reg.getRegionHeight(), false, false);


        batch.end();

    }


}
