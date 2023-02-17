package com.groupc.hms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import app.reception.AppReceptionServiceImpl;
import app.reception.vo.WardVO;
import app.reception.vo.MedicalReceiptVO;
import app.reception.vo.MedicalRecordVO;
import app.reception.vo.PrescriptionVO;
import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@RestController
public class AppReceptionController {
	@Autowired private AppReceptionServiceImpl service;
	
	
	//전체예약리스트
	@RequestMapping(value ="/apointmentList.re", produces ="text/html;charset=utf-8")
	public String search_appointment(String time, String doctor_name) {
		HashMap<String, String> map = new HashMap<>();
		map.put("time", time);
		map.put("doctor_name", doctor_name);

		return new Gson().toJson(service.search_appointment(map));
	}
	
	//입원기록 조회
	@RequestMapping(value ="/ward.re", produces ="text/html;charset=utf-8")
	public String search_admission(int id) {
		List<WardVO> wardlist = service.search_ward(id);
		return new Gson().toJson(wardlist);
	}
	
	
	  //처방기록 조회  
	  @RequestMapping(value ="/prescription.re", produces="text/html;charset=utf-8") 
	  public String search_prescription(int id) {
	  List<PrescriptionVO> presList = service.search_prescription(id); 
	  return new Gson().toJson( presList); 
	  }
	

	  //진료기록 조회 by id
	  @RequestMapping(value ="/medical_record_id.re", produces="text/html;charset=utf-8") 
	  public String search_medicalrecord(int id) {
	  List<MedicalRecordVO> recordlist = service.search_medical_record_id(id);
	 
	  return new Gson().toJson( recordlist); 
	  }
	 

	  //상세 진료기록 조회 by map
	  @RequestMapping(value ="/medical_record.re", produces="text/html;charset=utf-8") 
	  public String search_medicalrecord(int id,
	  String from, String to) { HashMap<String, Object> map = new HashMap<>();
	  map.put("id", id); 
	  map.put("from", from); 
	  map.put("to", to);
	  return new Gson().toJson( service.search_medical_record(map));
	  };
	 
	
	
	//환자예약정보 조회
	@RequestMapping(value ="/appointment.re", produces ="text/html;charset=utf-8")
	public String search_patient_appointment(int id) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();
		List<MedicalReceiptVO> appointmentlist = service.search_patient_appointment(id);
		return gson.toJson( appointmentlist);		
	}
	
	//환자인적사항 조회(by id )
		@RequestMapping(value ="/id.re", produces ="text/html;charset=utf-8")
		public String search_patient_id(int id) {
			List<PatientVO> list = service.search_patient_id(id);
			return new Gson().toJson(list);
		}
	//환자인적사항 조회(by name )
	@RequestMapping(value ="/patient.re", produces ="text/html;charset=utf-8")
	public String search_patient(String name) {
		List<PatientVO> list = service.search_patient(name);
		return new Gson().toJson(list);
	}
	
	//로그인 하기	
	@RequestMapping(value ="/login.re", produces ="text/html;charset=utf-8")
	public String login(String id, String pw) {
			HashMap<String, String> map = new HashMap<>();
			map.put("id", id);
			map.put("pw", pw);
		return new Gson().toJson(service.login_staff(map));
	}

}