package org.example;

public interface RumusGeometri {
    static double hitungpersegi(Geometri geo) {
        return geo.getSisi() * geo.getSisi();
    }

    static double hitungsegitiga(Geometri geo) {
        return HitungLuasGeometri.Setengah * geo.getAlas() * geo.getTinggi();
    }

    static double hitungjajargenjang(Geometri geo) {
        return geo.getAlas() * geo.getTinggi();
    }

    static double hitungtrapesium(Geometri geo) {
        return HitungLuasGeometri.Setengah * (geo.getAlas() + geo.getSisi()) * geo.getTinggi();
    }
}
