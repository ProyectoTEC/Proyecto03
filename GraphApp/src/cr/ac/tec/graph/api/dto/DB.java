package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Estructuras.ListaEnlazada;

public class DB {
	public static ListaEnlazada lista = new ListaEnlazada<Graph>();
	public static Map<UUID,Persona> db = new HashMap();
}