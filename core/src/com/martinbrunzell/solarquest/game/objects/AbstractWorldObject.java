package com.martinbrunzell.solarquest.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class AbstractWorldObject {
    public Vector2 position;
    public Vector2 dimension;
    public Vector2 origin;
    public Vector2 scale;
    public float rotation;
    public Rectangle bounds;
    public float radius;

    public AbstractWorldObject() {
        position = new Vector2();
        dimension = new Vector2();
        origin = new Vector2();
        scale = new Vector2();
        rotation = 0;
        bounds = new Rectangle(position.x, position.y, dimension.x, dimension.y);
    }

    public abstract void update(float deltaTime);

    public abstract void render(SpriteBatch batch);

}
