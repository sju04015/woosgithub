package com.springexam.exam.dao;

import java.util.ArrayList;

import com.springexam.exam.domain.Member;

public interface ExamDao {
	public abstract ArrayList<Member> memberList();
}
