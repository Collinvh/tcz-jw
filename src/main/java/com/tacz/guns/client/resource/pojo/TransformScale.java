package com.tacz.guns.client.resource.pojo;

import com.google.gson.annotations.SerializedName;
import org.joml.Vector3f;

import javax.annotation.Nullable;

public class TransformScale {
    @SerializedName("thirdperson")
    @Nullable
    private Vector3f thirdPerson;
    @SerializedName("ground")
    @Nullable
    private Vector3f ground;
    @SerializedName("fixed")
    @Nullable
    private Vector3f fixed;

    @Nullable
    public Vector3f getThirdPerson() {
        return thirdPerson;
    }

    @Nullable
    public Vector3f getGround() {
        return ground;
    }

    @Nullable
    public Vector3f getFixed() {
        return fixed;
    }
}
