package com.cgvsu.model;

import com.cgvsu.math.Vector2f;
import com.cgvsu.math.Vector3f;

import java.util.*;

public class Model {

    public ArrayList<Vector3f> vertices;
    public ArrayList<Vector2f> textureVertices;
    public ArrayList<Vector3f> normals;
    public ArrayList<Polygon> polygons;


    public ArrayList<Vector3f> getVertices() {
        return this.vertices;
    }

    public ArrayList<Vector2f> getTextureVertices() {
        return this.textureVertices;
    }

    public ArrayList<Vector3f> getNormals() {
        return this.normals;
    }

    public ArrayList<Polygon> getPolygons() {
        return this.polygons;
    }


}
