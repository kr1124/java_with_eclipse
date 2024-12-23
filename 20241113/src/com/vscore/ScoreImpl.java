package com.vscore;

import java.util.Iterator;
import java.util.Vector;

import buf.cio;

public class ScoreImpl implements Score {
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		cio.wnlf("\n 자료 추가 ...........");
		String code;
		
		cio.wf("학번 입력 : ");
		code = cio.rl();
		
		ScoreVO temp = readScore(code);
		
		if(temp != null) {
			cio.wnlf("등록된 학번이 이미 존재 합니다.");
			return ;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setCode(code);

		cio.wf("이름 : ");
		vo.setName(cio.rl());
		cio.wf("생년월일 : ");
		vo.setBirth(cio.rl());
		cio.wf("국어 : ");
		vo.setKor(cio.rli());
		cio.wf("영어 : ");
		vo.setEng(cio.rli());
		cio.wf("수학 : ");
		vo.setMat(cio.rli());
		
		list.add(vo);
		cio.wnlf("자료 추가 완료 .......\n");
	}

	@Override
	public void update() {
		cio.wnl("자료 수정");
		cio.wf("수정할 학번 입력 : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("등록된 자료가 없습니다.");
			return;
		}

		cio.wf("이름 : ");
		vo.setName(cio.rl());
		cio.wf("생년월일 : ");
		vo.setBirth(cio.rl());
		cio.wf("국어 : ");
		vo.setKor(cio.rli());
		cio.wf("영어 : ");
		vo.setEng(cio.rli());
		cio.wf("수학 : ");
		vo.setMat(cio.rli());
		
		
		cio.wnlf("수정 완료");
	}

	@Override
	public void delete() {
		cio.wnl("자료 삭제");
		cio.wf("삭제할 학번 입력 : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("등록된 자료가 없습니다.");
			return;
		}
		
		//삭제를 위한 구문
		list.remove(vo);
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		cio.wnlf("\n 전체 출력.... ");
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			cio.wnlf(vo.toString());
			
		}
	}

	@Override
	public void searchCode() {
		cio.wnl("학번 검색");
		cio.wf("검색할 학번 입력 : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("등록된 자료가 없습니다.");
			return;
		}
		
		cio.wnlf(vo.toString());
		
	}

	@Override
	public void searchName() {
		cio.wnl("이름 검색");
		cio.wf("검색할 이름 입력 : ");
		String name = cio.rl();

		for(ScoreVO vo : list) {
			if(vo.getName().equals(name)) {
				return;
			}
		}

	}
	
	public ScoreVO readScore(String code) {
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			if(temp.getCode().equals(code)) {
				vo = temp;
				break;
			}
		}
		
		return vo;
	}

}
