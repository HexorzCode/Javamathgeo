package org.example;

public class HitungLuasGeometri implements RumusGeometri {

    public static final double Setengah = 0.5;

    public static double luasPersegi(Geometri geo) {
        return RumusGeometri.hitungpersegi(geo);
    }

    public static double luasSegitiga(Geometri geo) {
        return RumusGeometri.hitungsegitiga(geo);
    }

    public static double luasJajargenjang(Geometri geo) {
        return RumusGeometri.hitungjajargenjang(geo);
    }

    public static double luasTrapesium(Geometri geo) {
        return RumusGeometri.hitungtrapesium(geo);
    }

}
