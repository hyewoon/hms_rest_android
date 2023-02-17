package app.reception.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PrescriptionVO {
	int prescription_record_id, medical_record_id, patient_id;
	String treate_date,treate_day, time, treatment_name, 
	patient_name,doctor_name ,department_name, memo;
		
}
