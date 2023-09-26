package com.project.web.Dto;



import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RoominfoDTO {
		
		private int count;
		private String si_type,si_content, si_photo1,si_photo2,si_photo3,si_photo4,id;
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public String getSi_type() {
			return si_type;
		}
		public void setSi_type(String si_type) {
			this.si_type = si_type;
		}
		public String getSi_content() {
			return si_content;
		}
		public void setSi_content(String si_content) {
			this.si_content = si_content;
		}
		public String getSi_photo1() {
			return si_photo1;
		}
		public void setSi_photo1(String si_photo1) {
			this.si_photo1 = si_photo1;
		}
		public String getSi_photo2() {
			return si_photo2;
		}
		public void setSi_photo2(String si_photo2) {
			this.si_photo2 = si_photo2;
		}
		public String getSi_photo3() {
			return si_photo3;
		}
		public void setSi_photo3(String si_photo3) {
			this.si_photo3 = si_photo3;
		}
		public String getSi_photo4() {
			return si_photo4;
		}
		public void setSi_photo4(String si_photo4) {
			this.si_photo4 = si_photo4;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		
}
