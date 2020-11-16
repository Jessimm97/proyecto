package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Clientes;
import com.example.demo.modelo.Computadoras;
import com.example.demo.modelo.Prov;
import com.example.demo.modelo.Venta;
import com.example.demo.modelo.Ticket;

@Controller
@RequestMapping("/ExamenUnidad2")
public class Controlador {

	@GetMapping("/")
	public String index(){
		return "index";
		
	}
	@GetMapping("computadoras")
	public String Computadora(Model modelo) {
		List<Computadoras> compu=new ArrayList<Computadoras>(); 
		
		compu.add(new Computadoras("S-10","Acer","Core i3", "windows 7","4 G", "2 núcleos"));
		compu.add(new Computadoras("S-20","HP","Core i5", "windows vista","2 G", "6 núcleos"));
		compu.add(new Computadoras("S-30","Toshiba","Core i9", "windows 10","6 G", "8 núcleos"));
		compu.add(new Computadoras("S-40","ASUS","AMD Ryze", "windows XP","2 G", "1 núcleo"));
		compu.add(new Computadoras("S-50","Lenovo","AMD ATHLON ", "Ubuntu","8 G", "8 núcleos"));
		compu.add(new Computadoras("S-60","Sony","pentium", "Centos","16 G", " 4 núcleos"));
		compu.add(new Computadoras("S-70","MAC","Core i7", "IOS","8 G", "8 núcleos"));
		compu.add(new Computadoras("S-80","Dell","Core i", "Windows 8","4 G", "2 núcleos"));
		compu.add(new Computadoras("S-90","Samsung","Core i6", "windows 7","2 G", "4 núcleos"));
		compu.add(new Computadoras("S-100","Acer","AMD", "windows XP","4 G", "1 núcleo"));
		
		modelo.addAttribute("compu",compu);
		return "computadoras";
		
	}
	
	@GetMapping("clientes")
	public String Cliente (Model modelo) {
		List<Clientes> cliente= new ArrayList<Clientes>();
		cliente.add(new Clientes("C-1001", "Juaquin", "Monteros", "5678453210", "juaq@gmail.com", "Heroes de churubusco"));
		cliente.add(new Clientes("C-1002", "Estaban", "Márquez", "5578990099", "estbn@gmail.com", "Central 89"));
		cliente.add(new Clientes("C-1003", "Sandra", "Uruzquieta", "5688334455", "sndr@gmail.com", "Coapa 78"));
		cliente.add(new Clientes("C-1004", "Monica", "Uribe", "5512211221", "muri@gmail.com", "Campestre Churubusco 09"));
		cliente.add(new Clientes("C-1005", "Carlos", "Ramírez", "5566778888", "carlito@gmail.com", "Eje 7 98"));
		cliente.add(new Clientes("C-1006", "Felipe", "Martínez", "89345544", "felipito@gmail.com", "Miramontes 87"));
		cliente.add(new Clientes("C-1007", "Carmen", "Patiño", "89006500", "carm@gmail.com", "principal 90"));
		cliente.add(new Clientes("C-1008", "Gabriela", "Gutiérrez", "8944335511", "gaby@gmail.com", "segunda cerrda 4"));
		cliente.add(new Clientes("C-1009", "Camila", "Monterrey", "90897766", "cami@gmail.com", "ermita 87"));
		cliente.add(new Clientes("C-1010", "Melissa", "Isabel", "90334455", "meliss@gmail.com", "Miravalle 76"));
		modelo.addAttribute("cliente", cliente);
		return "clientes";
	}
	@GetMapping("proveedor")
	public String Proveedor(Model modelo) {
		List<Prov> prove =new ArrayList<Prov>();
		prove.add(new Prov("P245", "Acer", "Luis Carmona","luis@acer.com", "ACER345678", "5577889900","Roma 67"));
		prove.add(new Prov("P246", "Toshiba", "Jorge Nuñez","jorge@toshiba.com", "Toshiba9678", "5579977","Centro 90"));
		prove.add(new Prov("P247", "Sony", "Arturo Barón","baron@sony.com", "EBTR45678", "55667788","Cuahutémoc 8"));
		prove.add(new Prov("P248", "HP", "Yuliana Belén","belen@hp.com", "OIFF345678", "55009988","Rojo Goméz 78"));
		prove.add(new Prov("P249", "DELL", "Fernanda Martinez","fer_mtz@dell.com", "AFEC345678", "12331233","Santa fe 67"));
		prove.add(new Prov("P250", "APPLE", "Ernesto Trujillo","ernesto@mac.com", "IOPF345678", "5566445544","LA los 97"));
		prove.add(new Prov("P251", "ASUS", "Ulisise Montiel","uli@asus.com", "MNV345678", "55909090","Ecatepec 5667"));
		prove.add(new Prov("P252", "Lenovo", "Jire ALmazan","jire@lenovo.com", "LLKM345678", "55777766","Chalco 8767"));
		prove.add(new Prov("P253", "Liberpool", "Fernando Mondragón","fer@lpool.com", "MIPAN345678", "99889900","Liverpool Tezontle 80"));
		prove.add(new Prov("P254", "Palacio de Hierro", "Sheila Garcia","sheila@palhi.com", "SUSU45678", "5534342168","Palacio de Hierro Central s/n"));
		modelo.addAttribute("prove",prove);
		return "proveedor";
		
	}
	
