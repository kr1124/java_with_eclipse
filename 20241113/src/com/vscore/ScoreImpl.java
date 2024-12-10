package com.vscore;

import java.util.Iterator;
import java.util.Vector;

import buf.cio;

public class ScoreImpl implements Score {
	private Vector<ScoreVO> list = new Vector<ScoreVO>();
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		cio.wnlf("\n �ڷ� �߰� ...........");
		String code;
		
		cio.wf("�й� �Է� : ");
		code = cio.rl();
		
		ScoreVO temp = readScore(code);
		
		if(temp != null) {
			cio.wnlf("��ϵ� �й��� �̹� ���� �մϴ�.");
			return ;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setCode(code);

		cio.wf("�̸� : ");
		vo.setName(cio.rl());
		cio.wf("������� : ");
		vo.setBirth(cio.rl());
		cio.wf("���� : ");
		vo.setKor(cio.rli());
		cio.wf("���� : ");
		vo.setEng(cio.rli());
		cio.wf("���� : ");
		vo.setMat(cio.rli());
		
		list.add(vo);
		cio.wnlf("�ڷ� �߰� �Ϸ� .......\n");
	}

	@Override
	public void update() {
		cio.wnl("�ڷ� ����");
		cio.wf("������ �й� �Է� : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}

		cio.wf("�̸� : ");
		vo.setName(cio.rl());
		cio.wf("������� : ");
		vo.setBirth(cio.rl());
		cio.wf("���� : ");
		vo.setKor(cio.rli());
		cio.wf("���� : ");
		vo.setEng(cio.rli());
		cio.wf("���� : ");
		vo.setMat(cio.rli());
		
		
		cio.wnlf("���� �Ϸ�");
	}

	@Override
	public void delete() {
		cio.wnl("�ڷ� ����");
		cio.wf("������ �й� �Է� : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		//������ ���� ����
		list.remove(vo);
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		cio.wnlf("\n ��ü ���.... ");
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			cio.wnlf(vo.toString());
			
		}
	}

	@Override
	public void searchCode() {
		cio.wnl("�й� �˻�");
		cio.wf("�˻��� �й� �Է� : ");
		String code = cio.rl();
		
		ScoreVO vo = readScore(code);
		
		if(vo == null) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		cio.wnlf(vo.toString());
		
	}

	@Override
	public void searchName() {
		cio.wnl("�̸� �˻�");
		cio.wf("�˻��� �̸� �Է� : ");
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
