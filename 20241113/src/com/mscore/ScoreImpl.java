package com.mscore;

import java.util.*;

import buf.cio;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new TreeMap<>();
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		cio.wnlf("\n �ڷ� �߰� ...........");
		String code;
		
		cio.wf("�й� �Է� : ");
		code = cio.rl();
		
		if(map.containsKey(code)) {
			cio.wnlf("��ϵ� �й��� �̹� ���� �մϴ�.");
			return ;
		}
		
		ScoreVO vo = new ScoreVO();

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
		
		map.put(code, vo);
		cio.wnlf("�ڷ� �߰� �Ϸ� .......\n");
	}

	@Override
	public void update() {
		cio.wnl("�ڷ� ����");
		cio.wf("������ �й� �Է� : ");
		String code = cio.rl();
		
		if(!map.containsKey(code)) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}

		ScoreVO vo = map.get(code);
		
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

		if(!map.containsKey(code)) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		//������ ���� ����
		map.remove(code);
		
		cio.wnlf("���� �Ϸ�");
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		cio.wnlf("\n ��ü ���.... ");
		Iterator<String> it = map.keySet().iterator(); 
		
		while (it.hasNext()) {
			String code = it.next();
			ScoreVO vo = map.get(code);
			cio.wnlf(vo.toString());
			
		}
	}

	@Override
	public void searchCode() {
		cio.wnl("�й� �˻�");
		cio.wf("�˻��� �й� �Է� : ");
		String code = cio.rl();
		
		if(!map.containsKey(code)) {
			cio.wnlf("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		
		cio.wnlf(map.get(code).toString());
	}

	@Override
	public void searchName() {
		cio.wnl("�̸� �˻�");
		cio.wf("�˻��� �̸� �Է� : ");
		String name = cio.rl();

		Iterator<String> it = map.keySet().iterator(); 
		
		while (it.hasNext()) {
			String code = it.next();
			ScoreVO vo = map.get(code);
			
			if(vo.getName().startsWith(name)) {
				//�̸� ã��
				return;
			}
			
		}
		
		//�̸� ����
		return;

	}
}