	@GetMapping("venta")
	public String venta(Model modelo) {
		List<Venta> venta= new ArrayList<Venta>();
		venta.add(new Venta("V-0001","C-1001","03/01/2020","1500.65","240.10","90","1830.75"));
		
		venta.add(new Venta("V-0002","C-1002","12/01/2020","20000.00","3200","150","23350"));
		venta.add(new Venta("V-0003","C-1003","08/02/2020","14999","2399.84","90","17488.84"));
		venta.add(new Venta("V-0004","C-1004","23/03/2020","12500","2000","120","14620"));
		venta.add(new Venta("V-0005","C-1005","21/04/2020","8600","1376","100","10076"));
		venta.add(new Venta("V-0006","C-1006","06/05/2020","10000","1600","60","11660"));
		venta.add(new Venta("V-0007","C-1007","09/06/2020","7300","1168","50","8518"));
		venta.add(new Venta("V-0008","C-1008","30/07/2020","9120","1459.2","100","10679.2"));
		venta.add(new Venta("V-0009","C-1009","07/08/2020","8050","1288","30","9368"));
		venta.add(new Venta("V-0010","C-1010","31/09/2020","4400","704","90","5194"));
		
		modelo.addAttribute("venta", venta);
		
		return "venta";
	}
	@GetMapping("ticket")
	public String Ticket(Model modelo) {
		List<Ticket> ticket =new ArrayList<Ticket>();
		ticket.add(new Ticket("T-0001", "V-0001","S-10", "1","1830.75"));
		ticket.add(new Ticket("T-0001", "V-0002","S-20", "3","23350"));
		ticket.add(new Ticket("T-0001", "V-0003","S-30", "2","17488.84"));
		ticket.add(new Ticket("T-0001", "V-0004","S-40", "1","14620"));
		ticket.add(new Ticket("T-0001", "V-0005","S-50", "1","10076"));
		ticket.add(new Ticket("T-0001", "V-0006","S-60", "1","11660"));
		ticket.add(new Ticket("T-0001", "V-0007","S-70", "1","8518"));
		ticket.add(new Ticket("T-0001", "V-0008","S-80", "1","10679.2"));
		ticket.add(new Ticket("T-0001", "V-0009","S-90", "1","9368"));
		ticket.add(new Ticket("T-0001", "V-0010","S-100", "1","5194"));

		
		modelo.addAttribute("ticket", ticket);
		return "ticket";
	}
	

}
