package com.springexam.exam.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springexam.exam.domain.Member;

@Repository
public class ExamDaoImpl implements ExamDao {

	@Autowired
	@Override
	public ArrayList<Member> memberList() {
		return null;
	}

}
