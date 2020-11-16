package com.example.demo.modelo;

public class Prov {
		private String idProv;
		private String compania;
		private String contacto;
		private String email;
		private String rfc;
		private String tel;
		private String direc;
		public Prov(String idProv, String compania, String contacto, String email, String rfc, String tel,
				String direc) {
			super();
			this.idProv = idProv;
			this.compania = compania;
			this.contacto = contacto;
			this.email = email;
			this.rfc = rfc;
			this.tel = tel;
			this.direc = direc;
		}
		public String getIdProv() {
			return idProv;
		}
		public void setIdProv(String idProv) {
			this.idProv = idProv;
		}
		public String getCompania() {
			return compania;
		}
		public void setCompania(String compania) {
			this.compania = compania;
		}
		public String getContacto() {
			return contacto;
		}
		public void setContacto(String contacto) {
			this.contacto = contacto;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getRfc() {
			return rfc;
		}
		public void setRfc(String rfc) {
			this.rfc = rfc;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getDirec() {
			return direc;
		}
		public void setDirec(String direc) {
			this.direc = direc;
		}
		
		
}
