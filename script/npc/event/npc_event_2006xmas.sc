//==============================================================================
// Ragnarok Online XmasEvent2006 Script     by AthenaDev
//==============================================================================
xmas_in.gat,87,91,6	script	�J�v���f�B�t�H���e�[	117,{
	cutin "kafra_01",2;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "��������Ⴂ�܂�";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	mes "�����A�N���X�}�X���Ԍ���";
	mes "�u���b�s���O�T�[�r�X�v��";
	mes "���񋟂��Ă���܂��B";
	next;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "�F�B��Ƒ��A���l�ɓ��ʂȑ��蕨��";
	mes "���������ׂ̈ɁA�v���[���g�{�b�N�X��";
	mes "���ƃ��{���ł���݂��Ă���܂��B";
	mes "�܂�������łȂ��A�����̕���";
	mes "�����O���v���[���g�{�b�N�X��";
	mes "�L�����Ă���܂��B";
	next;
	mes "[�J�v���f�B�t�H���e�[]";
	mes "�u���b�s���O�T�[�r�X�v�̓N���X�}�X";
	mes "���Ԓ��ɍޗ������p�ӂ��������";
	mes "�ǂȂ��ł������p�ɂȂ�܂��B";
	mes "�z����`���������֐S�����߂�";
	mes "���蕨���Ȃ��肽����΁A����";
	mes "�J�v���E���ɂ��\���t�����������B";
	close2;
	cutin "kafra_01",255;
	end;
}

xmas_in.gat,87,89,6	script	�J�v���e�[�����O	116,{
	cutin "kafra_02",2;
	mes "[�J�v���e�[�����O]";
	mes "�N���X�}�X���Ԍ���J�v���T�[�r�X";
	mes "�u���b�s���O�T�[�r�X�v�ł��I";
	mes "�ǂȂ����󂯎���Ă�������";
	mes "��΂��Ǝv���܂��B";
	next;
	switch (select("�v���[���g�{�b�N�X����ł�������","���������ł�")) {
	case 1:
		if(countitem(644)<1 || countitem(7174)<1 || countitem(7175)<1) {
			mes "[�J�v���e�[�����O]";
			mes "���b�s���O�T�[�r�X�̂����p�ɂ́A";
			mes "���p�ӂ��Ă������������������܂��B";
			mes "���͑��̂��q�l�̕��Ƃ�";
			mes "�������܂��̂Ő\���󂠂�܂��񂪁A";
			mes "�K�v�ޗ��Ɋւ��Ă͎��̂��΂ɂ���";
			mes "�J�v���\�����ɂ��q�˂��������B";
			break;
		}
		mes "[�J�v���e�[�����O]";
		mes "���b�s���O�T�[�r�X��";
		mes "�����p���肪�Ƃ��������܂��B";
		mes "���q�l�̐S���`���悤";
		mes "�F���Ă���܂��B�ł́A";
		mes "�^�S�����߂Ă���݂��܂��傤�B";
		next;
		mes "[�J�v���e�[�����O]";
		mes "���҂������܂����B";
		mes "������ɂȂ�܂��B";
		mes "�����Q���ꂽ�ޗ��ł���݂��܂����B";
		mes "�����Ă��q�l�̂����O��";
		mes "�L�����܂����̂ŁA������";
		mes "���S���`���Ǝv���܂��B";
		delitem 644,1;
		delitem 7174,1;
		delitem 7175,1;
		set Zeny,Zeny-1000;
		if(BaseLevel<50)
			set '@itemid,664;
		if(BaseLevel>=50 && BaseLevel<70)
			set '@itemid,665;
		if(BaseLevel>=70 && BaseLevel<90)
			set '@itemid,666;
		if(BaseLevel>=90)
			set '@itemid,667;
		getitem2 '@itemid,1,1,0,0,254,0,getcharid(0),(getcharid(0)>>16)&0xffff;
		next;
		mes "[�J�v���e�[�����O]";
		mes "�܂�����������蕨���������܂�����";
		mes "���ł�����������Ă��������B";
		break;
	case 2:
		mes "[�J�v���e�[�����O]";
		mes "����݂��������蕨���������܂�����";
		mes "���ł�����������Ă��������B";
		break;
	}
	close2;
	cutin "kafra_02",255;
	end;
}

xmas_in.gat,87,87,6	script	�J�v���\����	115,{
	cutin "kafra_03",2;
	mes "[�J�v���\����]";
	mes "����ɂ���";
	mes "�J�v���o���X�y�V�����T�[�r�X";
	mes "�u���b�s���O�T�[�r�X�I�v";
	mes "�����p�ɕK�v�ȍޗ������������܂��̂�";
	mes "�������蕷���ď������Ă��������B";
	next;
	mes "[�J�v���\����]";
	mes "�܂��A���q�l���������";
	mes "�v���[���g�{�b�N�X1�����K�v�ł��B";
	mes "��ޑ��蕨���̂��Ȃ���";
	mes "�����ł��܂��񂩂�ˁB";
	next;
	mes "[�J�v���\����]";
	mes "�����āA����{���ƕ����1����";
	mes "�K�v�ɂȂ�܂��B�ŏ��A������";
	mes "������p�ӂ��Ă����̂ł���";
	mes "�c�c�q�ɂɂ��܂��Ă������ޗ���";
	mes "���҂��ɓ��܂�Ă��܂����̂ł��B";
	next;
	mes "[�J�v���\����]";
	mes "�����I�������̏�ɂ�����c�c";
	mes "�������o�V�b�ƕ߂܂���";
	mes "�v�������艣����";
	mes "�R��΂��ē˂���΂��āc�c";
	next;
	mes "[�J�v���\����]";
	mes "�n�b�A���͈�̉����c�c�H";
	mes "���A���̂��q�l�A";
	mes "���̘b�͖Y��Ă��������ˁB���ق�B";
	mes "���ꂩ���萔���Ƃ���1000Zeny��";
	mes "�K�v�ł��B����͂��q�l�̂����O��";
	mes "�L�����邽�߂̔�p�ƂȂ�܂��B";
	next;
	mes "[�J�v���\����]";
	mes "����ł͕K�v�Ȃ��̂𐮗����܂��B";
	mes "^3131FF�v���[���g�{�b�N�X1��";
	mes "����{��1��";
	mes "���1��";
	mes "1000Zeny^000000";
	next;
	mes "[�J�v���\����]";
	mes "�ȏ�̍ޗ����S�đ����܂�����";
	mes "�e�[�����O�ɂ��\���t�����������B";
	mes "�J�v���T�[�r�X�̓N���X�}�X��";
	mes "���q�l�̂��΂ɂ��܂��B";
	close2;
	cutin "kafra_03",255;
	end;
}

xmas_in.gat,112,86,4	script	�J�v���r�j�b�g	114,{
	cutin "kafra_04",2;
	mes "[�J�v���r�j�b�g]";
	mes "����ɂ��́A�J�v���T�[�r�X�ł��B";
	mes "���q�l�����ɁA����̎����̔閧��";
	mes "��������Ƃ��������Ⴂ�܂��B";
	mes "���������閧�ł��Ȃ���ł�";
	mes "���ǂˁc�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�����̃J�v���q�ɂ��P������";
	mes "�q���B�̌C���Ɍ����J����";
	mes "�v���[���g�𓐂����Ƃ��Ă���";
	mes "�̂́A���N�����ꂽ�A���\�j�Ƃ���";
	mes "�T���^���Ƃ����܂��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�l�X�́A�A���\�j���T���^�ɂȂ�";
	mes "���߂̌P�����h���ē����o����";
	mes "�񂾂Ǝv���Ă��܂����A";
	mes "���͂�������Ȃ���ł���B";
	mes "�����������b�ł́A�A���\�j��";
	mes "�c�����Ɍ���������Ƃ��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�N���X�}�X�ɂ́A�q���B�̓T���^�����";
	mes "�v���[���g�����炢�܂������A";
	mes "�A���\�j�̂��������";
	mes "�u�T���^�Ȃ�Ă��Ȃ��v";
	mes "�ƌ����Ă��ăv���[���g��";
	mes "�����Ȃ������݂����Ȃ�ł��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "����ŁA���N���̎����ɂȂ��";
	mes "�K�������Ȏq�����ƂĂ���������";
	mes "�݂����Ȃ�ł���B";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�V�B�[�b�I";
	mes "���̐l�ɕ����ꂿ�Ⴄ����";
	mes "����܂��񂩂�c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "���́A�A���\�j�̂��������";
	mes "�����̂��߂̂����Ő�����";
	mes "���F�̔��𔃂��Ă��Ă�";
	mes "�����őS���J��������Ă�";
	mes "�炵����ł��c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "���̂܂ܕs�K�ȗc��������߂�����";
	mes "�A���\�j������āA�K�������Ȑl��";
	mes "���ނ悤�ɂȂ����������ł��B";
	mes "�A���\�j�̂�������͂���ł�";
	mes "�����⎇�F�̔��̖��͂�";
	mes "���߂��ꂽ�܂܂������݂����ł����B";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "�����āA�A���\�j�͍��A";
	mes "���e�B�G�ŉ��������ł���";
	mes "�݂����Ȃ�ł��B";
	mes "���������������悤�Ƃ��Ă����";
	mes "������c�c";
	next;
	mes "[�J�v���r�j�b�g]";
	mes "������낵����΁A�T���^�̂ڂ�����";
	mes "���Ԃ��������X�^�[�B��ގ�����";
	mes "����܂��񂩁H";
	mes "���B�̑q�ɂ��P�����̂������炭";
	mes "�A���\�j�̈ꖡ�ł��傤����c�c";
	close2;
	cutin "kafra_04",255;
	end;
}

xmas_in.gat,97,99,4	script	�J�v���O�����X	113,{
	cutin "kafra_05",2;
	callfunc "KafraMain",1,0x42,0,0,0,0,0,0,100,0;
	end;
}

xmas_in.gat,87,102,0	script	�J�v���v	112,{
	cutin "kafra_06",2;
	if(countitem(2636) || countitem(2637)) {
		mes "[�J�v���v]";
		mes "�d�����I�������J���܂��ˁ[�B";
		mes "���肪�Ƃ��I";
		mes "�����[�N���X�}�X�[�I";
		close2;
		cutin "kafra_06",255;
		end;
	}
	mes "[�J�v���v]";
	mes "����ɂ��͂��[�B";
	mes "�J�v���T�[�r�X�̂����p";
	mes "���肪�Ƃ��������܂��B";
	mes "�����[�N���X�}�X�[�I";
	next;
	mes "[�J�v���v]";
	mes "���̓e�[�����O�o������";
	mes "���Ƃ̂���`�������Ă��܂��[�B";
	mes "���̂��d���͕���ꂽ���ɖ��O��";
	mes "�������Ƃł��B����̏�ɏ����̂�";
	mes "�v���[���g���J������A�Ӗ���";
	mes "�Ȃ��Ȃ����Ⴂ�܂����ǂˁB";
	next;
	mes "[�J�v���v]";
	mes "�{���͊y�����N���X�}�X�c�c";
	mes "�̂͂��Ȃ̂ɑq�ɂ̕���";
	mes "�����l�����ɓ��܂ꂿ��������";
	mes "�������݋C���Ȃ�ł��[�B";
	mes "����`��c�c���d�������邩��";
	mes "���C���o���Ȃ��Ⴂ���Ȃ��̂Ɂc�c";
	next;
	switch (select("�v���[���g�ɖ��O�������Ă�������","�w�ւɖ��O�������Ă�������","���C���o���Ă��������I")) {
	case 1:
		mes "[�J�v���v]";
		mes "�v���[���g�ɖ��O�������ė~�����Ȃ�";
		mes "�������ɂ���e�[�����O�o������";
		mes "��𗊂�ł��������B";
		mes "���͕���ɖ��O�������Ă������";
		mes "����������Ȃ��ł����[�B";
		close2;
		cutin "kafra_06",255;
		end;
	case 2:
		emotion 28;
		mes "[�J�v���v]";
		mes "�w�ւł����`�H����ȕ���";
		mes "���O�����ރT�[�r�X�͂��Ă܂���B";
		mes "�����łȂ��Ă��A����ɖ��O��";
		mes "�����Ă΂��肢�邩��肪�ɂ��ł��[�B";
		mes "�V�N�V�N�c�c";
		mes "�݂�ȍK�������ł����ȁB";
		close2;
		cutin "kafra_06",255;
		end;
	}
	//case3��fall through
	mes "[�J�v���v]";
	mes "�����A�C���������ł����肪�Ƃ��B";
	mes "�ł����C���o�Ȃ���ł��c�c";
	mes "���e�B�G�ɏo�����Ă��Ƃ�";
	mes "�ƂĂ��y���݂ɂ��Ă���ł����ǂˁB";
	mes "�T���^�̂ڂ����������";
	mes "�C�������ނ�ł��[�B";
	next;
	if(select("�������C�ɂ��Ă����܂�","�撣���Ă��������I")==2) {
		mes "[�J�v���v]";
		mes "�Ђ����A�Ђ����c�c";
		mes "�b�����ł������Ă���Ă��肪�Ƃ��B";
		mes "�����[�N���X�}�X�[�I";
		close2;
		cutin "kafra_06",255;
		end;
	}
	emotion 28;
	mes "[�J�v���v]";
	mes "�{���ł����[�H";
	mes "�V�N�V�N�c�c";
	mes "�ǂ�Ȃ��Ƃ����Ă�����ł����H";
	mes "�V�N�V�N�c�c";
	next;
	switch (select("�v���[���g�{�b�N�X�������܂�","�T���^�̂ڂ����������܂�","�L���������̂��Ă����܂�","�����ȃ_���X��x���Ă����܂�")) {
	case 1:
		//�ǂ̎�ނ�PBox�������ĂȂ��A�������͋��E�₢����̎w�ւ������ĂȂ��Ȃ�true
		if((countitem(664)<1 && countitem(665)<1 && countitem(666)<1 && countitem(667)<1) ||
									(countitem(2610)<1 && countitem(2611)<1)) {
			mes "[�J�v���v]";
			mes "�m��Ȃ��l���畨����������";
			mes "�킯�ɂ͂����Ȃ��ł��[�B";
			mes "���o���񂽂��ɓ{���Ă��܂��܂��B";
			mes "���v�ł�����A";
			mes "�C���g��Ȃ��ł��������B";
			break;
		}
		emotion 28;
		mes "[�J�v���v]";
		mes "�V�N�V�N�c�c";
		mes "���ꂢ�ɕ�܂ł��Ă���";
		mes "�厖�ȃv���[���g������";
		mes "������Ă�������ł����H";
		next;
		if(select("�����[�N���X�}�X�I","����ς肠���܂���")==2) {
			emotion 28;
			mes "[�J�v���v]";
			mes "�����`��c�c";
			break;
		}
		emotion 15;
		mes "[�J�v���v]";
		mes "�킠�`�A���肪�Ƃ��[�I";
		mes "���[�������������ł��[�B";
		mes "����Ȃɑ厖�ȕ�����������������ɂ�";
		mes "����������������Ȃ���";
		mes "�����Ȃ��ł��ˁB";
		next;
		mes "[�J�v���v]";
		mes "���A�w�ւ������Ă����ł����B";
		mes "���Ⴀ�A���̎w�ւɖ��O��";
		mes "�����Ă����܂��B";
		mes "���ւցc�c";
		mes "�����Ȃ񂩂���Ȃ��ł���[�B";
		next;
		mes "[�J�v���v]";
		mes "���A���̎w�ւ������Ă���ꍇ��";
		mes "���̎w�ւɏ������Ⴂ�܂��B";
		mes "�����A���̎w�ւƋ�̎w�ւ�";
		mes "�����Ă��āA��̎w�ւ̕���";
		mes "���O�������Ăق���������";
		next;
		mes "[�J�v���v]";
		mes "���̎w�ւ͂ǂ����ɂ�������";
		mes "���Ă��������ˁB";
		next;
		switch (select("���̎w�ւɏ�����","��̎w�ւɏ�����","������Ƃ܂��Ă�")) {
			case 1:
				set '@itemid,2610;
				set '@gain,2636;
				break;
			case 2:
				set '@itemid,2611;
				set '@gain,2637;
				break;
			case 3:
				mes "[�J�v���v]";
				mes "�͂��A���҂����Ă܁[���B";
				close2;
				cutin "kafra_06",255;
				end;
		}
		if(countitem('@itemid)<1) {
			mes "[�J�v���v]";
			mes "����H" +getitemname('@itemid)+ "�A�����Ă��Ȃ�";
			mes "�݂����ł����ǁ[�B";
			break;
		}
		if('@itemid==2611 && countitem(2610)) {
			mes "[�J�v���v]";
			mes "������Ƒ҂��Ă��������B";
			mes "���̎w�ւ������Ă�݂����ł���B";
			mes "���̎w�ւ͂������Ă��Ă���������";
			break;
		}
		mes "[�J�v���v]";
		mes "�͂��A���Ꮡ�����Ⴂ�܂��B";
		mes "�J�L�J�L�J�L�J�L�c�c";
		next;
		mes "[�J�v���v]";
		mes "�͂��A�ǂ����B";
		mes "�v���[���g�A�{���ɂ��肪�Ƃ��I";
		mes "�����[�N���X�}�X�[�I";
		delitem '@itemid,1;
		if(countitem(664))
			delitem 664,1;
		else if(countitem(665))
			delitem 665,1;
		else if(countitem(666))
			delitem 666,1;
		else
			delitem 667,1;
		getitem2 '@gain,1,1,0,0,254,0,getcharid(0),(getcharid(0)>>16)&0xffff;
		break;
	case 2:
		emotion 6;
		mes "[�J�v���v]";
		mes "�c�c�������ł�!!";
		break;
	case 3:
		mes "[�J�v���v]";
		mes "�c�c�{���͉̂����Ƃ�";
		mes "���ӂ���Ȃ���ł���H";
		mes "�����ł���A�������Ȃ��āI";
		break;
	case 4:
		emotion 9;
		mes "[�J�v���v]";
		mes "�c�c�c";
		next;
		emotion 9;
		mes "^FF0000�s���R�s���R�s���R�A�L���b�L���b";
		mes "�^�^�b�^�^�^�b�^�A�p���p���p���I^000000";
		next;
		mes "[�J�v���v]";
		mes "�����A�V�N�V�N�c�c";
		next;
		emotion 28;
		mes "[�J�v���v]";
		mes "�V�N�V�N�V�N�V�N�c�c";
		break;

	}
	close2;
	cutin "kafra_06",255;
	end;
}

//==============================================================
// ���o�[�g���C�̔����i
//==============================================================
xmas_in.gat,93,97,0	script	���o�[�g���C	873,{
	mes "[���o�[�g���C]";
	mes "�΂����̂ɂ��ꂽ���O�̕@��";
	mes "��ɂȂ�قǌ����Ă�@��";
	next;
	emotion 23;
	emotion 23,"";
	mes "[���o�[�g���C]";
	mes "�܂������I";
	mes "�N���΂����̂��I";
	mes "�ӂ��������āI";
	next;
	mes "[���o�[�g���C]";
	mes "����c�c����͎��炵���B";
	mes "�ŋ߂͖���Ȏq���������Ăȁc�c";
	next;
	mes "[���o�[�g���C]";
	mes "�Ƃ���ŁA�N��";
	mes "�u�΂����̂ɂ��ꂽ�@�v��";
	mes "�{���̉��l��m���Ă��邩�ˁH";
	next;
	if(select("����","�m���Ă��܂�")==1) {
		mes "[���o�[�g���C]";
		mes "�ł́A�u�s�G���̕@�v������";
		mes "�����̎p���q�ϓI�Ɍ����܂��B";
		close;
	}
	mes "[���o�[�g���C]";
	mes "����Ȃ�b�������I";
	mes "���̓N���X�}�X�̂��߂ɁA";
	mes "���ʂȃA�C�e�����J�������̂��B";
	next;
	mes "[���o�[�g���C]";
	mes "�Ⴊ�~��ς���N���X�}�X��";
	mes "�T���^��������`��";
	mes "���O�̕@�����邢�����";
	mes "���S���ă\���ɏ�����";
	next;
	mes "[���o�[�g���C]";
	mes "�̎��ʂ�A�ꐡ��������Ȃ���̒���";
	mes "���ɖ���Ȃ��悤���邭�Ƃ炵�Ă����";
	mes "�A�C�e���A�u�g�i�J�C�̕@�v";
	mes "���Ȃ�ޗ���������΂����ɂł�";
	mes "����Ă����悤�B";
	mes "�ǂ����邩�ˁH";
	next;
	if(select("�����Ȃ��ł�","���肢���܂��I")==1) {
		mes "[���o�[�g���C]";
		mes "�ӂ�I";
		mes "�N���܂�Ȃ��l�Ԃ̈�l���B";
		close;
	}
	mes "[���o�[�g���C]";
	mes "�قق��c�c�����Ԏ����B";
	mes "�ł́A�ޗ��������悤�B";
	next;
	mes "[���o�[�g���C]";
	mes "�܂��A�x�[�X�ƂȂ�^0000FF�s�G���̕@ 1��^000000�A";
	mes "���邢�����o�����߂�";
	mes "^0000FF���������_�C�������h 2��^000000�A";
	mes "���̌����ێ�������^0000FF���̕� 1��^000000�A";
	mes "�ȏオ�K�v�ƂȂ�B";
	next;
	mes "[���o�[�g���C]";
	mes "�ł́A�ޗ����W�߂Ă���񂾁B";
	mes "���͂����ő҂��Ă��邩��ȁB";
	next;
	if(select("�ޗ���������x�����Ă�������","��ɓ���Ă��܂����I")==2) {
		mes "[���o�[�g���C]";
		mes "�����b�I";
		mes "�Ȃ��Ȃ��s���͂�����ł͂Ȃ����I";
		mes "�ł́A���������m�F���悤�B";
		next;
		if(countitem(2262) && countitem(733) >= 2 && countitem(1001)) {
			mes "[���o�[�g���C]";
			mes "�悵�A�悵�B";
			mes "�S��������Ă���ȁB";
			next;
			mes "[���o�[�g���C]";
			mes "�ł́A������������Ă����悤�I";
			mes "�܂��͂��̑��������_�C�������h��";
			mes "���ɂ��Ȃ���΂Ȃ�Ȃ��B";
			next;
			mes "[���o�[�g���C]";
			mes "�_�C�������h�Ƃ�����΂��������āA";
			mes "�����瑹�����Ă����Ƃ��Ă��A";
			mes "���ʂ̕��@�Ŋ���Ȃ�ĕs�\���B";
			next;
			emotion 23;
			misceffect 101;
			mes "[���o�[�g���C]";
			mes "�������I�@���̒��N�̗F�I";
			mes "�z���O�c�c���ق��ق��ق�c�c";
			mes "����c�c�F���狳���Ă������";
			mes "���̗͂��g���΁A����Ȃ��̂�";
			mes "�ȒP�Ɋ��邱�Ƃ��ł���I";
			mes "�u�V���b�N�v����̂��|�C���g���I";
			next;
			misceffect 72;
			mes "[���o�[�g���C]";
			mes "�����A���͂��̃s�G���̕@��";
			mes "���ɂ����_�C�������h��U��T���I";
			mes "��]�����Ȃ��疞�ՂȂ�����񂾁B";
			next;
			misceffect 273;
			mes "[���o�[�g���C]";
			mes "�Ō�ɁA���̕���U��T���I";
			next;
			emotion 18;
			mes "[���o�[�g���C]";
			mes "�悵�A�������I";
			mes "�K���ɍ���Ă���悤�Ɍ��������낤��";
			mes "����Ȃ��Ƃ͂Ȃ��I";
			mes "�N�ɂ��^���o���Ȃ��Z�p��";
			mes "��g���Ă���̂��I";
			next;
			mes "[���o�[�g���C]";
			mes "�����A�󂯎��Ȃ����B";
			mes "����ŌN���A�F�l������";
			mes "�y�����N���X�}�X���������Ƃ����B";
			delitem 2262,1;
			delitem 733,2;
			delitem 1001,1;
			getitem 5204,1;
			close;
		}
		mes "[���o�[�g���C]";
		mes "�c�c�H";
		mes "�ޗ���p�ӂ����񂶂�Ȃ��̂��ˁH";
		mes "�Y�ꂽ�Ȃ������x�������B";
		next;
	}
	mes "[���o�[�g���C]";
	mes "�܂��A�x�[�X�ƂȂ�^0000FF�s�G���̕@ 1��^000000�A";
	mes "���邢�����o�����߂�";
	mes "^0000FF���������_�C�������h 2��^000000�A";
	mes "���̌����ێ�������^0000FF���̕� 1��^000000�A";
	mes "�ȏオ�K�v�ƂȂ�B";
	next;
	mes "[���o�[�g���C]";
	mes "�ł́A�ޗ����W�߂Ă���񂾁B";
	close;
}

//==============================================================
// ���e�B�G�ɋ����I
//==============================================================
xmas.gat,147,95,5	script	�`�F���X	97,{
	mes "[�`�F���X]";
	mes "�N���X�}�X���L�O���āA";
	mes "���i�����Ȃ�����";
	mes "�v���؂��č������Ă݂܂��񂩁I";
	mes "�l�Ă�Łu���̋C�������󂯂Ƃ��āI�v";
	next;
	mes "[�`�F���X]";
	mes "���N����؂ɂ��Ă���";
	mes "���̗��S���ǂ�����ē`���悤���c�c";
	mes "�����O�ɃP���J�����F�B��";
	mes "�ǂ�����Ē����肵�悤���c�c";
	next;
	mes "[�`�F���X]";
	mes "���ł������̂ł��I";
	mes "������������������Ȃ�";
	mes "������D�̃`�����X�I";
	next;
	mes "[�`�F���X]";
	mes "�X�e�B�b�N�L�����f�B���";
	mes "���K�z�������݂����܂��I";
	mes "���e�B�G���ɋ������炢�傫�Ȑ��ŁA";
	mes "�����̖{���������Ă݂Ă��������I";
	next;
	if(select("�܂����x��","���K�z����݂��Ă��������I")==1) {
		mes "[�`�F���X]";
		mes "�N���X�}�X���Ԓ������Ƃ��܂��̂ŁA";
		mes "���ł����Ă��������ˁI";
		close;
	}
	if(countitem(530) < 1) {
		mes "[�`�F���X]";
		mes "�X�e�B�b�N�L�����f�B��";
		mes "�����Ă��Ă��������I";
		mes "��������A���̃��K�z����";
		mes "���݂����܂���I";
		close;
	}
	delitem 530,1;
	mes "[�`�F���X]";
	mes "�킩��܂����I";
	mes "���K�z���̎g�����͊ȒP�ł��B";
	mes "�E�C���o���č�������I";
	mes "�������ꂾ���ł��I";
	next;
	mes "[�`�F���X]";
	mes "�Ⴆ�΁A����Ȋ����ł��I";
	next;
	switch(rand(5)) {
	case 0: announce "���������ƌ������Ă���������������!!!!",9,0x63FFCE; break;
	case 1: announce "���͉��A�J�v���v����D���Ȃ񂾂�������������!!!!",9,0x63FFCE; break;
	case 2: announce "�������͂�����l�ň�Ȃ񂾂���������������!!!!",9,0x63FFCE; break;
	case 3: announce "�����ƑO����N�̂��Ƃ��D���ł�����������������!!!!",9,0x63FFCE; break;
	case 4: announce "������ƃ��f�B�[�^�j�[�ɉ�ɍs���Ă��܂�!!!!",9,0x63FFCE; break;
	}
	mes "[�`�F���X]";
	mes "�����A�v�̂͂킩��܂������H";
	mes "���x�͂��Ȃ��̔Ԃł���I";
	next;
	mes "[�`�F���X]";
	mes "1�I";
	next;
	mes "[�`�F���X]";
	mes "1�I";
	mes "2�I";
	next;
	mes "[�`�F���X]";
	mes "1�I";
	mes "2�I";
	mes "3!!";
	next;
	mes "[�`�F���X]";
	mes "1�I";
	mes "2�I";
	mes "3!!";
	mes "�ǂ����I";
	next;
	input '@mes$;
	announce strcharinfo(0)+ "�l�̌��t�F" +'@mes$,9,0x63FFCE;
	next;
	mes "[�`�F���X]";
	mes "�ǂ��ł����H";
	mes "�C�����̓X�b�L�����܂������H";
	next;
	mes "[�`�F���X]";
	mes "�܂����������������Ƃ��ł�����";
	mes "���ł����Ă��������B";
	mes "�X�e�B�b�N�L�����f�B���";
	mes "�F����̋C�����͉����ł��I";
	close;
}

//==============================================================
// �ďP�I�\���R�c
//==============================================================
prontera.gat,155,285,3	script	�G���W���C#Xmas	753,{
	switch(XMAS_1EVE) {
	case 0:
		mes "[�G���W���C]";
		mes "�����Ȃ肾�����₾�B";
		mes "���O�̓N���X�}�X��N��";
		mes "���������肾�H";
		next;
		switch(select("�F�B�ƈꏏ�Ɂc�c","�Ƒ��ƈꏏ�Ɂc�c","���l�ƈꏏ��","����Ȃ��ƕ�����!!")) {
		case 1:
			mes "[�G���W���C]";
			mes "�������A�������I";
			mes "�F�B�ƈꏏ�ɂ��ȁI";
			mes "�ِ��̗F�B�Ɠ�l�Ȃ킯�Ȃ���ȁI";
			mes "���񂤂�B";
			mes "���ɂ͂킩���Ă��邼�B";
			next;
			mes "[�G���W���C]";
			mes "����̓N���X�}�X��F�B�Ɗy����";
			mes "�N�ւ̑��蕨���I";
			mes "�����[�N���X�}�X�I";
			break;
		case 2:
			mes "[�G���W���C]";
			mes "�������I";
			mes "�N���X�}�X�͉Ƒ��̊Ԃ��J��";
			mes "�[�߂Ă����d�v�ȍs���̈�Ȃ̂��I";
			next;
			mes "[�G���W���C]";
			mes "�悵�I";
			mes "����̓N���X�}�X���Ƒ��Ɗy����";
			mes "�N�ւ̑��蕨���I";
			mes "�����[�N���X�}�X�I";
			break;
		case 3:
			misceffect 42;
			mes "[�G���W���C]";
			mes "�c�c�c�c";
			next;
			misceffect 43;
			mes "[�G���W���C]";
			mes "�c�c�c�c�c�c";
			next;
			misceffect 254;
			mes "[�G���W���C]";
			mes "�c�c�c�c�c�c�c�c";
			next;
			misceffect 328;
			misceffect 1,"";
			heal -(Hp-1),-(Sp-1);
			mes "[�G���W���C]";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�Ƃ��ƂƏ�����A���̈�����!!";
			close2;
			warp "prontera.gat",155,230;
			end;
		case 4:
			mes "[�G���W���C]";
			mes "�����[���������悤���ȁc�c";
			next;
			mes "[�G���W���C]";
			mes "�����A����Ō��C���o���Ƃ����B";
			mes "�����[�N���X�}�X�B";
			break;
		}
		set XMAS_1EVE,1;
		getitem 12200,1;
		close;
	case 1:
		mes "[�G���W���C]";
		mes "��H�@�����H";
		mes "�v���[���g�͂����������B";
		mes "����Ƃ��A�����ʂ̗p�Ȃ̂��H";
		next;
		if(select("���ɉ����c�c","���N�͂��Ȃ��̂ł����H")==1) {
			mes "[�G���W���C]";
			mes "����ȂɉɂȂ�";
			mes "������Ȃ��đ��̓z�̂Ƃ��ɂ����I";
			close;
		}
		mes "[�G���W���C]";
		mes "�������������񂾁H";
		next;
		menu "�J�b�v���ւ̓V���ł��I",-;
		mes "[�G���W���C]";
		mes "�����b�I";
		mes "�Â��ɂ���I";
		next;
		mes "-�ނ͍Q�ĂĔ�т������Ă��āA";
		mes "���Ȃ��̌�����ōǂ���-";
		mes "-�����ď����Ȑ��Ō�����-";
		next;
		mes "[�G���W���C]";
		mes "�c�c�����H";
		mes "���O�A�܂��\���Ȃ̂��H";
		mes "��Ȃ��t�𑗂��Ă���Ȃ��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		mes "���������G���W���C�����";
		mes "���l�ł��ł�����ł����H";
		next;
		mes "[�G���W���C]";
		mes "��k�������ȁI";
		mes "���̂ǂ�������";
		mes "����ȍl�����v�����񂾁I";
		next;
		misceffect 330;
		mes "[�G���W���C]";
		mes "�������I�@���O�͈������ȁI";
		mes "�Ƃ��ƂƏ�����A���̈�����!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������I";
		mes "����A������Ƒ҂��Ă��������I";
		mes "����͂Ȃ��ł���!?";
		mes "���ł���Ȃɓ{���ł���!?";
		next;
		mes "[�G���W���C]";
		mes "���l�Ȃ�Ă������t���y�X����";
		mes "���ɂ��邩�炾�I";
		mes "���͌ւ肠��\�������̓����҂��I";
		mes "�J�b�v���Ȃ�āc�c�J�b�v���Ȃ��";
		mes "��x�������܂����Ȃ��";
		mes "�v�������Ƃ͂Ȃ��I";
		next;
		mes "[�G���W���C]";
		mes "�J�b�v���Ȃ�āc�c";
		mes "�J�b�v���Ȃ�āc�c�c�c";
		mes "�c�c�E�b�c�c";
		next;
		mes "-�ނ͍Q�ĂĊ���グ��-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�G���W���C����c�c�H";
		next;
		misceffect 328;
		misceffect 1,"";
		percentheal -50,0;
		mes "[�G���W���C]";
		mes "�c�c�b�I";
		mes "�܂������̂��I";
		mes "�Ƃ��ƂƏ�����A���̈�����!!";
		set XMAS_1EVE,2;
		close2;
		warp "prontera.gat",155,230;
		end;
	default:
		misceffect 328;
		misceffect 1,"";
		percentheal -50,0;
		mes "[�G���W���C]";
		mes "�܂������̂��I";
		mes "�Ƃ��ƂƏ�����A���̈�����!!";
		close2;
		warp "prontera.gat",155,230;
		end;
	}
}

prontera.gat,155,237,0	script	�莆#Xmas1	844,3,3,{
	if(XMAS_1EVE < 2) {
		mes "-�莆�������Ă���-";
		close;
	}
	if(XMAS_1EVE >= 3) {
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c����́c�c";
		mes "�������I";
		mes "���Ԃ��W�߂āA����ꏊ��";
		mes "�����ƌ����Ă���̂��I";
		next;
		emotion 5,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ȃ�c�c�ŏ��ɍs���̂́c�c";
		mes "���̐l�����鏊���I";
		close;
	}
	mes "-�G���W���C���񂩂��";
	mes "���b�Z�[�W�̂悤��-";
	next;
	if(select("�ǂ�Ō���","�ǂ܂Ȃ�")==2) {
		mes "-���̂��ǂ܂Ȃ�����-";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "����������Ă�񂾂낤�c�c�H";
	next;
	mes "-���Ȃ��͂��ꂢ�ɐ܂肽���܂ꂽ";
	mes "�����L���Ă݂�-";
	next;
	mes "���N���c�c�n���̋G�߂�����ė���!!";
	mes "���Ă��₽�������̂̒���ʂ蔲���A";
	mes "�̂̐c�܂ŗ�₳��A�S�̉���܂�";
	mes "��������\��������I";
	mes "�N���X�}�X���J�b�v�������̓�����";
	mes "��̒N�����߂��Ƃ����̂�!!!!";
	next;
	mes "�u�N���X�}�X�͉Ƒ��ƈꏏ�Ɂv�Ƃ���";
	mes "���������t���f���Ȃ�����A�f�[�g��";
	mes "�o�����閅����������������B";
	next;
	mes "�₵���Ɛ킢�Ȃ���A�������̂���";
	mes "���P���ł����悤���Ǝv���Ă��܂�";
	mes "�n���̂悤�Ȉ����ς킵��������A";
	mes "��Ȃ���������I";
	next;
	mes "���̉����N�B�̑����";
	mes "�吺�ŋ��ڂ��I";
	mes "���N�̃N���X�}�X�́c�c";
	mes "��X�������!!";
	mes "��X���y���ނ̂��[!!!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�I�A�I�I�[�b!!";
	mes "�c�c����ɂ��Ă��c�c";
	mes "�ǂ����Ă킴�킴����Ȏ莆�ŁH";
	next;
	if(select("�����薰���c�c","������ǂ�")==1) {
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c����ǂ�ł����";
		mes "���������Ȃ��Ă��܂��c�c";
		close;
	}
	mes "��X�́A�f���ɁI";
	mes "�����Ċy�����V�Ԃ̂�!!";
	next;
	mes "�����A���̌v��͋��N���";
	mes "�����ƐÂ��ɁA�v����";
	mes "�i�߂Ȃ���΂Ȃ�Ȃ��I";
	next;
	mes "���̂Ȃ�A���N�̍��ɂ����";
	mes "��X�͏�ɖڂ�t�����Ă���I";
	mes "���̐����̂��߂ɂ́A";
	mes "�������閧�ێ��Ɛ��ʉ��ł�";
	mes "���ʂ̖����s�����K�v�s���Ȃ̂�";
	mes "�Y���ȁI";
	next;
	mes "�����e���R��Ȃ��悤��";
	mes "^0000FF���Ԃ̈�l��l�Ƀq���g��������B";
	mes "��X�̍����s�̏�^000000�܂ŁA";
	mes "�N��l�����鎖�����A�W�܂��Ăق����I";
	next;
	mes "���͈ꑫ��ɑ҂��Ă���I";
	mes "�y���ȃJ�b�v���ɓV�����I";
	next;
	mes "�c�c�Ȃ��A���̎莆��";
	mes "�����I�ɏ�������B";
	next;
	mes "-3-";
	next;
	mes "-3-";
	mes "-2-";
	next;
	mes "-3-";
	mes "-2-";
	mes "-1-";
	next;
	mes "-3-";
	mes "-2-";
	mes "-1-";
	mes "-^FF00000^000000-";
	next;
	misceffect 183;
	emotion 23,"";
	percentheal -30,0;
	set XMAS_1EVE,3;
	close;
OnTouch:
	if(XMAS_1EVE != 2)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "���́H";
	mes "�ǂ����ăG���W���C�����";
	mes "����Ȃɓ{���Ă��!?";
	next;
	mes "-�������Ă��邠�Ȃ��̖ڂ�";
	mes "�n�ʂɗ����Ă��鉽�����f����-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�H";
	mes "����́c�c�H";
	close;
}

prontera.gat,188,177,4	script	�n�b�s�[	869,{
	if(XMAS_1EVE <= 3) {
		emotion 28;
		mes "[�n�b�s�[]";
		mes "���N���I�@���N�܂ł��I";
		mes "�_�͉������̂Ă��I";
		mes "�z���O�����܂ł����������̂Ă��I";
		if(XMAS_1EVE != 3)
			close;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�n�b�s�[����H";
		next;
		mes "[�n�b�s�[]";
		mes "�����H�@�΂������Ȃ�΂��΂���!!";
		mes "���N�����͂Ɛ��B���������A";
		mes "�N���X�}�X�ɂ�������̂�";
		mes "�N�z�z�z�z�Ƃ������t�������I";
		mes "���O�ɂ͗����ł��Ȃ�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�b�s�[����I";
		mes "�G���W���C���񂪍��N���c�c";
		next;
		mes "-���Ȃ��͍Q�ĂČ�����A";
		mes "������C�ɂ��Ȃ���";
		mes "�n�b�s�[�ɐ���������-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�G���W���C���񂪁c�c";
		mes "���������Ă��܂���ł������H";
		next;
		mes "[�n�b�s�[]";
		mes "�c�c���O�I";
		mes "�G���W���C�����m���Ă���̂�!?";
		next;
		mes "[�n�b�s�[]";
		mes "�c�c�悵�B";
		mes "�G���W���C���񂩂玩���̎���";
		mes "�����ɂ���l�ւ̓`����";
		mes "���܂�Ă���B";
		mes "�悭�����Ă����񂾁B";
		next;
		mes "[�n�b�s�[]";
		mes "����́A^0000FF�Ԓd^000000�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���H";
		mes "���A���ł����āH";
		next;
	}
	mes "[�n�b�s�[]";
	mes "^0000FF�Ԓd^000000�I";
	next;
	mes "[�n�b�s�[]";
	mes "���͂��ꂵ�������Ă��Ȃ��B";
	mes "��͑��̒��Ԃ����ɕ����Ă݂�񂾁B";
	next;
	mes "[�n�b�s�[]";
	mes "�ł́A����̂��̏�ŉ���I";
	if(XMAS_1EVE == 3)
		set XMAS_1EVE,4;
	close;
}

prontera.gat,62,339,3	script	�����[	875,{
	if(XMAS_1EVE <= 4) {
		mes "[�����[]";
		mes "�y�R�����A�y�R�����B";
		mes "�����͂ǂ��𑖂��Ă݂悤���H";
		mes "���܂ł���������l��";
		mes "�r��̂悤�Ȃ��̐��E�𑖂낤�B";
		mes "�������A�������悤�I";
		if(XMAS_1EVE != 4)
			close;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c�����[����H";
		next;
		mes "[�����[]";
		mes "�����I�@�M�l��!!";
		mes "���̃y�R������";
		mes "�l���m�肪�������񂾁I";
		mes "�����`�A�|�������낤�y�R�����H";
		mes "���v�A���v������ˁ`�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̃y�R�y�R�c�c�Y����c�c";
		mes "����A������B";
		mes "�G���W���c�c";
		next;
		mes "[�����[]";
		mes "�Ȃɂ��������I";
		mes "���Ƃ��Y���Ƃ��Ă��A";
		mes "����Ȃɉ����y�R�����Ȃ�";
		mes "��薳�����I";
		mes "�킩�������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���c�c�͂��c�c";
		mes "�Ƃ���ŁA�G���W���C����";
		mes "�����[����ɉ����c�c";
		next;
		mes "[�����[]";
		mes "�G���W���C���񂾂���!?";
		mes "�������c�c���������̂��B";
		mes "�Ȃ�A�悭�����Ă����񂾁B";
		next;
		mes "[�����[]";
		mes "^0000FF�x���`�̉�^000000�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A���H";
		mes "���̉��ł����H";
		next;
	}
	mes "[�����[]";
	mes "^0000FF�x���`�̉�^000000�I";
	next;
	mes "[�����[]";
	mes "�����m���Ă���̂͂��ꂾ�����B";
	mes "��͑��̒��Ԃ����ɕ����Ă݂�񂾁B";
	next;
	mes "[�����[]";
	mes "�ł́A����̂��̏�ŉ���I";
	if(XMAS_1EVE == 4)
		set XMAS_1EVE,5;
	close;
}

prontera.gat,163,66,7	script	�N���X	748,{
	if(XMAS_1EVE <= 5) {
		mes "[�N���X]";
		mes "�n�[�u���I�@�|�[�V�������I";
		mes "�\���ł������J�[�ɂȂ�����";
		mes "���ɋ����Ă��񂾁I";
		mes "���ɂ͉�������Ȃ��I";
		mes "�����ƁA�����Ɩ������I";
		if(XMAS_1EVE != 5)
			close;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c�N���X����H";
		next;
		mes "[�N���X]";
		mes "���H�@��H�@�N���N�́I";
		mes "����A�]�v�Ȏ����l���Ă�ɂ͂Ȃ��I";
		mes "�b������ȁI";
		next;
		mes "[�N���X]";
		mes "�c�c�ł��c�c";
		mes "����ȕ��ɘb�����������";
		mes "���̂����肪�����c�c";
		mes "���A���܂����I";
		mes "�܂��]�v�Ȏ����l���Ă��܂����I";
		mes "����ǂ��낶��Ȃ��񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������Ă��������I";
		mes "���͂����G���W���C����";
		mes "�����`�����c�c";
		next;
		mes "[�N���X]";
		mes "�G���W���C�H";
		mes "�G���W���C������Č��������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ł��B";
		mes "�G���W���C���񂪃N���X�����";
		mes "�����`�����c���܂���ł������H";
		next;
		mes "[�N���X]";
		mes "��������ȓ����H";
		mes "�����A�������A������!!";
		mes "�����n�[�u���W�߂āA";
		mes "�|�[�V�����΂������Ă��������ŁA";
		mes "��������Y��Ă����I";
		mes "�悵�A�悭�����Ă����񂾁B";
		next;
		mes "[�N���X]";
		mes "^0000FF���������^000000�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@�Ȃ�ł����āH";
		next;
	}
	mes "[�N���X]";
	mes "^0000FF���������^000000�I";
	next;
	mes "[�N���X]";
	mes "�����m���Ă���̂͂��ꂾ�����B";
	mes "��͑��̒��Ԃ����ɕ����Ă݂�񂾁B";
	next;
	mes "[�N���X]";
	mes "�ł́A����̂��̏�ŉ���I";
	if(XMAS_1EVE == 5)
		set XMAS_1EVE,6;
	close;
}

prontera.gat,35,209,5	script	�}�X	881,{
	if(XMAS_1EVE <= 6) {
		emotion 23,"";
		mes "[�}�X]";
		mes "�c�c�c�c";
		mes "������D������A�J�v�����o�l�`!!";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i���܂�ւ�肽���Ȃ��l������c�c�j";
		next;
		mes "[�}�X]";
		mes "����A�킩���Ă��A�e�B�[�x�B";
		mes "���̑O�A�T�L���o�X���o�l���l��";
		mes "�n�[�g���΂��Ă�����ˁB";
		mes "�l�����ꂩ��͊X�̊O��";
		mes "�o��悤�ɂ����c�c";
		mes "�q�q�b�A�q�q�q�q�b�c�c�B";
		next;
		emotion 29;
		mes "-�ނ́A�����̉E��Ɏ���";
		mes "�����Ɍ������A�ɂ�ɂ₵�Ȃ���";
		mes "�b�������Ă���-";
		if(XMAS_1EVE != 6)
			close;
		next;
		emotion 28,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�}�A�}�X����c�c";
		mes "�G���W���C���񂩂牽��";
		mes "�����Ă��܂��񂩁H";
		mes "�i���̐l�͂�΂��I�@��΂�����I�j";
		next;
		mes "[�}�X]";
		mes "�ӂӁA�����������A�e�B�[�x�B";
		mes "�J�v���T�[�r�X�͂����F�l��";
		mes "���΂ɂ���񂾂��Ă��B";
		mes "�p���������炸�A�f����";
		mes "�u���Ȃ��̂��΂ɂ������ł��v";
		mes "���Č����Ηǂ��̂Ɂc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A���́c�c";
		mes "�G���W���C���񂩂牽��";
		mes "���܂�Ă��܂��񂩁H";
		mes "�i����ς肱�̐l�͋�肾�I�j";
		next;
		mes "[�}�X]";
		mes "�c�c^0000FF������̃��b�Z�[�W^000000�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A���H";
		mes "���Ȃ�āH";
		next;
	}
	mes "[�}�X]";
	mes "^0000FF������̃��b�Z�[�W^000000�B";
	next;
	mes "[�}�X]";
	mes "�t�t�t�B�킩��Ȃ��U�������";
	mes "���x���l�̐��𕷂����Ƃ���Ȃ�ĂˁB";
	mes "������������A�˂��H�@�e�B�[�x�B";
	mes "�N�b�N�b�N�b�N�b�N�b�B";
	next;
	mes "[�}�X]";
	mes "����A�����͌���̏�Łc�c";
	mes "�t�t�t�c�c";
	if(XMAS_1EVE == 6)
		set XMAS_1EVE,7;
	close;
}

prt_fild05.gat,355,254,0	script	�莆#Xmas2	844,3,3,{
	if(XMAS_1EVE < 7) {
		mes "-�莆�������Ă���-";
		close;
	}
	if(XMAS_1EVE >= 8) {
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c�܂����c�c";
		mes "�A�C�e�����W�߂āA����ꏊ��";
		mes "�����ƌ����Ă���̂��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�m���A�C�e���́c�c";
		mes "^0000FF�؋� 5��";
		mes "�؂̐ߖ� 5��";
		mes "�Ö؂̎} 1��^000000";
		mes "���������ȁc�c";
		next;
		emotion 5,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�����āc�c";
		mes "^0000FF���ƐX���o��ꏊ";
		mes "���̏����Ȕ�ѐ΂ɏW��^000000";
		mes "�c�c���[��c�c";
		mes "�悵�A��̑z���������I";
		close;
	}
	mes "-�G���W���C���񂩂��";
	mes "���b�Z�[�W�̂悤��-";
	next;
	if(select("�ǂ�Ō���","�ǂ܂Ȃ�")==2) {
		mes "-���ƂȂ��ǂ܂Ȃ�����-";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "���x�͉���������Ă�񂾂낤�c�c�H";
	next;
	mes "-���Ȃ��͂��ꂢ�ɐ܂肽���܂ꂽ";
	mes "�����L���Ă݂�-";
	next;
	mes "�悭�����܂ŗ����I";
	mes "���ɏ����Ă��镨���W�߁A";
	mes "�閧�̏ꏊ�܂ŗ��Ăق����I";
	next;
	mes "^0000FF�؋� 5��";
	mes "�؂̐ߖ� 5��";
	mes "�Ö؂̎} 1��^000000";
	next;
	mes "^0000FF���ƐX���o��ꏊ";
	mes "���̏����Ȕ�ѐ΂ɏW��^000000";
	next;
	mes "���͈ꑫ��ɑ҂��Ă���I";
	mes "�y���ȃJ�b�v���ɓV�����I";
	next;
	mes "�Ȃ��A���̎莆��";
	mes "�����I�ɏ�������B";
	next;
	mes "-3-";
	next;
	mes "-3-";
	mes "-2-";
	next;
	mes "-3-";
	mes "-2-";
	mes "-1-";
	next;
	mes "-3-";
	mes "-2-";
	mes "-1-";
	mes "-^FF00000^000000-";
	next;
	misceffect 183;
	emotion 23,"";
	percentheal -30,0;
	set XMAS_1EVE,8;
	close;
OnTouch:
	if(XMAS_1EVE != 7)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "�Ԓd�A�x���`�̉��A����������A";
	mes "������̃��b�Z�[�W�H";
	mes "��̂ǂ��������Ƃ��낤�c�c";
	next;
	mes "-�������Ă��邠�Ȃ��̖ڂ�";
	mes "�n�ʂɗ����Ă��鉽�����f����-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�H";
	mes "����́c�c�H";
	close;
}

prt_fild05.gat,101,160,0	script	��ѐ�#Xmas	139,3,3,{
	if(XMAS_1EVE != 8)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "^0000FF���ƐX���o��ꏊ";
	mes "���̏����Ȕ�ѐ΂ɏW��^000000";
	mes "���̕ӂ̎����ȁc�c�H";
	next;
	mes "[??????]";
	mes "�c�c�����I�@���O�I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���H�@�N�ł����I";
	next;
	mes "[??????]";
	mes "�w�������A�C�e����";
	mes "�����ƏW�߂Ă����̂��I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���A�G���W���C����H";
	mes "�G���W���C����ł��ˁI";
	mes "�ǂ��ɂ����ł����H";
	next;
	mes "[??????]";
	mes "����ɓ�����񂾁I";
	mes "�A�C�e���͏W�߂Ă����̂�!?";
	next;
	if(select("�܂��ł��c�c","�����ɁI")==1) {
		mes "[??????]";
		mes "�������Ă���I";
		mes "�����W�߂Ă���񂾁I";
		close;
	}
	if(countitem(1019) < 5 || countitem(7222) < 5 || countitem(604) < 1) {
		mes "[??????]";
		mes "�ǂ��ɂ���Ƃ����̂��I";
		mes "�����Ă���Ȃ炿���ƌ����Ă݂�I";
		close;
	}
	mes "[??????]";
	mes "�悵�I�@�������������ȁI";
	mes "����ł͎n�߂�Ƃ��悤!!";
	hideonnpc;
	hideoffnpc "�G���W���C#Xmas";
	hideoffnpc "�n�b�s�[#Xmas";
	hideoffnpc "�����[#Xmas";
	hideoffnpc "�N���X#Xmas";
	hideoffnpc "�}�X#Xmas";
	emotion 27,"�n�b�s�[#Xmas";
	emotion 27,"�����[#Xmas";
	emotion 27,"�N���X#Xmas";
	emotion 27,"�}�X#Xmas";
	close;
}

prt_fild05.gat,101,161,4		script	�G���W���C#Xmas	753,{
	if(XMAS_1EVE == 9) {
		mes "[�G���W���C]";
		mes "����c�c���܂��\���̗���͋����B";
		mes "�����I�@�\���ł��낤�ƁA";
		mes "�w�؂�L�΂��ĕ����関����";
		mes "���̎�ɒ͂ނ܂ŁI";
		mes "��ɐi�ނ̂��I�@���m������I";
		next;
		mes "[�G���W���C]";
		mes "�h�������ނ��̓��܂ŁI";
		mes "�\�����S�̕��������߂����̓��܂ŁA";
		mes "���̒���͉ʂĂ��Ȃ��������낤�B";
		mes "�͂��o���A��F��I";
		mes "�S����������܂ŁA�v�������y���߁I";
		set XMAS_1EVE,0;
		hideonnpc;
		close;
	}
	if(XMAS_1EVE != 8)
		end;
	if(countitem(1019) < 5 || countitem(7222) < 5 || countitem(604) < 1) {
		mes "[�G���W���C]";
		mes "�����I�@�A�C�e���������ĂȂ����I";
		mes "���O�����߂���Ă��邱�̎����A";
		mes "�J�b�v���ǂ��͊y�����N���X�}�X��";
		mes "���������Ə������Ă���̂��I";
		next;
		mes "[�G���W���C]";
		mes "^0000FF�؋� 5��^000000!!";
		mes "^0000FF�؂̐ߖ� 5��^000000!!";
		mes "^0000FF�Ö؂̎} 1��^000000!!";
		mes "�����W�߂Ă���񂾁I";
		hideonnpc;
		hideonnpc "�n�b�s�[#Xmas";
		hideonnpc "�����[#Xmas";
		hideonnpc "�N���X#Xmas";
		hideonnpc "�}�X#Xmas";
		hideoffnpc "��ѐ�#Xmas";
		close;
	}
	mes "[�G���W���C]";
	mes "���}���邼���N!!";
	next;
	mes "[�G���W���C]";
	mes "��l�g�Ƃ����̂�";
	mes "�܂�ō߂ł��邩�̂悤�ɁA";
	mes "�J�b�v�������̖ڂ�����A";
	mes "���Ԃ̖ڂ�����A";
	mes "���₩�ȋL�O���̓x��";
	mes "�A�ɒǂ�����Ă����\��������I";
	next;
	mes "[�G���W���C]";
	mes "�����ɂ܂�Ȃ����݁I";
	mes "�����J�b�v���Ƃ���������";
	mes "�܂�ŏ��҂̂悤�ɂӂ�܂�";
	mes "�n���҂ǂ��ɍ������������I";
	next;
	mes "[�G���W���C]";
	mes "����ȏ�I";
	mes "�\���Ƃ��������ŁI";
	mes "�s�҂̂悤�ɁI";
	mes "���������ĕ�炵�͂��Ȃ�!!";
	next;
	mes "[�G���W���C]";
	mes "�ߋ��Ɏ󂯂����I";
	mes "�炭���Ƃ��ł����A";
	mes "�U���Ă������S�ɖ������c���Ȃ��I";
	mes "�₵������Ƃ����āI";
	mes "�������ꂽ��͂��Ȃ�!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i�c�c���H";
	mes "�ߋ��Ɏ󂯂����H";
	mes "�U���Ă������S�H";
	mes "�₵���H�j";
	next;
	mes "-�s�v�c�����Ȃ��Ȃ��̊�����āA";
	mes "�݂�Ȃ������₢�Ă���-";
	next;
	mes "[�n�b�s�[]";
	mes "�G���W���C����A�ӂ�ꂽ�񂾂�B";
	next;
	mes "[�����[]";
	mes "�N���X�}�X�̏\���O�ɂȁB";
	next;
	mes "[�N���X]";
	mes "���܂�ď��߂ă\������Ȃ�";
	mes "�N���X�}�X���}���ꂻ���������̂ɂˁB";
	next;
	mes "[�}�X]";
	mes "�c�c�t�t�t�c�c";
	next;
	mes "[�G���W���C]";
	mes "�c�c�߂�Ȃ��Ƃ����Ȃ�I";
	mes "�����v���o���͂��Ȃ��I";
	mes "���ׂĂ̎v���o�I";
	mes "�����őS�ďĂ��s�����̂�!!!!";
	next;
	mes "[�ꓯ]";
	mes "�I�I�I�I�I�I�b!!!";
	next;
	mes "-�G���W���C�͑��̉e�ɉB���Ă�����";
	mes "�����΂Ɍ������āA�F�X�ȃA�C�e����";
	mes "��������-";
	next;
	mes "[�G���W���C]";
	mes "���X�Ɛ����čs���̂�!!";
	mes "��X�́A�ւ�ׂ��\���Ȃ̂�!!!!!!";
	next;
	mes "[�G���W���C]";
	mes "���̐S�I";
	mes "���݁I�@�{��I�@��Y!!";
	mes "�S�Ă�������!!!!";
	next;
	set XMAS_1EVE,9;
	set 'name$,strcharinfo(0);
	misceffect 330;
	hideonnpc;
	hideonnpc "�n�b�s�[#Xmas";
	hideonnpc "�����[#Xmas";
	hideonnpc "�N���X#Xmas";
	hideonnpc "�}�X#Xmas";
	initnpctimer;
	close;
OnTimer3000:
	announce "�ߋ��Ɏ󂯂����ɋ������ꂽ��͂��Ȃ�!!",9,0x73DEDE;
	monster "prt_fild05.gat",117,154,'name$+"�̍���",1062,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",117,155,'name$+"�̔��e",1062,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",117,156,'name$+"�̋�Y",1062,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",117,157,'name$+"�̓i��",1062,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",117,158,'name$+"�̐�]",1062,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",118,154,'name$+"�̓{��",1246,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",118,155,'name$+"�̍���",1246,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",118,156,'name$+"�̎�",1246,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",118,157,'name$+"�̏��S",1246,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",118,158,'name$+"�̑���",1246,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",119,154,'name$+"�̂ނ���",1245,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",119,155,'name$+"�̌Ǔ�",1245,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",119,156,'name$+"�̈�",1245,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",119,157,'name$+"�̍ق�",1245,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",119,158,'name$+"�̎��i",1245,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",120,154,'name$+"�̗J�T",1244,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",120,155,'name$+"����",1244,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",120,156,'name$+"�̚���",1244,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",120,157,'name$+"�̋�������",1244,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",120,158,'name$+"�̈���",1244,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",121,154,'name$+"�̔�������",1588,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",121,155,'name$+"�̔߂���",1588,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",121,156,'name$+"�̍U��",1588,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",121,157,'name$+"�̉e",1588,1,"�G���W���C#Xmas::OnKilled";
	monster "prt_fild05.gat",121,158,'name$+"�̌��",1588,1,"�G���W���C#Xmas::OnKilled";
	end;
OnTimer6000:
	announce "�\�������� " +'name$+ "�l�̐S�̒��ɂ���߂��݂̍����_���A��𕢂��s�����B",9,0x73DEDE;
	end;
OnTimer9000:
	announce "�C�܂���ȘA���Ȃ�đ҂��͂��Ȃ�!!",9,0x73DEDE;
	end;
OnTimer12000:
	announce "�U���Ă������S�ɖ����Ȃ�Ďc���Ȃ�!!",9,0x73DEDE;
	end;
OnTimer15000:
	announce "�₵���Ȃ�������Ƃ����āA�������ꂽ�肵�Ȃ�!!",9,0x73DEDE;
	end;
OnTimer18000:
	announce "�s�K�v�ȋL���͎v���o���Ȃ�!!",9,0x73DEDE;
	end;
OnTimer21000:
	announce "���́A�ւ肠��\���R�c����!!",9,0x73DEDE;
	end;
OnTimer180000:
	stopnpctimer;
	set 'name$,0;
	announce "�\���R�c���B���A�F�Ŋy�����N���X�}�X���}������悤�F��܂����B",9,0x73DEDE;
	killmonster "prt_fild05.gat","�G���W���C#Xmas::OnKilled";
	hideoffnpc;
	end;
OnKilled:	//�_�~�[�C�x���g
	end;
OnInit:
	hideonnpc;
	hideonnpc "�n�b�s�[#Xmas";
	hideonnpc "�����[#Xmas";
	hideonnpc "�N���X#Xmas";
	hideonnpc "�}�X#Xmas";
	end;
}

prt_fild05.gat,97,164,5		script	�n�b�s�[#Xmas	869,{}
prt_fild05.gat,103,163,4	script	�����[#Xmas	875,{}
prt_fild05.gat,103,159,1	script	�N���X#Xmas	748,{}
prt_fild05.gat,97,159,0		script	�}�X#Xmas	881,{}

//==============================================================
// �s�C���ȗ��c�c
//==============================================================
xmas.gat,152,290,3	script	�|�E	716,{
	switch(XMAS_2EVE) {
	case 0:
		mes "[�|�E]";
		mes "�����I";
		mes "���́I�@���́I";
		next;
		misceffect 1;
		mes "[�|�E]";
		mes "�����I�@���́I";
		mes "�������ƋN����I";
		mes "���́I�@���̂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��A�����Ă��!?";
		next;
		mes "[�|�E]";
		mes "�ȁA�Ȃ񂾂�B";
		mes "���񂽒N����!?";
		next;
		switch(select("���ƗE�C�̗E�ҁI","�ʂ肷����̎�","�ɂȖ��\�����ҁI")) {
		case 1:
			mes "[�|�E]";
			mes "�c�c�}�}����Ȃ��l�Ƃ�";
			mes "�b�������Ⴂ���Ȃ����Č����Ă��B";
			close;
		case 2:
			mes "[�|�E]";
			mes "�c�c���̂܂܂������s����B";
			close;
		case 3:
			break;
		}
		mes "[�|�E]";
		mes "���A���H�@�ɂȂ́H";
		mes "�F�B���Ȃ��́H";
		mes "�c�c���傤���Ȃ��Ȃ��B";
		mes "�l���F�B�ɂȂ��Ă����悤���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A������I";
		mes "���ɂ����ėF�B�͂��邩��B";
		mes "������ƍ��͈�l��";
		mes "�V��ł��邾���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������A�����������Ă��́H";
		mes "�J�o���������Ă����݂��������ǁc�c";
		mes "����Ȏ������Ⴂ���Ȃ���B";
		next;
		mes "[�|�E]";
		mes "�c�c�ł��A������";
		mes "�S�R�N���Ȃ��񂾁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�N���Ȃ��H";
		next;
		mes "-�q���͕����Ă����J�o����";
		mes "���Ȃ��Ɍ������ē˂��o����-";
		next;
		mes "[�|�E]";
		mes "���ɗ��������Ă�񂾁B";
		mes "�����ƈ�Ă�Ȃ玔���Ă���������";
		mes "�}�}�������Ă����ǁA";
		mes "��Ă悤�ɂ�������o�Ă��Ȃ��񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��H";
		mes "���̗��A�ǂ��Ŏ�ɓ���Ă����́H";
		next;
		mes "[�|�E]";
		mes "��c�c�G���ȁI";
		mes "����͂�������H��̋߂���";
		mes "�l���������񂾁B";
		next;
		mes "-�q���������Ă��ꂽ�J�o���̒��ɂ�";
		mes "�������Ƃ��Ȃ����������Ă���-";
		next;
		mes "[�|�E]";
		mes "�c�c����Ɂc�c���̗����E���Ă���A";
		mes "�ςȎ����N����悤�ɂȂ����񂾁B";
		next;
		mes "[�|�E]";
		mes "�l�̕�������钆��";
		mes "�N�������т͂˂�悤��";
		mes "�����������Ă��邳���Ƃ��c�c";
		mes "���������΂��悤�Ȑ���";
		mes "��������Ƃ��c�c";
		next;
		mes "[�|�E]";
		mes "��x�A�����x�b�g��";
		mes "����t���Ă��������ǁA";
		mes "���̂܂ɂ��K�i�ɂ��āA";
		mes "�p�p���]��ŉ��䂵���񂾁B";
		next;
		mes "[�|�E]";
		mes "����ŁA�p�p���}�}���{��������āA";
		mes "���g���킩��Ȃ�����ȗ��A";
		mes "�����̂Ă���Č����񂾁c�c";
		mes "�ł��c�c�ł��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����`��c�c";
		mes "�ł��A���̘b���킩��ȁB";
		mes "�ق�A���Ă悱�̗��̖͗l�B";
		mes "�Ȃ񂾂��c�c�s�C���c�c";
		mes "�����ɂł�������Ȃ���";
		mes "�����ƍ��������N���邩������Ȃ���H";
		next;
		mes "[�|�E]";
		mes "�G���Ȃ��Č����Ă邾��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���܂ł����Ȗ`�������Ă���";
		mes "���̘b���������炢�����Ă�B";
		mes "����͖{���Ɋ댯��������Ȃ��B";
		mes "���ʂ̐l�A�������N�݂�����";
		mes "�q������c�c";
		next;
		emotion 28;
		mes "[�|�E]";
		mes "�₾�I";
		mes "�����������s���I";
		mes "�s������������c�c";
		mes "����������������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����A�����Ȃ��ŁB";
		mes "�����Ȃ�Ƃ����Ă����邩��I";
		mes "�ˁH�@�����狃���Ȃ��ŁB";
		next;
		mes "[�|�E]";
		mes "�c�c�O�X�c�c";
		mes "�c�c�ǂ�����̂��B";
		next;
	case 1:
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��͂��̗���";
		mes "�򉻂��Ȃ��Ƃ����Ȃ��Ǝv���B";
		mes "��x�吹���Œ��ׂĂ݂邩��A";
		mes "���̗���݂��āc�c�c�c";
		next;
		emotion 28;
		mes "[�|�E]";
		mes "�₾�������������I";
		next;
		emotion 16,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���Ƃ����͖̂����݂���������A";
		mes "�Ƃ肠�������ɂ���";
		mes "�吹���܂ŕ����Ă����B";
		mes "���̊ԁA���ɕςȎ����N���Ȃ��悤";
		mes "�����ƌ������ĂĂˁB";
		if(XMAS_2EVE == 0)
			set XMAS_2EVE,1;
		close;
	case 3:
		misceffect 1;
		mes "[�|�E]";
		mes "�����I�@�����N����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A�X�g�b�v�A�X�g�b�v�I";
		mes "�ق�A������Ă�����I";
		mes "^0000FF�j���̕�^000000�B";
		mes "����łȂ�Ƃ��Ȃ�݂�������B";
		next;
		mes "[�|�E]";
		mes "���A�z���g�H";
		mes "���ꂪ����΂�����";
		mes "�ڂ��o�߂�́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���A���Ԃ�c�c";
		mes "���̃z�[���[������������";
		mes "������ƕs�������ǁc�c";
		mes "�����Ă݂鉿�l�͂����I";
		mes "�c�c�����Ɓc�c";
		next;
		mes "[�|�E]";
		mes "�����I�@��������Ă݂Ă�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���ꂶ��A������I";
		mes "�c�c�c�c";
		mes "�i�c�c���āA����ǂ�����Ďg���́H�j";
		next;
		switch(select("���ƈꏏ�ɐ��ɓ���ĕ�����","���Ɍ����󂯂ĕ�������","���̕\�ʂɕ���U��|����","���𐅂ɗn�����ēh�����")) {
		case 1:
			misceffect 302,"";
			mes "[" +strcharinfo(0)+ "]";
			mes "�i�������ȁH�j";
			mes "���𐅂ŗn������";
			mes "���ƈꏏ�ɕ������Ă݂悤�B";
			next;
			emotion 23;
			mes "[�|�E]";
			mes "��A��������񂾁I";
			mes "�l�̗�����łĐH�ׂ���肾�ȁI";
			mes "�S�I�@�����I�@�l�łȂ��I";
			mes "�������ɂ����I";
			close2;
			warp "xmas.gat",148,116;
			end;
		case 2:
			misceffect 194,"";
			mes "[" +strcharinfo(0)+ "]";
			mes "�i�������ȁH�j";
			mes "���̏�̕��Ɍ���������";
			mes "�������Ă݂悤�B";
			next;
			emotion 23;
			mes "[�|�E]";
			mes "��A��������񂾁I";
			mes "�l�̗����󂵂ĐH�ׂ���肾�ȁI";
			mes "�S�I�@�����I�@�l�łȂ��I";
			mes "�������ɂ����I";
			close2;
			warp "xmas.gat",148,116;
			end;
		case 3:
			break;
		case 4:
			misceffect 214,"";
			mes "[" +strcharinfo(0)+ "]";
			mes "�i�������ȁH�j";
			mes "���𐅂ɗn������";
			mes "�p�b�N�̂悤�ɓh���Ă݂悤�B";
			next;
			emotion 23;
			mes "[�|�E]";
			mes "��A��������񂾁I";
			mes "�l�̗��𒂑������ĐH�ׂ���肾�ȁI";
			mes "�S�I�@�����I�@�l�łȂ��I";
			mes "�������ɂ����I";
			close2;
			warp "xmas.gat",148,116;
			end;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�������ȁH�j";
		mes "�������̂܂ܗ��ɐU�肩���Ă݂悤�B";
		next;
		misceffect 77,"";
		emotion 0;
		emotion 0,"";
		mes "-���Ȃ���^0000FF�j���̕�^000000��";
		mes "�w�ł܂݁A���Ɍ�������";
		mes "�U�肩����-";
		next;
		mes "-�s�C���Ȗ͗l���`���ꂽ����";
		mes "�j���̕���U��|����ƁA";
		mes "�����������܂ꂽ�΂���̂悤��";
		mes "�Y��ȗ��ւƕω����Ă�����-";
		next;
		mes "[�|�E]";
		mes "�����c�c�����́H";
		mes "�����A�����͕ςȂ��Ƃ��Ȃ��́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���`��c�c�ǂ����ȁH";
		mes "�͗l�͏��������ǁA";
		mes "�܂����̒��g�������킩��Ȃ����c�c";
		mes "���̗������ɔC���Ă���Ȃ����ȁH";
		next;
		mes "[�|�E]";
		mes "���₾�I";
		mes "�l�͍��܂ň�l�������񂾁I";
		mes "�ǂ�ȃ����X�^�[�ł������B";
		mes "��▅���ق����񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ł��ˁA�������̗��̒���";
		mes "�����������Ȃ��悤�ȃ����X�^�[��";
		mes "�����Ă���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ς肻��Ȋ댯�ȗ���";
		mes "���ʂ̉ƒ�ɂ͒u���Ă����Ȃ���B";
		mes "������N�݂����ȏ����Ȏq����";
		mes "�Ȃ�����c�c";
		next;
		emotion 28;
		mes "[�|�E]";
		mes "���邳���I";
		mes "�l�̗��͐�΂ɓn���Ȃ�!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "�������Ȃ��c�c";
		mes "�ǂ�����΁c�c";
		next;
		emotion 5,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "���I�@�������I";
		mes "���Ⴀ�������悤�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������X�^�[��";
		mes "�e�C�~���O�ł����Ⴄ�f�G�ȃA�C�e����";
		mes "���̗����������悤��B";
		next;
		mes "[�|�E]";
		mes "�c�c�c�c";
		mes "�e�C�~���O�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A�e�C�~���O�I";
		mes "�C�ɓ����������X�^�[���e�C�~���O�I";
		mes "��▅�ɂ���Ȃ玩���̍D���Ȏq�B";
		mes "���̂ق��������ł���H";
		next;
		mes "[�|�E]";
		mes "�c�c�c�c���c�c��c�c";
		mes "�������ˁc�c";
		mes "����A����Ȃ炢����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�悵�I";
		mes "���ꂶ�Ⴀ��������";
		mes "�e�C�~���O�A�C�e����";
		mes "�T���Ă��邩��I";
		mes "������Ƃ����҂��ĂĂˁI";
		set XMAS_2EVE,4;
		close;
	case 4:
		mes "[�|�E]";
		mes "���ŁA�ǂ��Ȃ����́H";
		mes "�e�C�~���O�A�C�e�����Ă�";
		mes "�����Ă��Ă��ꂽ�́H";
		next;
		switch(select("�|����","�h���b�v�X","�|�|����","���i�e�B�b�N","�s�b�L","�T�x�[�W�x�x","�`�����`����","�X�|�A","�|�C�Y���X�|�A","�y�R�y�R","�X�`�[���`�����`����","�n���^�[�t���C",
				"�X���[�L�[","���b�J�[","�h�P�r","�f�U�[�g�E���t(�q)","�C�V�X","�v�e�B�b�g","���i�b�N","�{���S��","�I�[�N�E�H���A�[","�o�t�H���b�g.Jr","�f�r���`","�\�q�[","���[���[")) {
		case 1:
			set '@itemid,619;
			set '@mobname$,"�|����";
			break;
		case 2:
			set '@itemid,620;
			set '@mobname$,"�h���b�v�X";
			break;
		case 3:
			set '@itemid,621;
			set '@mobname$,"�|�|����";
			break;
		case 4:
			set '@itemid,622;
			set '@mobname$,"���i�e�B�b�N";
			break;
		case 5:
			set '@itemid,623;
			set '@mobname$,"�s�b�L";
			break;
		case 6:
			set '@itemid,627;
			set '@mobname$,"�T�x�[�W�x�x";
			break;
		case 7:
			set '@itemid,624;
			set '@mobname$,"�`�����`����";
			break;
		case 8:
			set '@itemid,630;
			set '@mobname$,"�X�|�A";
			break;
		case 9:
			set '@itemid,631;
			set '@mobname$,"�|�C�Y���X�|�A";
			break;
		case 10:
			set '@itemid,632;
			set '@mobname$,"�y�R�y�R";
			break;
		case 11:
			set '@itemid,625;
			set '@mobname$,"�X�`�[���`�����`����";
			break;
		case 12:
			set '@itemid,626;
			set '@mobname$,"�n���^�[�t���C";
			break;
		case 13:
			set '@itemid,633;
			set '@mobname$,"�X���[�L�[";
			break;
		case 14:
			set '@itemid,629;
			set '@mobname$,"���b�J�[";
			break;
		case 15:
			set '@itemid,637;
			set '@mobname$,"�h�P�r";
			break;
		case 16:
			set '@itemid,628;
			set '@mobname$,"�f�U�[�g�E���t�̎q��";
			break;
		case 17:
			set '@itemid,639;
			set '@mobname$,"�C�V�X";
			break;
		case 18:
			set '@itemid,640;
			set '@mobname$,"�v�e�B�b�g";
			break;
		case 19:
			set '@itemid,636;
			set '@mobname$,"���i�b�N";
			break;
		case 20:
			set '@itemid,659;
			set '@mobname$,"�{���S��";
			break;
		case 21:
			set '@itemid,635;
			set '@mobname$,"�I�[�N�E�H���A�[";
			break;
		case 22:
			set '@itemid,642;
			set '@mobname$,"�o�t�H���b�g.Jr";
			break;
		case 23:
			set '@itemid,643;
			set '@mobname$,"�f�r���`";
			break;
		case 24:
			set '@itemid,638;
			set '@mobname$,"�\�q�[";
			break;
		case 25:
			set '@itemid,634;
			set '@mobname$,"���[���[";
			break;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "����A�����Ă�����B";
		mes "�u" +getitemname('@itemid)+ "�v�I";
		switch(@menu) {
		case 1: //�܂��n���ĂȂ������S
			mes "�����ς��ċꂢ���ǁA";
			break;
		case 2: //�I�����W�W���[�X
			mes "�ʏ`���W�߂����ݕ��ŁA";
			break;
		case 3: //�ƂĂ��ꂢ��
			mes "�H�ׂ�ƒN������";
			mes "�炪�c��ł��܂����炢�ꂢ�I";
			break;
		case 4: //���F�j���W��
			mes "���F�̌����o���Ă����A";
			mes "�Ƃ��Ă��f�G�ȍ���I";
			break;
		case 5: //�n���T���ȐN�~�~�Y
			mes "��ɂ��钱�l�N�^�C���|�C���g�I";
			break;
		case 6: //�Â�����
			mes "������H���ꂽ";
			mes "�Â��A���������~���N�I";
			break;
		case 7: //��������
			mes "�����������Ă��邯�ǁA";
			break;
		case 8: //���̘I���h���Ă����
			mes "�������������܂񂾗ΐF�̑ۂŁA";
			break;
		case 9: //�ғő�
			mes "�ғł��������댯�ȑ������ǁA";
			break;
		case 10: //�����Ă���~�~�Y
			mes "���C�����ς��A�ۂ������X�^�C���I";
			break;
		case 11: //�K�т��S
			mes "�������K�тĂ��āA";
			mes "�ƂĂ�����Ȃ����ǎg���Ȃ��B";
			break;
		case 12: //�����X�^�[�W���[�X
			mes "���ō��ꂽ�W���[�X�B";
			mes "�ƂĂ����߂�悤�Ȃ��̂���Ȃ����ǁA";
			break;
		case 13: //�Ă���
			mes "�ӂ����炠���A";
			mes "��[���Ă��Ă��邨���B";
			break;
		case 14: //�̂���
			mes "�s�v�c�Ȃ��ƂɁA�ԂȂ̂ɉ̂��B";
			break;
		case 15: //�Â��z�E�L
			mes "��X�󂯌p����Ă����Ƃ���";
			mes "�Ƃ��Ă��Â��z�E�L�B";
			break;
		case 16: //�悭�����Ă��鍜
			mes "���z�̌��ł�[�������������B";
			break;
		case 17: //���]�̘r��
			mes "�Y��ȑ���������Ă��邯�ǁA";
			mes "�ǂ����߂������Ɍ�����r�ցB";
			break;
		case 18: //�����Ă����
			mes "�Y��Ɍ����Ă���΁I";
			break;
		case 19: //���Ă��Ȃ��莆
			mes "���鑊��̖��O��������";
			mes "�͂����Ȃ������莆�B";
			break;
		case 20: //�ޏ��̑z��
			mes "���鏗�̎q�̔閧�̑z����";
			mes "���߂�ꂽ�����B";
			break;
		case 21: //�g�D�̝|
			mes "�g�D�����������K����";
			mes "��������ے��I";
			break;
		case 22: //�������ҏ�
			mes "���������҂����@��������Ă���";
			mes "�ւ���ꂽ�����I";
			break;
		case 23: //�ł̌_��
			mes "���̖��̒ʂ�̌_�񏑁I";
			break;
		case 24: //�����̏�����
			mes "�������ے����邩�̂悤��";
			mes "����̐n�����������I";
			break;
		case 25: //�M�т̃o�i�i
			mes "�M�ђn���ň�����ō����̃o�i�i�I";
			break;
		}
		mes '@mobname$+ "�̑�D���I";
		next;
		if(countitem('@itemid) < 1) {
			mes "[�|�E]";
			mes "�c�c���āA�ǂ��ɂ���́H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�����炱���ɁI";
			mes " ";
			mes "�c�c�c�c����H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "���[���Ɓc�c";
			mes "�ǁA�ǂ��ɂ�������ȁH";
			mes "����A������Ƒ҂��āI";
			mes "�����T���Ă��邩��I";
			close;
		}
		mes "[�|�E]";
		mes "�ւ��c�c�����" +'@mobname$+ "��";
		mes "�e�C�~���O�ł���񂾁c�c";
		mes "�c�c����A���肪�Ƃ��B";
		mes "���ꂶ��A���̎q�͂����邯�ǁA";
		mes "�����ƈ�ĂĂ����Ă�ˁI";
		next;
		mes "[�|�E]";
		mes "���A���łɂ����������B";
		mes "�N���X�}�X�v���[���g�I";
		mes "�F�X�Ƃ��Ă��ꂽ����B";
		mes "���肪�ƂˁI";
		mes "����[�ˁ[�B";
		mes "�����[�N���X�}�[�X�I";
		set XMAS_2EVE,5;
		delitem '@itemid,1;
		if(@menu <= 5)
			getitem 12200,3;
		else if(@menu <= 11 || @menu == 14)
			getitem 12200,5;
		else if(@menu <= 21) {
			getitem 12200,7;
			getitem 12130,1;
		}
		else {
			getitem 12200,10;
			getitem 12130,3;
		}
		makepet 9029;
		close;
	case 5:
		mes "[�|�E]";
		mes "�l�����������A�ǂ��Ȃ��Ă�H";
		mes "�z���g�͂����ƈ�Ă��������ȁc�c";
		next;
		mes "[�|�E]";
		mes "�l�̑���ɂ����ƈ�ĂĂ�I";
		mes "�񑩂�����ˁI";
		close;
	}
}

prontera.gat,226,306,3	script	�z�[���[	79,{
	if(XMAS_2EVE != 2) {
		misceffect 75;
		mes "[�z�[���[]";
		mes "�y�������̓�������Ă�����";
		mes "�݂�Ȃ͂Ƃ��Ă��K���Ɂ�";
		next;
		mes "[�z�[���[]";
		mes "�����[�N���X�}�`�X��";
		mes "���N���f�G�ȃN���X�}�X��";
		mes "�������܂���`";
		if(XMAS_2EVE != 1)
			close;
		next;
		mes "[�z�[���[]";
		mes "�ł��A���Ȃ��ɂƂ���";
		mes "�f�G�ȓ�����Ȃ��݂����ł��ˁH";
		mes "����Ȃɑf���炵�����Ȃ̂ɁA";
		mes "��F���悭����܂����H";
		mes (Sex? "�Z��": "�o��")+ "��A�����S�z�̎�ł�";
		mes "����̂ł����H";
		next;
		mes "[�z�[���[]";
		mes "���ɏo���邱�Ƃ�����Ȃ�A";
		mes "���ł�����`���������܂���B";
		mes "����M���āA";
		mes "�Y�݂������Ă݂Ă��������B";
		next;
		if(select("�Y�݂Ȃ�Ă���܂���","���́c�c")==1) {
			mes "[�z�[���[]";
			mes "�����Ȃ̂ł����H";
			mes "�ł́A���ꏏ�ɂ��̃N���X�}�X��";
			mes "�y���݂܂��傤�I";
			next;
			misceffect 75;
			mes "[�z�[���[]";
			mes "�y�������̓�������Ă�����";
			mes "�݂�Ȃ͂Ƃ��Ă��K���Ɂ�";
			next;
			mes "[�z�[���[]";
			mes "�����[�N���X�}�`�X��";
			mes "���N���f�G�ȃN���X�}�X��";
			mes "�������܂���`";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "�s�C���Ȗ͗l���򉻂ł��Ȃ����Ǝv���A";
		mes "���̑吹����K�˂ɂ��܂����B";
		next;
		mes "[�z�[���[]";
		mes "�����b!?�@�s�C���Ȗ͗l�ł�����!?";
		mes "����Ȑ_���ȓ��ɁA�������ǂ�����";
		mes "�������Ă���Ƃ����̂ł���!?";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c���ꂪ�܂��A";
		mes "�����������킩��Ȃ��āc�c";
		mes "���́A���̖͗l�͂��܁c�c";
		next;
		mes "[�z�[���[]";
		mes "�������I�@����Ȏ׈��ȑ��݂�";
		mes "�߂��ɂ���Ƃ����̂�";
		mes "�����C�Â��Ȃ������Ȃ�āI";
		mes "�c�c�����c�c�����ˁI";
		mes "���ӂ����΂��肷��A���\�j�̂����ˁI";
		mes "�����A�����Ƃ�����I";
		next;
		mes "[�z�[���[]";
		mes "�_�̈ӌ��ɉ����A�׈��Ȃ�҂�";
		mes "�����߂Ȃ�V���������܂��傤�I";
		mes "�����I�@�ǂ��ɂ���̂ł����I";
		mes "���̈����́I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c�����c�c";
		mes "��������Ȃ��āA���̘b�����c�c";
		next;
		mes "[�z�[���[]";
		mes "�����I�@�����Ɉē����Ă��������I";
		mes "���̎�͐_��򂸂��I";
		mes "���̎�������āA���������̒n����";
		mes "�ގU�����܂��傤�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "������I";
		mes "��������Ȃ���ł�����!!";
		next;
		mes "-���Ȃ��̓z�[���[�����";
		mes "�|�E�����������ɂ���";
		mes "���������āA���m�ɐ�������-";
		next;
		mes "[�z�[���[]";
		mes "�A�n�b�A�����������Ƃ������̂ł��ˁH";
		mes "�����Ȃ炻���Ƒ��������Ă���������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����c�c�����ĂȂ��������c�c";
		next;
		mes "[�z�[���[]";
		mes "�ł́A�׈��Ȗ͗l���`���ꂽ����";
		mes "�򉻂������̂ł��ˁB";
		mes "����Ȃ�ȒP�ł��B";
		mes "^0000FF�j���̕�^000000��������΂��������ł��B";
		next;
		mes "[�z�[���[]";
		mes "�ޗ��������Ă��Ă��������";
		mes "���ł����܂��B";
		mes "����΂��čޗ����W�߂Ă��Ă��������B";
		set XMAS_2EVE,2;
		close;
	}
	if(countitem(733) < 1 || countitem(715) < 1 || countitem(716) < 1 || countitem(523) < 3) {
		mes "[�z�[���[]";
		mes "�ޗ����������^0000FF�j���̕�^000000��";
		mes "����Ă��������܂���H";
		mes "�����A�����W�߂Ă��Ă��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�ޗ��𕷂��ĂȂ��̂ł����c�c";
		next;
		mes "[�z�[���[]";
		mes "�c�c�c�c�͂��I";
		mes "^0000FF���������_�C�������h 1�A";
		mes "�C�G���[�W�F���X�g�[�� 1�A";
		mes "���b�h�W�F���X�g�[�� 1�A";
		mes "���� 3��^000000�B";
		mes "�ȏ�ł��I";
		next;
		mes "[�z�[���[]";
		mes "�c�c���Y�ꂪ�����̂�����c�c";
		mes "�����ƌ������Ǝv�����̂Ɂc�c";
		mes "�c�c�c�c";
		mes "�c�c���A�ق�I";
		mes "�����W�߂Ă��Ă��������I";
		close;
	}
	misceffect 75;
	mes "[�z�[���[]";
	mes "�y�������̓�������Ă�����";
	mes "�݂�Ȃ͂Ƃ��Ă��K���Ɂ�";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���́c�c�z�[���[����H";
	mes "�ޗ��������Ă��܂����B";
	next;
	mes "[�z�[���[]";
	mes "�͂��H";
	mes "�ޗ��H";
	mes "�c�c���̘b�ł����H";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "^0000FF�j���̕�^000000������Ă�������";
	mes "���������������Ȃ��ł����I";
	mes "�Y�ꂽ��ł���!?";
	next;
	mes "[�z�[���[]";
	mes "�c�c�c�c�c�c�c�c�c�c�c�c���H";
	next;
	mes "[�z�[���[]";
	mes "�c�c�c�c";
	mes "���c�c����c�c�A�n�n�n�n�n�n�n�B";
	mes "�Y��Ă܂����I";
	mes "�z���g�ɖY��Ă܂��񂩂�ˁI";
	next;
	mes "[�z�[���[]";
	mes "�c�c�c�c";
	mes "�c�c�Łc�c�c�c";
	mes "�ǂ�����^0000FF�j���̕�^000000��";
	mes "����ł��������H";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i��������Y��Ă邵�I�j";
	mes "�c�c�ł�����c�c";
	next;
	switch(select("������ގ����邽�߂�","�����򉻂��邽�߂�","���̓���������c�c")) {
	case 1:
		mes "[�z�[���[]";
		mes "�c�c���H";
		mes "�����ގ��ł����H";
		next;
		mes "[�z�[���[]";
		mes "����Ȃ�I";
		mes "�킴�킴^0000FF�j���̕�^000000��";
		mes "�p�ӂ���K�v�Ȃ�Ă���܂���I";
		next;
		mes "[�z�[���[]";
		mes "�������ځA����������";
		mes "�ق��������Ă��������܂��I";
		close;
	case 2:
		break;
	case 3:
		mes "[�z�[���[]";
		mes "���炠��B";
		mes "�N���X�}�X��������Ă͂��Ⴎ����";
		mes "�����Ȃ����Ⴄ��ł���B";
		mes "���������ނȂ�A�����Ǝ����̑̂�";
		mes "���k���Ĉ��܂Ȃ��Ƃ����܂���B";
		next;
		mes "[�z�[���[]";
		mes "����ɁA��������ɂ�^0000FF�j���̕�^000000���";
		mes "�����ƌ������̂�����܂���B";
		mes "�����A�C���y�ɂ��Ă��������B";
		next;
		misceffect 75;
		misceffect 194,"";
		emotion 23,"";
		percentheal -30,0;
		mes "[�z�[���[]";
		mes "�ł͂����܂���I";
		mes "�u���𕏂ł�_�̖����I�@��1�y�́I�v";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����I";
		mes "���A�������ꂻ���ɒɂ��I";
		next;
		mes "[�z�[���[]";
		mes "��74�y�͂܂ŕ�����";
		mes "�C�����悭�Ȃ�܂���B";
		mes "���A�ǂ��ɍs����ł����H";
		mes "�܂�73�y�͂��c���Ă����ł���I";
		close;
	}
	mes "[�z�[���[]";
	mes "�c�c�����`�����ł����˂��c�c";
	mes "���c�c���������A�킩���Ă܂���B";
	mes "�킩���Ă��܂����Ƃ��I";
	next;
	mes "[�z�[���[]";
	mes "�ޗ��������Ƃ���悤�ł����A";
	mes "�����������܂��ˁI";
	next;
	emotion 23;
	misceffect 101;
	mes "[�z�[���[]";
	mes "�܂��A���������_�C�������h��";
	mes "�ӂ��ĕ��ɂ��܂��B";
	mes "����͏����R�c���K�v�ł����A";
	mes "����b�艮�̕��ɋ����܂����B";
	next;
	mes "[�z�[���[]";
	mes "��x�����U������Ȃ��犄��̂�";
	mes "�|�C���g�ł��B";
	next;
	misceffect 302;
	mes "[�z�[���[]";
	mes "���ɁA�傫�Ȋ�ɐ����𒍂��A";
	mes "�������Ɖ��M���Ȃ���A";
	mes "���b�h�W�F���X�g�[����";
	mes "�C�G���[�W�F���X�g�[�������A";
	mes "���S�ɗn�����܂��B";
	next;
	misceffect 256;
	mes "[�z�[���[]";
	mes "�W�F���X�g�[���Ɛ�������������";
	mes "�t�̂ɁA��قǂ̕����������킹�A";
	mes "��������������܂ŉ��M����Ί����I";
	mes "�͂��A^0000FF�j���̕�^000000�I";
	next;
	emotion 18;
	mes "[�z�[���[]";
	mes "�ł͂��������A��قǘb���ꂽ����";
	mes "�򉻂��Ă��Ă��������B";
	mes "�ǂ����ʂƂȂ�悤�A";
	mes "���Ȃ��̍K�^���F��܂��B";
	next;
	mes "^0000FF-�j���̕�����ɓ��ꂽ�I-^000000";
	set XMAS_2EVE,3;
	close;
}

//==============================================================
// �T���^�N���[�X�ɑ�����
//==============================================================
prontera.gat,156,268,3	script	�T���^�N���[�X	718,{
	switch(XMAS_3EVE) {
	case 0:
		mes "[�T���^�N���[�X]";
		mes "�z�[�z�[�z�[";
		mes "�����[�N���X�}�X�I";
		mes "���N���ǂ��q�ł������ȁH";
		next;
		mes "[�T���^�N���[�X]";
		mes "�N�̓N���X�}�X�ƕ�����";
		mes "������ԍŏ��Ɏv�������ȁH";
		next;
		switch(select("�T���^�N���[�X�ł��I","�v���[���g�{�b�N�X�ł��I","�Ԃ��@�ł��I","�T���^�̂ڂ����ł��I","�J�b�v���n��!!")) {
		case 1:
			break;
		case 2:
			mes "[�T���^�N���[�X]";
			mes "�v���[���g�{�b�N�X�ƂȁH";
			mes "�Q�Ă���Ԃɖ����ɒu�����";
			mes "�T���^�N���[�X����̃v���[���g�́A";
			mes "�����҂��������Ȃ���񂶂�B";
			next;
			mes "[�T���^�N���[�X]";
			mes "���Ⴊ�A���N�N���X�}�X�ɖ\���";
			mes "�A���\�j�Ƃ��������T���^������B";
			mes "���E���ɂ���T���^�̔Y�݂̎킶��B";
			mes "�z�[�z�[�z�[";
			close;
		case 3:
			mes "[�T���^�N���[�X]";
			mes "�Ԃ��@�ƂȁH";
			mes "�킵�̒��N�̗F�l������";
			mes "�Ԃ��@�̂��Ƃ��̂��H";
			mes "�F�l�̕@�͂Ђ����Ă��邩��A";
			mes "�ƂĂ����ɂ����Ă����B";
			next;
			mes "[�T���^�N���[�X]";
			mes "���������΁A���N�̓��e�B�G��";
			mes "����������Ă��A�C�e����";
			mes "����Ă��邻������B";
			next;
			mes "[�T���^�N���[�X]";
			mes "�F�Ō���@�������";
			mes "�L���L�����Ċy�����N���X�}�X��";
			mes "��������񂶂�Ȃ����̂��H";
			mes "�z�[�z�[�z�[";
			close;
		case 4:
			mes "[�T���^�N���[�X]";
			mes "�T���^�̂ڂ����ƂȁH";
			mes "���́A�킵�̂悤�ȃT���^��";
			mes "����Ă���T���^�̂ڂ����ƁA";
			mes "�����X�^�[������Ă���";
			mes "�T���^�̂ڂ����͕ʕ��Ȃ񂶂��B";
			next;
			mes "[�T���^�N���[�X]";
			mes "�������̂��A���̍L�����E�ɂ�";
			mes "�����������̃T���^�̂ڂ���������";
			mes "�킵�̎��T���^�̂ڂ����ɋ߂�";
			mes "�͂��������鎖���o����f�U�C�i�[��";
			mes "����炵���c�c";
			next;
			mes "[�T���^�N���[�X]";
			mes "���N�A�N���X�}�X��_����";
			mes "�����̃����X�^�[������邪�A";
			mes "�A���\�j�Ƃ��������T���^������";
			mes "�ȒP�ɂ͕߂܂�Ȃ����R��";
			mes "���̖X�q�̂������Ƃ���";
			mes "���킳������񂶂�B";
			close;
		case 5:
			mes "[�T���^�N���[�X]";
			mes "����H";
			mes "�����O�ɂ������N��";
			mes "�N�Ɠ����悤�Ȏ��������Ă����c�c";
			next;
			mes "[�T���^�N���[�X]";
			mes "���x�͈�̉�������̂��c�c";
			mes "�܂������A�N���X�}�X���Ƃ����̂�";
			mes "�s���̎킪����Ƃ͂̂��B";
			mes "�z�[�z�[�z�[";
			close;
		}
		mes "[�T���^�N���[�X]";
		mes "�z�[�z�[�z�[�I";
		mes "�N�͂Ƃ��Ă��ǂ��q�݂�������ȁI";
		mes "���̌N��������ŁA����";
		mes "���肢������̂����A";
		mes "�������ȁH";
		next;
		if(select("���ł�","���ł��ǂ����I")==1) {
			mes "[�T���^�N���[�X]";
			mes "�z�b�z�b�z�B";
			mes "�����̋C�����ɐ�������ȁB";
			next;
			mes "[�T���^�N���[�X]";
			mes "�C���ς�����炢�ł����Ȃ����B";
			mes "�N���X�}�X�͎肪���������Ă�";
			mes "����Ȃ��񂶂�B";
			close;
		}
		mes "[�T���^�N���[�X]";
		mes "���ށB";
		mes "��������҂ŐS�D�����̂��B";
		mes "�킵�������񂾂�������B";
		next;
		mes "[�T���^�N���[�X]";
		mes "���Ԃ��������炷���ɐ������邼�B";
		mes "�N�ɂ͐��E���̎q���������K���ɂ���";
		mes "��`�������Ă��炢�����񂶂�B";
		next;
		mes "[�T���^�N���[�X]";
		mes "�����A�v���[���g�{�b�N�X�̔z�B����B";
		mes "���N���̎����́A�肪���������Ă�";
		mes "����Ȃ����炢�Ȃ񂶂�B";
		next;
		set XMAS_3EVE,rand(1,5);
		mes "[�T���^�N���[�X]";
		mes "�����A���̃v���[���g���󂯎��";
		mes "�q���̖��O�́u" +(XMAS_3EVE==1? "�A���Y": (XMAS_3EVE==2? "���C�V": (XMAS_3EVE==3? "�f�[�}���[": (XMAS_3EVE==4? "�~�q��": "�C�V�e"))))+ "�v����B";
		switch(XMAS_3EVE) {
		case 1:
			mes "^0000FF���{�̐X�̋߂���";
			mes "�T������̂��D���ȏ��̎q�B^000000";
			break;
		case 2:
			mes "^0000FF�t�F�C�����ɂ��閳���ȏ��̎q�B^000000";
			break;
		case 3:
			mes "^0000FF�A���x���^�߂���";
			mes "��j�D�ɂ���j�̎q�B^000000";
			break;
		case 4:
			mes "^0000FF�W���m�[�ɂ���������̎q�B^000000";
			break;
		case 5:
			mes "^0000FF���e�B�G�ɂ���P�ǂȏ����H^000000";
			mes "�c�c�^��n�c�c�H";
			break;
		}
		mes (XMAS_3EVE==5? "�ŁA": "")+ "�ł́A���񂾂��I";
		next;
		mes "-���{���Ɂu" +(XMAS_3EVE==1? "�A���Y": (XMAS_3EVE==2? "���C�V": (XMAS_3EVE==3? "�f�[�}���[": (XMAS_3EVE==4? "�~�q��": "�C�V�e"))))+ "�ցv�Ə����ꂽ";
		mes "�v���[���g�{�b�N�X���󂯎����-";
		break;
	default:
		mes "[�T���^�N���[�X]";
		mes "�v���[���g���󂯎��q���̖��O��";
		mes "�u" +(XMAS_3EVE==1? "�A���Y": (XMAS_3EVE==2? "���C�V": (XMAS_3EVE==3? "�f�[�}���[": (XMAS_3EVE==4? "�~�q��": "�C�V�e"))))+ "�v����B";
		switch(XMAS_3EVE) {
		case 1:
			mes "^0000FF���{�̐X�̋߂���";
			mes "�T������̂��D���ȏ��̎q�B^000000";
			break;
		case 2:
			mes "^0000FF�t�F�C�����ɂ��閳���ȏ��̎q�B^000000";
			break;
		case 3:
			mes "^0000FF�A���x���^�߂���";
			mes "��j�D�ɂ���j�̎q�B^000000";
			break;
		case 4:
			mes "^0000FF�W���m�[�ɂ���������̎q�B^000000";
			break;
		case 5:
			mes "^0000FF���e�B�G�ɂ���P�ǂȏ����H^000000";
			break;
		}
		mes (XMAS_3EVE==5? "�ŁA": "")+ "�ł́A���񂾂��I";
		break;
	case 6:
		mes "[�T���^�N���[�X]";
		mes "�ǂ���������H";
		mes "�v���[���g�͖����ɓn�������̂��H";
		next;
		mes "[�T���^�N���[�X]";
		mes "�q���B���v���[���g���������";
		mes "��Ԋ������ƁA�K���ɂȂ�񂩁H";
		mes "�z�[�z�[�z�[";
		next;
		mes "[�T���^�N���[�X]";
		mes "�킵�̗��݂𕷂��Ă���Ă��肪�Ƃ��B";
		mes "����͊��ӂ̋C��������B";
		mes "���̑܂̒��Ɏ�����āA";
		mes "�D���ȕ�������������čs���Ȃ����B";
		next;
		mes "[�T���^�N���[�X]";
		mes "����J�l�B";
		mes "����Ȃ����ڂ�������Ă����";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "�z�[�z�[�z�[";
		set XMAS_3EVE,7;
		switch(rand(30)) {
		case 0:
		case 1:
		case 2:
			getitem 529,10; //�L�����f�B 10
			break;
		case 3:
		case 4:
		case 5:
			getitem 530,7; //�X�e�B�b�N�L�����f�B 7
			break;
		case 6:
		case 7:
		case 8:
			getitem 538,5; //�悭�Ă����N�b�L�[ 5
			break;
		case 9:
		case 10:
		case 11:
			getitem 558,3; //�`���R���[�g 3
			break;
		case 12:
		case 13:
		case 14:
			getitem 12200,3; //�N���X�}�X�P�[�L 3
			break;
		case 15:
		case 16:
			getitem 12200,5; //�N���X�}�X�P�[�L 5
			break;
		case 17:
			getitem 12200,7; //�N���X�}�X�P�[�L 7
			break;
		case 18:
		case 19:
			getitem 522,1; //�}�X�e���̎� 1
			break;
		case 20:
			getitem 526,1; //���[�����[���[ 1
			break;
		case 21:
			getitem 608,1; //�C�O�h���V���̎� 1
			break;
		case 22:
		case 23:
		case 24:
			getitem 12130,1; //�َq��� 1
			break;
		case 25:
			getitem 644,1; //�v���[���g�{�b�N�X 1
			break;
		case 26:
			getitem 604,1; //�Ö؂̎} 1
			break;
		case 27:
			getitem 2236,1; //�T���^�̂ڂ��� 1
			break;
		case 28:
			getitem 2262,1; //�s�G���̕@ 1
			break;
		case 29:
			getitem 7034,1; //�����J���Ă���Ԃ��C�� 1
			break;
		}
		close;
	case 7:
		mes "[�T���^�N���[�X]";
		mes "�������ŏ����]�T���ł����킢�B";
		mes "�܂��Z�����Ȃ�����";
		mes "���̂����ڂ�̎d����";
		mes "��`���Ă�����B";
		next;
		mes "[�T���^�N���[�X]";
		mes "������Z�����Ă��A���̓N���X�}�X�B";
		mes "�N���F��Ȏ����y���ނ񂶂Ⴜ�B";
		mes "�z�[�z�[�z�[";
		set XMAS_3EVE,0;
		close;
	}
	mes "[�T���^�N���[�X]";
	mes "�v���[���g��͂��鎞�́A";
	mes "^0000FF�u���C�[�[�̃T���^�X�v�Ɓu���Ђ��v^000000";
	mes "��K�������Ă����񂶂Ⴜ�B";
	mes "�q�����������T���^�N���[�X��";
	mes "�C���[�W���󂵂���Ȃ��B";
	mes "�z�[�z�[�z�[";
	close;
}

prt_fild01.gat,141,363,3	script	�A���Y	96,{
	if(XMAS_3EVE == 6) {
		mes "[�A���Y]";
		mes "�Ƃ������Ă��f�G�ȃv���[���g�I";
		mes "�{���ɂ��肪�Ƃ�!!";
		mes "���ꂩ����ǂ��q�ł���ˁI";
		mes "�L���[�A�L���A�A�A�A�A�A!!";
		next;
		mes "-�����̓v���[���g��������߂Ȃ���";
		mes "���������ɂ͂��Ⴂ�ł���-";
		close;
	}
	mes "[�A���Y]";
	mes "����炵�Ȃ����A���̉�����";
	mes "��т̉̂��̂��Ȃ��瑖�낤��";
	if(XMAS_3EVE != 1)
		close;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����̐����ˁB";
	mes "�͂��A����B";
	mes "���N���ǂ��q�ł����A���Y��";
	mes "�T���^���񂩂�̃v���[���g����B";
	next;
	if(getequipid(1) != 5136 || getequipid(10) != 2241) {
		mes "[�A���Y]";
		mes "�c�c���̂˂��c�c";
		mes "�T���^�N���[�X���Ă����̂͂ˁc�c";
		next;
		mes "[�A���Y]";
		mes "�N���X�}�X�ɗǂ��q��";
		mes "�v���[���g�������Ă��Ă����́B";
		mes "�����܂ł͂����Ă邯�ǁc�c";
		next;
		misceffect 1,"";
		emotion 23,"";
		percentheal -50,0;
		mes "[�A���Y]";
		mes "�Ԃ��X�q�����āA";
		mes "�������Ђ��𐶂₵�ĂȂ��̂́A";
		mes "���ꂱ���^���ԂȋU���Ȃ́I";
		mes "�q����������ăo�J�ɂ��Ȃ��ł�I";
		close;
	}
	mes "[�A���Y]";
	mes "���H";
	mes "���A���肪�Ƃ��B�T���^����B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������������J���Ă݂���H";
	mes "�N�̗~��������";
	mes "�����Ă��邩������Ȃ���B";
	next;
	mes "-�A���Y�͏������������ɂ��Ȃ���A";
	mes "�������ƃv���[���g�{�b�N�X��";
	mes "���������-";
	next;
	emotion 9;
	mes "[�A���Y]";
	mes "���I�@����́I";
	mes "�W�F�[���Y�I���[�u�̐H��Z�b�g�I";
	mes "�L���A�A�A�A�A�A�A�A�A!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�b�c�c�c�c";
	mes "�c�c�C�ɂ������H";
	next;
	emotion 18;
	mes "[�A���Y]";
	mes "���[�I�@�ق���ƁI";
	mes "�ق�ƂɊ������I";
	mes "���肪�Ƃ��I";
	mes "�ꐶ�ƕ�ɂ����I";
	mes "�L���A�A�A�A�A�A!!";
	next;
	mes "-�����͖��f�Ȃ��炢���ł���-";
	mes "-�v���[���g�͖����ɓn�����I-";
	set XMAS_3EVE,6;
	close;
}

payon.gat,242,282,3	script	���C�V	703,{
	if(XMAS_3EVE == 6) {
		mes "[���C�V]";
		mes "�{���Ɂc�c�������c�c";
		mes "���ꂩ����c�c";
		mes "�ǂ��q�Łc�c���܂��c�c";
		next;
		mes "-�����̓v���[���g��";
		mes "�厖�����ɕ������߂Ȃ���A";
		mes "�y����߂�����-";
		close;
	}
	mes "[���C�V]";
	mes "�Â��Ȗ�c�c�_��I�Ȗ�c�c";
	mes "�����Ɓc�c���Ȃ��́c�c";
	mes "����Ă���c�c";
	if(XMAS_3EVE != 2)
		close;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�f�G�ȉ̐����ˁB";
	mes "�͂��A����B";
	mes "���N���ǂ��q�ł������C�V��";
	mes "�T���^���񂩂�̃v���[���g����B";
	next;
	if(getequipid(1) != 5136 || getequipid(10) != 2241) {
		mes "[���C�V]";
		mes "�c�c";
		next;
		misceffect 1,"";
		emotion 23,"";
		percentheal -50,0;
		mes "[���C�V]";
		mes "�c�c�T���^����Ȃ��c�c";
		close;
	}
	mes "[���C�V]";
	mes "�c�c���肪�Ƃ��c�c�T���^����c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������������J���Ă݂���H";
	mes "�N�̗~��������";
	mes "�����Ă��邩������Ȃ���B";
	next;
	mes "-���C�V�͕\���ς����ɁA";
	mes "�������ƃv���[���g�{�b�N�X��";
	mes "���������-";
	next;
	emotion 9;
	mes "[���C�V]";
	mes "�c�c����́c�c";
	mes "�W���V���A�搶���`�����c�c";
	mes "�}�C�S�c�Ɓc�c�^�N�́c�c";
	mes "�߂������́c�c����c�c";
	mes "�߈��V���[�Y�c�c���Łc�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c���c�c�c�c";
	mes "�C�Ɂc�c�����c�c���H";
	next;
	emotion 9;
	mes "[���C�V]";
	mes "�{���Ɂc�c�������c�c";
	mes "���肪�Ƃ��c�c";
	mes "�ꐶ�c�c�ƕ�ɂ��܂��c�c";
	next;
	mes "-�������{���Ɋ��ł���̂��A";
	mes "���\��Ȉׂ킩��Ȃ����A";
	mes "�v���[���g�͖����ɓn�����I-";
	set XMAS_3EVE,6;
	close;
}

alb2trea.gat,110,99,0	script	�f�[�}���[	706,{
	if(XMAS_3EVE == 6) {
		mes "[�f�[�}���[]";
		mes "�����ƒފƗ~��������ȁI";
		mes "���ꂩ����ǂ��q�ł����I";
		next;
		mes "-���N�͗���Ńv���[���g������āA";
		mes "�ƂĂ����������ɏ΂���-";
		close;
	}
	mes "[�f�[�}���[]";
	mes "�������Ђ���h�炵�Ċ����";
	mes "����ő����ċC�����͑u����";
	if(XMAS_3EVE != 3)
		close;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����̐����ˁB";
	mes "�͂��A����B";
	mes "���N���ǂ��q�ł����f�[�}���[��";
	mes "�T���^���񂩂�̃v���[���g����B";
	next;
	if(getequipid(1) != 5136 || getequipid(10) != 2241) {
		mes "[�f�[�}���[]";
		mes "�c�c�T���^�H";
		next;
		mes "[�f�[�}���[]";
		mes "�͂�A�R���Ă΂�΂ꂾ��B";
		next;
		misceffect 1,"";
		emotion 23,"";
		percentheal -50,0;
		mes "[�f�[�}���[]";
		mes "�T���^�͂ȁA�Ԃ��X�q������";
		mes "�����Ђ��𐶂₵�Ă�񂾂�I";
		mes "����Ȏ����m��˂��̂���B";
		close;
	}
	mes "[�f�[�}���[]";
	mes "�킟�b�I";
	mes "�N���X�}�X�v���[���g���I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������������J���Ă݂���H";
	mes "�N�̗~��������";
	mes "�����Ă��邩������Ȃ���B";
	next;
	mes "-�f�[�}���[�͂킭�킭���Ȃ���A";
	mes "�}���Ńv���[���g�{�b�N�X��";
	mes "���������-";
	next;
	emotion 18;
	mes "[�f�[�}���[]";
	mes "������I";
	mes "�����������ފƂƃ~�~�Y�̃Z�b�g�I";
	mes "����Œނ肪�ł��邺�I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c���c�c�c�c";
	mes "�C�Ɂc�c�������́c�c�H";
	next;
	emotion 52;
	mes "[�f�[�}���[]";
	mes "��������܂����I";
	mes "���ꂩ�炳�������ނ�����邺�I";
	mes "������ق����������I";
	next;
	mes "-���N�͂���������������-";
	mes "-�v���[���g�͖����ɓn�����I-";
	set XMAS_3EVE,6;
	close;
}

yuno.gat,103,185,3	script	�~�q��	72,{
	if(XMAS_3EVE == 6) {
		mes "[�~�q��]";
		mes "�f�G�ȃv���[���g���肪�Ƃ��I";
		mes "���ꂩ����ǂ��q�ł���ˁB";
		mes "�t�t�t�t�t�c�c";
		next;
		mes "-�����̓v���[���g��������߂āA";
		mes "�ƂĂ����������ɏ΂���-";
		close;
	}
	mes "[�~�q��]";
	mes "�����Ă͂����Ȃ��A�����Ă͂����Ȃ���";
	mes "�T���^����͋����Ă�q����";
	mes "��ɂ��Ȃ���";
	if(XMAS_3EVE != 4)
		close;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�Y��ȉ̐����ˁB";
	mes "�͂��A����B";
	mes "���N���ǂ��q�ł����~�q����";
	mes "�T���^���񂩂�̃v���[���g����B";
	next;
	if(getequipid(1) != 5136 || getequipid(10) != 2241) {
		mes "[�~�q��]";
		mes "�c�c�T���^����H";
		next;
		mes "[�~�q��]";
		mes "�ӂ�A�R���I";
		next;
		misceffect 1,"";
		emotion 23,"";
		percentheal -50,0;
		mes "[�~�q��]";
		mes "�T���^����͂���Ȃ���������Ȃ��I";
		close;
	}
	mes "[�~�q��]";
	mes "�킟�I�@���肪�Ƃ��A�T���^����I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������������J���Ă݂���H";
	mes "�N�̗~��������";
	mes "�����Ă��邩������Ȃ���B";
	next;
	mes "-�~�q���͂킭�킭���Ȃ���A";
	mes "�Y��Ƀv���[���g�{�b�N�X��";
	mes "���������-";
	next;
	emotion 18;
	mes "[�~�q��]";
	mes "�킟�c�c�ԈႢ�Ȃ��I";
	mes "����́A���̃L�b�Y�l��";
	mes "���Ă����Ƃ������̃}�t���[�I";
	mes "�����c�c���ꂪ���̕��̍���c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c���c�c�c�c";
	mes "�C�Ɂc�c�������́c�c�H";
	next;
	emotion 52;
	mes "[�~�q��]";
	mes "�����A�������I";
	mes "�t�t�t�A���肪�Ƃ��B";
	mes "�����Ƒ�؂Ɏg���ˁB";
	mes "�t�t�t�t�t�t�B";
	next;
	mes "-�����̏Ί炪�ǂ����|�����A";
	mes "�v���[���g�͖����ɓn�����I-";
	set XMAS_3EVE,6;
	close;
}

//==============================================================
// �L�����v�t�@�C�A����
//==============================================================
xmas.gat,137,233,3	script	�C�V�e	793,{
	if(XMAS_3EVE == 6) {
		mes "[�C�V�e]";
		mes "�v���[���g�A�Ƃ��Ă��C�ɓ�������B";
		mes "�t�t�t�c�c���ꂩ����ǂ��q�ł����B";
		mes "�t�t�t�t�t�t�t�c�c";
		next;
		mes "-�����̓v���[���g�̔�������Ȃ���";
		mes "�ǂ����s�C���Ȕ��΂݂�������-";
		close;
	}
	if(XMAS_3EVE == 5) {
		mes "[�C�V�e]";
		mes "�}�b�`�A�}�b�`�͂���܂��񂩁`�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�ǂ����Ō����悤�Ȏq���ȁc�c�j";
		mes "����ȂɊ����̂ɑ�ς��ˁB";
		mes "�͂��A����B";
		mes "���N���ǂ��q�ł����C�V�e��";
		mes "�T���^���񂩂�̃v���[���g����B";
		next;
		if(getequipid(1) != 5136 || getequipid(10) != 2241) {
			mes "[�C�V�e]";
			mes "�c�c�T���^�H";
			next;
			misceffect 49,"";
			emotion 23,"";
			percentheal -50,0;
			mes "[�C�V�e]";
			mes "�T���^���Č����O�ɁA";
			mes "�����͂���炵���ϑ��ł�������H";
			close;
		}
		mes "[�C�V�e]";
		mes "���H";
		mes "�فA�{���ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������������J���Ă݂���H";
		mes "�N�̗~��������";
		mes "�����Ă��邩������Ȃ���B";
		next;
		mes "-�C�V�e�͊��������Ȋ�����Ȃ���A";
		mes "�T�d�Ƀv���[���g�{�b�N�X��";
		mes "���������-";
		next;
		emotion 29;
		mes "[�C�V�e]";
		mes "�c�c�ӂӁc�c����͎g�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@�C�ɂ������H";
		next;
		emotion 52;
		mes "[�C�V�e]";
		mes "�t�t�t�c�c���肪�Ƃ��B";
		mes "�����g�킹�Ă��炤��B";
		mes "�t�t�t�t�t�t�t�c�c";
		next;
		mes "-�����̏΂݂��ǂ����s�C�����������A";
		mes "�v���[���g�͖����ɓn�����I-";
		set XMAS_3EVE,6;
		close;
	}
	switch(XMAS_4EVE) {
	case 0:
		mes "[�C�V�e]";
		mes "�S�z���A�S�z���c�c";
		mes "�}�b�`�A�}�b�`�͂���܂��񂩁`�H";
		mes "�`�F�y�b�g����D���c�c���c�c�A";
		mes "�����Ɓc�c�`�F�y�b�g��";
		mes "���Ƃ����}�b�`�Ȃ�ł��c�c";
		mes "�c�c�S�z���S�z���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�ǂ����Ō����悤�Ȏq���ȁc�c�j";
		mes "�i�Ȃɂ��c�c�b���������";
		mes "��ςȎ��ɂȂ�C������c�c�j";
		next;
		mes "[�C�V�e]";
		mes "�S�z���A�S�z���A�S�z���I";
		mes "�����c�c���̃}�b�`��S������Ȃ��ƁA";
		mes "�����Ȏ��̂��Z������";
		mes "���������т�H�ׂ�Ȃ��I";
		next;
		mes "[�C�V�e]";
		mes "�S�z�I�@�S�z���A�S�z���I";
		mes "���Z�����͂����ܓ����I";
		mes "�ܓ������т�H�ׂĂ��Ȃ��̂�!!";
		mes "�S�z�c�c�S�z�c�c�S�z�c�c";
		next;
		mes "-���̎q�͂��Ⴊ�ݍ��݁A�Z�L����-";
		next;
		mes "-���Ǝv���Ă�����A";
		mes "�����Ȃ肠�Ȃ����w�ł����A";
		mes "�ɂ�݂��Ă���-";
		next;
		mes "[�C�V�e]";
		mes "���Ȃ��A���̎����Ă��ł���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@�c�c����A���́c�c";
		next;
		emotion 23,"";
		mes "-���̎q�͂����Ȃ�̎��Ō˘f��";
		mes "���Ȃ��̎������݁A";
		mes "�������ƈ����񂹂�-";
		mes "-�����āA�����Ȑ��ł����₢��-";
		next;
		mes "[�C�V�e]";
		mes "�Ȃɂ��񂽁B";
		mes "����ȉ��z�ȏ��̎q�����Ă�";
		mes "���Ƃ��v��Ȃ��́H";
		mes "���������Ȃ��́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���A����c�c";
		mes "���́c�c���߂�Ȃ����c�c";
		mes "�}�b�`�c�c�����܂��B";
		mes "������ł����H";
		next;
		mes "[�C�V�e]";
		mes "�@�ׂȏ����̐S�������Ă����āA";
		mes "�}�b�`��ōςނƎv���Ă�́H";
		mes "���̒�����ȂɊÂ��Ȃ��̂�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǁc�c�ǂ�����΂�����ł����H";
		next;
		mes "[�C�V�e]";
		mes "�ʂɓ��������Ȃ���B";
		mes "������Ƃ������肢�����";
		mes "�����ė~�������Ă����B";
		mes "�I�[�P�[�H";
		next;
		mes "[�C�V�e]";
		mes "���̉ƂɁu�C�V���v���Đl�������B";
		mes "���̐l��������`���Ă����āB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ȃ�Ŏ�������Ȃ��Ƃ��c�c";
		next;
	default:
		emotion 18;
		emotion 23,"";
		mes "[�C�V�e]";
		mes "�t�t�t�c�c�J�v���q�ɂ����c�c";
		mes "�˂��H";
		mes "�L�����v�t�@�C�A�͍D���H";
		mes "���͂��`���D����";
		mes "�t�t�c�c�t�t�t�t�t�c�c";
		next;
		mes "-�����͎����Ă����}�b�`�ɉ΂�����";
		mes "���΂�ł���-";
		mes "-�c�c�c�c-";
		mes "-�����Ƃ���ɂ����ق����������낤-";
		if(XMAS_4EVE == 0)
			set XMAS_4EVE,1;
		close;
	case 11:
		mes "[�C�V�e]";
		mes "�c�c�����l�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ꂽ���͂����I";
		mes "�N�̎�������Ȃ������I";
		mes "���������ł���I";
		next;
		mes "[�C�V�e]";
		mes "�c�c�����ˁc�c";
		mes "�ł��A���ƈ���������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܁A�܂���!?";
		mes "������Ȃ�ł��������Ȃ�!?";
		next;
		mes "[�C�V�e]";
		mes "�c�c���̂悤�Ɍ�����Ɓc�c";
		mes "���A����������āc�c";
		mes "�S���Ƃ��Ă������Ȃ����Ⴄ�c�c";
		mes "����ȐS��g�߂�ɂ́A";
		mes "�}�b�`�𓔂��āc�c";
		mes "�����Ď肪�����āc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���[�����A�킩�����I";
		mes "�킩������I";
		mes "���x�͉�!?";
		mes " ";
		mes "�i�C�V�e�I�@���낵�������I�j";
		next;
	case 12:
		if(XMAS_4EVE == 12 && countitem(525))
			break;
		mes "[�C�V�e]";
		mes "�u^0000FF���\��^000000�v";
		mes "1�ł��������ɓ���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���H�@���[����ʂȂ�c�c";
		mes "����A����Ȃ炷���Ɏ�ɓ���I";
		mes "������ΗV�т͂��߂�����ˁI";
		next;
		mes "-�����͂��΂炭���ނ��Ă������A";
		mes "�����Ă����}�b�`���A�t�b�Ɛ�����";
		mes "�΂�������-";
		next;
		mes "[�C�V�e]";
		mes "�ӂ��c�c";
		mes "�����s���Ă���Ȃ��ƁA";
		mes "�}�b�`���c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�s���Ă܂���܂��I";
		if(XMAS_4EVE == 11)
			set XMAS_4EVE,12;
		close;
	}
	//12�̑���
	mes "[" +strcharinfo(0)+ "]";
	mes "���A�������܁I";
	mes "�ق�I�@���\��I";
	next;
	mes "[�C�V�e]";
	mes "�c�c�c�c�c�c�c�c���肪�Ƃ��B";
	next;
	emotion 23,"";
	mes "[" +strcharinfo(0)+ "]";
	mes "���A���������ł���I";
	mes "�c�c����ȏ�́c�c���H";
	next;
	emotion 32;
	mes "-�����̓}�b�`�ɓ_���Ă����΂�";
	mes "�����Ȍ��Ő���������-";
	next;
	mes "[�C�V�e]";
	mes "�c�c�c�c�ӂ��c�c";
	mes "���肪�Ƃ��������܂����B";
	mes "�����ƑO�Ƀp�p�ƃ}�}��";
	mes "���Ȃ��Ȃ��Ă���A���Z�����ȊO��";
	mes "����Ȃɍ\���Ă��ꂽ�̂�";
	mes "���Ȃ������߂Ăł��c�c";
	next;
	mes "[�C�V�e]";
	mes "���̂��߂ɖ����΂��肵�āA";
	mes "���ׂ��Ђ�����������Z�����c�c";
	mes "���̂��Z�����ɁA���̖��\���";
	mes "�ǂ����Ă��������������c�c";
	next;
	mes "[�C�V�e]";
	mes "���̂��߂ɃN���X�}�X�c���[��";
	mes "����������Č����Ă邯�ǁA";
	mes "�N���X�}�X�c���[�������";
	mes "�g�����ƒ�̐^���������������̂�";
	mes "���Z�����c�c";
	next;
	mes "[�C�V�e]";
	mes "����Ȃ��Z�����̂��߂ɁA";
	mes "�ō��̃N���X�}�X��p�ӂ��Ă����悤�I";
	mes "���Z����񂪖����Ă��N���X�}�X��";
	mes "��������������c�c";
	mes "���Ȃ��ɐF��Ȏ��������Ă��܂����c�c";
	next;
	mes "[�C�V�e]";
	mes "�c�c���̖����Ȃ��肢�𕷂��Ă���āA";
	mes "�{���ɂ��肪�Ƃ��������܂����c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���A����c�c�n�n�c�c";
	mes "�i���肢����Ȃ��ċ����ł���I�j";
	next;
	mes "[�C�V�e]";
	mes "���Ȃ��̋�J�ɔ�ׂ��";
	mes "�債�����̂���Ȃ����ǁc�c";
	mes "������ǂ����c�c";
	next;
	emotion 18;
	mes "[�C�V�e]";
	mes "�����^4A4AFF���C�[�[^000000�Ƃ����f�U�C�i�[����";
	mes "�����ς���c�c�c�c";
	mes "�c�c�������T���^�̈ߑ��ł��B";
	mes "�C�ɓ����Ă��炦��Ǝv���܂��B";
	next;
	emotion 18,"";
	mes "[" +strcharinfo(0)+ "]";
	mes "���c�c���c�c����͂ǂ����c�c";
	next;
	mes "[�C�V�e]";
	mes "����A�܂�����΂��āB";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���H�@���A���āH";
	next;
	emotion 18;
	mes "[�C�V�e]";
	mes "�����I�@�Ȃ�ł�����܂���B";
	mes "�����A����������󂯎���Ă��������B";
	next;
	sc_start3 SC_BLIND,0,0,0,0,5000,10;
	mes "-���Ȃ��͏������n���Ă��ꂽ����";
	mes "�J���悤�Ƃ���-";
	mes "-���̏u�ԁI-";
	mes "-�㓪�����猃�����ɂ݂�����A";
	mes "�ڂ̑O���^�����ɂȂ���-";
	next;
	mes "[�C�V�e]";
	mes "�{���ɂ��肪�Ƃ��B";
	mes "�����āA�܂���낵���B";
	mes "�t�t�t�t�t�B";
	next;
	mes "-�ӎ��������u�ԁA";
	mes "�������}�b�`�ɉ΂�t���A";
	mes "�ӂ��Ƒ��Ő��������̂�������-";
	mes "-�����āA���Ȃ��̓��̒����ǂ�ǂ�";
	mes "�^�����ɂȂ��Ă������c�c-";
	set XMAS_4EVE,0;
	delitem 525,1;
	getitem 12132,1;
	close;
}

xmas_in.gat,109,109,3	script	�C�V��	887,{
	switch(XMAS_4EVE) {
	case 0:
	case 1:
		mes "[�C�V��]";
		mes "�c�c�������c�c";
		mes "�o�C�g�����Ȃ��Ⴂ���Ȃ��̂Ɂc�c";
		mes "�Q�z�Q�z�c�c�B";
		mes "���N���C�V�e�ɃN���X�}�X";
		mes "�v���[���g�����������̂Ɂc�c";
		mes "�w�b�N�V�����I�@�Q�z�Q�z�c�c�B";
		if(XMAS_4EVE != 1)
			close;
		next;
		mes "[�C�V��]";
		mes "���ɂ���Ă���Ȏ���";
		mes "���ׂ��Ђ��Ȃ�āc�c";
		mes "�ł��̈����Z�ł��߂��c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ă����ł���!?";
		mes "������`���܂���I";
		next;
		mes "[�C�V��]";
		mes "�����H�@���A�N�H";
		mes "�ǂ����Ă����Ɂc�c�H";
		mes "����ɁA�ǂ����Ō����悤�ȁc�c";
		mes "�b�N�V�����I�@�Q�z�B";
		next;
		emotion 28,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�������Ȃ��Ⴂ���Ȃ�����";
		mes "�����Ă�������!!";
		mes "���ł��H�@��������΂�����ł���!?";
		mes " ";
		mes "�i�L�����v�t�@�C�A�����I";
		mes "�L�����v�t�@�C�A�����͂��߂�!!�j";
		next;
		mes "[�C�V��]";
		mes "�q�b�c�c���A���Ɓc�c";
		mes "���Ȃ����Ⴂ���Ȃ��̂�";
		mes "�P�[�L��z�B����o�C�g�Łc�c";
		mes "�Q�z�A�Q�z�Q�z�A�Q�z�c�c";
		next;
		mes "[�C�V��]";
		mes "�w�b�N�V���I";
		mes "�c�c�����܂ň�T�ԓ����΁c�c";
		mes "�N�V���I�@���������ǃc���[�ɂł���";
		mes "���݂̖؂����炦�c�c";
		next;
		mes "[�C�V��]";
		mes "�Q�z�c�c�Q�z�b�c�c";
		mes "���ׂ��Ђ�������āc�c";
		mes "�c�c�b�N�V���I�@�Q�z�Q�z�B";
		mes "�̂��h���āc�c";
		next;
		mes "[�C�V��]";
		mes "�c���[�������₵���N���X�}�X�c�c";
		mes "�Q�z�c�c";
		mes "�������肷��C�V�e���v���Ɓc�c";
		mes "�ł��A�����w�ɗ͂�����Ȃ��c�c";
		mes "�c�c�Q�z�A�Q�z�c�c";
		next;
		mes "[�C�V��]";
		mes "^4A4AFF���b�h�j�A^000000���񂪁c�c";
		mes "�҂��Ă���̂Ɂc�c";
		mes "�Q�z�c�c�S�z�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��������Q�ĂĂ��������I";
		mes "���v�A�킩��܂����I";
		mes "��͔C���Ă��������I";
		mes "����A���͂����!!";
		next;
		mes "[�C�V��]";
		mes "���H�@�S�z�c�c������Ƒ҂��āB";
		mes "���Ȃ��͈�́c�c";
		next;
		mes "-�w���z���ɐ��������������A";
		mes "�C�ɂ��Ă����Ȃ�-";
		mes "-�������āu���b�h�j�A�v�Ƃ����l��";
		mes "�K�˂ɍs�����I-";
		mes "-�L�����v�t�@�C�A�����͍���I-";
		set XMAS_4EVE,2;
		close;
	default:
		mes "[�C�V��]";
		mes "�S�z�c�c���A���Ȃ��́c�c";
		mes "�ǂ�����^4A4AFF���b�h�j�A^000000����́c�c";
		mes "�S�z�I�@�d���𕷂��Ă������̂ł����H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���́c�c";
		next;
		mes "[??????]";
		mes "�c�c�c�c";
		mes "-�V���b�I-";
		next;
		mes "-���̊O����A";
		mes "�}�b�`�ɉ΂�_����悤��";
		mes "���C�����������Ă���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�c�c����ׂ�Ȃ��Ď����c�c�j";
		mes "�����A���C�ɂȂ��炸�ɁI";
		mes "�ł́A���͂���ŁI";
		next;
		mes "[�C�V��]";
		mes "���H�@�S�z�c�c������Ƒ҂��āB";
		mes "���Ȃ��͈�́c�c";
		next;
		mes "-�w���z���ɐ��������������A";
		mes "�C�ɂ��Ă����Ȃ�-";
		mes "-�������āu���b�h�j�A�v�Ƃ����l��";
		mes "�K�˂ɍs�����I-";
		mes "-�L�����v�t�@�C�A�����͍���I-";
		close;
	case 9:
		mes "[�C�V��]";
		mes "�S�z�I�@�S�z�c�c";
		mes "�����c�c�S�z�S�z�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�C�V���I";
		mes "�������肵�āI";
		mes "���v�ł���!?";
		next;
		mes "[�C�V��]";
		mes "�c�c�c�c���H";
		mes "���Ȃ��́c�c";
		mes "�c�c���A���̎�Ɏ����Ă���؂�!?";
		mes "�܂����I";
		mes "�l�̃o�C�g������肵����ł����I";
		next;
		mes "[�C�V��]";
		mes "�l�ɂ́A��������̂Ɂc�c";
		mes "�S�z�I�@�S�z�c�c";
		mes "��l�����Ő������Ȃ��Ⴂ���Ȃ��̂ɁI";
		mes "����Ȃ̂ɂ��Ȃ��́I";
		mes "�c�c�O�c�c�Q�z�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A������Ȃ��ł��������I";
		mes "��������Ȃ���ł��I";
		mes "���͂����A�N�̎�`���������������B";
		mes "�������ꂾ���Ȃ�ł��I";
		mes "���̖؂��A�o�C�g�������ɏI���������";
		mes "�͂��ɂ�����ł���H";
		next;
		mes "-�N�O�Ƃ��Ȃ���P�����ރC�V����";
		mes "�����Ȃ��݂̖؂�G�点��ƁA";
		mes "���������������������-";
		next;
		mes "[�C�V��]";
		mes "�c�c�S�z�c�c�ǂ����āH";
		mes "���߂ĉ�l���ǂ�����";
		mes "�����Ă�����ł����c�c�H";
		mes "�c�c����c�c�ǂ����ŉ�����悤��";
		mes "�C�����邯�ǁc�c�S�z�I�@�S�z�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����͌N�́c�c";
		mes "�c�c�c�c!?";
		next;
		mes "-���E�̋��ɓ��������̊O�ɂ́A";
		mes "�΂̓_�����}�b�`������";
		mes "�����Ȏ肪������-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���c�c����Ȃ̓��R�ł��I";
		mes "���́c�c���́c�c";
		mes "���[���Ɓc�c�c�c���́c�c";
		mes "�i�����A���ł�������I�j";
		mes "�����I�@���́c�c";
		next;
		input '@word$;
		emotion 23;
		emotion 23,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "����^4A4AFF" +'@word$+ "^000000�ł�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���[���Ɓc�c������c�c";
		mes "���́c�c";
		next;
		emotion 5;
		mes "[�C�V��]";
		mes "�c�c�����c�c��������ł����c�c";
		mes "���Ȃ���^4A4AFF" +'@word$+ "^000000�c�c";
		mes "�������肢���Ă�������ł��ˁc�c";
		mes "�S�c�c�S�z�c�c�S�z�I�@�S�z�I";
		next;
		emotion 4,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�c�c����[�c�c�j";
		mes "�i�����ςȕ����ɘb���i��ł�[�c�c�j";
		mes " ";
		mes "�́c�c�͂͂́B�����I�@�����Ȃ́I";
		mes "���ł������Ă����񂾂�I";
		mes "�i�����ǂ��ɂł��Ȃ�[�I�j";
		next;
		mes "[�C�V��]";
		mes "�����c�c�{���Ɂc�c�S�z�c�c";
		mes "^3131FF" +'@word$+ "^000000�Ȃ�ł��ˁB";
		mes "�ł́A���肢�ł��B�l�̑����";
		mes "�N���X�}�X�c���[�̏�����c�c�S�z�B";
		mes "���肢���܂��c�c";
		break;
	case 10:
		if(countitem(7219) < 3 || countitem(538) < 1) {
			mes "[�C�V��]";
			mes "���肢�ł��c�c�l�̕ς���";
			mes "�N���X�}�X�c���[�̏�����c�c�S�z�B";
			mes "���肢���܂��c�c";
			break;
		}
		mes "[�C�V��]";
		mes "�S�z�I�@�S�z�A�S�z�I";
		mes "�l�����񂾕��͂ǂ��ł����c�c�H";
		mes "�Ȗ͗l�̌C�� 3�ƁA";
		mes "�悭�Ă����N�b�L�[ 1�c�c�S�z�I";
		mes "�����āA�l�`�͂ǂ�Ȃ̂ł����H";
		next;
		switch(select("�|�����l�`","�`�����`�����l�`","�ʂ������","�݂艺����ꂽ�l�`","�X�|�A�l�`","�^�k�L�l�`",
					"�T���l�`","�o�b�^�l�`","���L�̐l�`","���i�b�N�l�`","�I�V���X�l�`","�o�t�H���b�g�l�`")) {
			case 1:	set '@itemid,741; break;
			case 2:	set '@itemid,742; break;
			case 3:	set '@itemid,740; break;
			case 4:	set '@itemid,7212; break;
			case 5:	set '@itemid,743; break;
			case 6:	set '@itemid,754; break;
			case 7:	set '@itemid,753; break;
			case 8:	set '@itemid,752; break;
			case 9:	set '@itemid,7206; break;
			case 10: set '@itemid,7277; break;
			case 11: set '@itemid,751; break;
			case 12: set '@itemid,750; break;
		}
		if(countitem('@itemid) < 1) {
			emotion 1;
			mes "[�C�V��]";
			mes "�c�c���H";
			mes "�ǂ��ł����c�c�S�z�A�S�z�I";
			mes "���݂܂���c�c";
			mes "�悭�����Ȃ��̂ł����c�c";
			close;
		}
		mes "[�C�V��]";
		switch(@menu) {
		case 1:
			mes "���c�c�����|�����l�`�ł��ˁB";
			mes "�S�z�I�@�S�z�I";
			break;
		case 2:
			mes "���c�c�`�����`�����l�`�ł��ˁB";
			mes "�S�z�I�@�S�z�I";
			mes "�����Ɓc�c�S�z�I";
			break;
		case 3:
			mes "���c�c�Y��Ȃʂ�����݂ł��ˁB";
			mes "�S�z�I�@�S�z�I";
			mes "�ƂĂ��������c�c�S�z�I";
			break;
		case 4:
			mes "���c�c�݂艺����ꂽ�l�`�H";
			mes "�S�z�I�@�S�z�I";
			mes "�c�c�����A�����Ɓc�c�S�z�I";
			break;
		case 5:
			mes "����́c�c�X�|�A�l�`�ł��ˁB";
			mes "�S�z�I�@�S�z�I";
			mes "�ƂĂ����c�c�S�z�I";
			break;
		case 6:
			mes "���c�c����̓^�k�L�l�`�c�c";
			mes "�S�z�I�@�S�z�I";
			mes "���߂Č��܂����c�c�S�z�I";
			break;
		case 7:
			mes "���c�c�T���l�`�ł����H";
			mes "�S�z�I�@�S�z�I";
			mes "�悭��ɓ���܂����ˁc�c�S�z�I";
			break;
		case 8:
			mes "���c�c�o�b�^�l�`�ł����H";
			mes "�S�z�I�@�S�z�I";
			mes "����Ȃ̂������ł��ˁc�c�S�z�I";
			break;
		case 9:
			mes "���c�c���L�̐l�`�ł����I";
			mes "�S�z�I�@�S�z�I";
			mes "�ځA�l���~�������炢�c�c�S�z�I";
			break;
		case 10:
			mes "���c�c���i�b�N�l�`�ł����B";
			mes "�S�z�I�@�S�z�I";
			mes "�ƂĂ������ł��ˁc�c�S�z�I";
			break;
		default: //�I�V���X�E�o�t�H���b�g�l�`
			mes "���c�c�����" +getitemname('@itemid)+ "!?";
			mes "�S�z�I�@�S�z�I";
			mes "�{���ɂ������񂾁c�c�S�z�I";
			break;
		}
		mes "����" +(@menu==9? "���": "")+ "���ł����Ǝv���܂��B";
		mes "�{���Ɂc�c���肪�Ƃ��������܂��c�c";
		next;
		mes "-�C�V���Ɍ�����悤�ɁA";
		mes "�N�b�L�[�ƎȖ͗l�̌C���A";
		mes "�����Đl�`�����݂̖؂ɏ������-";
		mes "-��������ƃo�����X�͈�����";
		mes "�C�V���͂���������������-";
		next;
		mes "[�C�V��]";
		mes "�S�z�c�c�S�z�I";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�����ł��Ȃ��Z�����ǁA";
		mes "���Ȃ��̂������Łc�c�S�z�I";
		mes "���͊��ł���܂��c�c";
		next;
		mes "[�C�V��]";
		mes "�悩������c�c";
		mes "�ȑO�̃o�C�g�ł�������̂�";
		mes "������Ă��������c�c�S�z�I";
		mes "�l�Ȃ�́c�c���ӂ̋C�����ł��c�c";
		set XMAS_4EVE,11;
		delitem 7219,3;
		delitem 538,1;
		delitem '@itemid,1;
		switch(@menu) {
		case 1: //�|�����l�`
		case 2: //�`�����`�����l�`
		case 3: //�ʂ������
		case 4: //�݂艺����ꂽ�l�`
			getitem 12200,3;
			getitem 12130,1;
			break;
		case 5: //�X�|�A�l�`
		case 6: //�^�k�L�l�`
		case 7: //�T���l�`
		case 8: //�o�b�^�l�`
			getitem 12200,5;
			getitem 12130,1;
			getitem 522,1;
			break;
		case 9: //���L�̐l�`
		case 10: //���i�b�N�l�`
			getitem 12200,5;
			getitem 12130,3;
			getitem 548,3;
			break;
		case 11: //�I�V���X�l�`
		case 12: //�o�t�H���b�g�l�`
			getitem 12200,7;
			getitem 12130,5;
			getitem 607,1;
			break;
		}
		close;
	case 11:
	case 12:
		mes "[�C�V��]";
		mes "�c�c�S�z�I�@�S�z�S�z�I";
		mes "�{���ɂ��肪�Ƃ��������܂��c�c";
		mes "���͂����c�c�S�z�I";
		mes "�y�����N���X�}�X���}����̂�";
		mes "�F�邾���ł��c�c�S�z�S�z�B";
		close;
	}
	//9,10�̑���
	next;
	mes "[�C�V��]";
	mes "�C���Ɛl�`���c�c�N�V�����I";
	mes "���Ă��炦����c�c�S�z�I";
	mes "���ƁA�N�b�L�[������΁c�c";
	mes "�S�z�S�z�I�@�S�z�c�c";
	next;
	mes "[�C�V��]";
	mes "^0000FF�Ȗ͗l�̌C�� 3�ƁA";
	mes "�悭�Ă����N�b�L�[ 1��^000000�c�c�S�z�B";
	mes "�����āA^0000FF���ł������̂Ől�`����B^000000";
	mes "�ǂ����c�c�S�z�A���肢���܂��c�c";
	next;
	mes "-�C�V���̓N�V���~�ƃZ�L��";
	mes "�U�߂��Ȃ�����A";
	mes "�����Ɏ����̊肢��������-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "����ʂȂ炨������p�I";
	mes "��͎��ɔC���āA�������x��łāI";
	mes " ";
	mes "�i�L�����v�t�@�C�A�͂₾�I";
	mes "�L�����v�t�@�C�A�̔n���I�j";
	if(XMAS_4EVE == 9)
		set XMAS_4EVE,10;
	close;
}

xmas.gat,138,140,0	script	���b�h�j�A	873,{
	switch(XMAS_4EVE) {
	case 0:
	case 1:
	case 2:
		emotion 6;
		mes "[���b�h�j�A]";
		mes "�����A�܂����˂��̂��I";
		mes "���ꂶ��A�N���X�}�X�P�[�L��";
		mes "�����̃P�[�L�ɂȂ����܂�����˂����I";
		mes "^4A4AFF�C�V��^000000�͉�����Ă񂾁I";
		if(XMAS_4EVE != 2)
			close;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�C�V���̑���ŗ��܂����I";
		mes "��������΂�����ł����I";
		next;
		mes "[���b�h�j�A]";
		mes "�c�c�������O�H";
		mes "�d���̓C�V�����c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�C�V���͍��A���ׂ��Ђ��Ă��܂���";
		mes "���������ł��Ȃ���ł��I";
		mes "���ɂ��ׂĂ�C���A�x��ł܂��B";
		mes "������͂₭���Ɏd�����I";
		next;
		mes "[���b�h�j�A]";
		mes "�c�c���O�A�ڂ��R���Ă���ȁI";
		mes "�悵�A�C�ɓ������I";
		mes "���O�ɃN���X�}�X�̃P�[�L��";
		mes "�z�B���Ă��炨���I";
		next;
		mes "[���b�h�j�A]";
		mes "�����A�͂₭�s�����I";
		mes "�y�����N���X�}�X�̉^����";
		mes "���O�̎�ɂ������Ă���ƁA";
		mes "�̂ɖ����Ă����b�I";
		set XMAS_4EVE,3;
		close;
	case 3:
		mes "[���b�h�j�A]";
		mes "���������������Ă���I";
		mes "�����P�[�L��z�B���Ă����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́A�z�B��́H";
		next;
		mes "[���b�h�j�A]";
		mes "����H�@�����ĂȂ��̂��H";
		mes "���傤���˂��Ȃ��B";
		mes "^0000FF��x���������Ă�邩��";
		mes "��[�������񂾂�!!!!^000000";
		next;
		mes "[���b�h�j�A]";
		mes "�P�[�L�̖��O�������Ɗo�����I";
		mes "�܂��A^0000FF�u�W���X�g�V�[�Y���v^000000��";
		mes "^FF0000�u�p���X�v^000000�����ɁI";
		next;
		mes "[���b�h�j�A]";
		mes "^0000FF�u�}�U�[�K�[�f���v^000000��";
		mes "^FF0000�u�i�r�_�v^000000�����ɁI";
		next;
		mes "[���b�h�j�A]";
		mes "^0000FF�u�}�C���f�B�[�T���^�N���[�X�v^000000��";
		mes "^FF0000�u�W���C���v^000000�����ɁI";
		next;
		mes "[���b�h�j�A]";
		mes "^0000FF�u�W���O���x���n�b�s�[�v^000000��";
		mes "^FF0000�u�m�G���v^000000�����ɁI";
		next;
		mes "[���b�h�j�A]";
		mes "�����������ɓ͂���񂾁B";
		mes "�����A�킩�����炳�����ƍs�����I";
		set XMAS_4EVE,4;
		close;
	default:
		mes "[���b�h�j�A]";
		mes "�����A�͂₭�s�����I";
		mes "�y�����N���X�}�X�̉^����";
		mes "���O�̎�ɂ������Ă���ƁA";
		mes "�̂ɖ����Ă����b�I";
		close;
	case 8:
		mes "[���b�h�j�A]";
		mes "�����A�߂��Ă������B";
		mes "�����ɓ͂������ĘA���͗��Ă����B";
		mes "���q������݂�Ȗ������Ă���悤���B";
		mes "�{���ɂ���J����B";
		next;
		mes "[���b�h�j�A]";
		mes "�悵�I";
		mes "����̓C�V���Ɩ񑩂����o�C�g�ゾ�I";
		mes "����������ǁA����Ȃ�̖؂��B";
		mes "�������ƕ��ׂȂ�Ď����āA";
		mes "������悤�ɂȂ���Č����Ƃ��Ă���B";
		next;
	case 9:
		mes "[���b�h�j�A]";
		mes "�����ƃC�V���ɓn���񂾂��B";
		mes "�܁A����͂��O��";
		mes "�T���^�N���[�X���ĂƂ����ȁB";
		mes "�n�b�n�b�n�b�n�b�n�B";
		next;
		emotion 18;
		mes "[���b�h�j�A]";
		mes "�����[�N���X�}�X�I";
		mes "���O���j���̃N���X�}�X���y���߂�I";
		if(XMAS_4EVE == 8) {
			next;
			mes "^0000FF-���b�h�j�A����";
			mes "�����Ȃ��݂̖؂��󂯎�����I-";
			set XMAS_4EVE,9;
		}
		close;
	case 10:
	case 11:
	case 12:
		mes "[���b�h�j�A]";
		mes "�����I�@�N���ԕ@���I";
		mes "���̓\���Ȃ񂼂ɋ����͂Ȃ��I";
		close;
	}
}

xmas.gat,168,160,4	script	�p���X	46,{
	if(XMAS_4EVE < 4) {
		mes "[�p���X]";
		mes "���������I";
		mes "�N���X�}�X�P�[�L�͂܂����I";
		mes "�܂����A�P�[�L�̖���";
		mes "�n���̂悤�ȃN���X�}�X��";
		mes "�}���鎖�ɂȂ�񂶂�Ȃ����낤�ȁI";
		next;
		mes "[�p���X]";
		mes "^4A4AFF���b�h�j�A^000000����͉������Ă���񂾁I";
		close;
	}
	if(XMAS_4EVE >= 5) {
		emotion 18;
		mes "[�p���X]";
		mes "�{���ɂ��肪�Ƃ��B";
		mes "����Ŋy�����N���X�}�X��";
		mes "�����������͏I�������B";
		mes "�N���K���ȃN���X�}�X��";
		mes "��������悤�ɂˁB";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "�x��Đ\���󂠂�܂���I";
	mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
	next;
	mes "[�p���X]";
	mes "�����I�@����Ɨ������I";
	mes "���N�̓P�[�L������";
	mes "�N���X�}�X���������̂���";
	mes "�S�z���Ă�������B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�{���ɂ��݂܂���B";
	mes "�����Ɓc�c�u�p���X�v�����ɂ�";
	mes "���̃P�[�L�ł��ˁc�c";
	next;
	input '@word$;
	mes "[" +strcharinfo(0)+ "]";
	mes "�u�p���X�v�����Ă�";
	mes "�������ꂽ�P�[�L�́A����";
	if('@word$ != "�W���X�g�V�[�Y��") {
		mes '@word$+ "�ł����H";
		next;
		mes "[�p���X]";
		mes "�c�c����H";
		mes "���̒��������P�[�L�Ƃ�";
		mes "�Ⴄ�񂾂��c�c";
		close;
	}
	mes "^0000FF�u�W���X�g�V�[�Y���v^000000�ł����H";
	next;
	emotion 18;
	mes "[�p���X]";
	mes "�����A����I";
	mes "�{���ɂ������������I";
	mes "���肪�Ƃ��A�����Ă���J�l�B";
	set XMAS_4EVE,5;
	close;
}

xmas.gat,113,273,4	script	�i�r�_	711,{
	if(XMAS_4EVE < 5) {
		mes "[�i�r�_]";
		mes "�����c�c";
		mes "�N���X�}�X�P�[�L�͂܂�������H";
		next;
		mes "[�i�r�_]";
		mes "^4A4AFF���b�h�j�A^000000�����";
		mes "�������Ă���̂�����H";
		close;
	}
	if(XMAS_4EVE >= 6) {
		emotion 18;
		mes "[�i�r�_]";
		mes "���N���A�g�����čK����";
		mes "�N���X�}�X�ɂȂ肻������B";
		mes "���Ȃ����K���ȃN���X�}�X���B";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "�x��Đ\���󂠂�܂���I";
	mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
	next;
	mes "[�i�r�_]";
	mes "����Ɨ�����ˁB";
	mes "����܂�x������A";
	mes "���̂ɂł��������̂��ƐS�z������B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�{���ɂ��݂܂���B";
	mes "�����Ɓc�c�u�i�r�_�v�����ɂ�";
	mes "���̃P�[�L�ł��ˁc�c";
	next;
	input '@word$;
	mes "[" +strcharinfo(0)+ "]";
	mes "�u�i�r�_�v�����Ă�";
	mes "�������ꂽ�P�[�L�́A����";
	if('@word$ != "�}�U�[�K�[�f��") {
		mes '@word$+ "�ł����H";
		next;
		mes "[�i�r�_]";
		mes "�c�c����H";
		mes "���̒��������P�[�L����Ȃ��݂�����H";
		close;
	}
	mes "^0000FF�u�}�U�[�K�[�f���v^000000�ł����H";
	next;
	emotion 18;
	mes "[�i�r�_]";
	mes "���炠��A�Ƃ��Ă������������B";
	mes "�{���ɂ���J�l�ł����B";
	set XMAS_4EVE,6;
	close;
}

xmas.gat,119,155,5	script	�W���C��	878,{
	if(Sex == 0) {
		if(XMAS_4EVE < 6) {
			mes "[�W���C��]";
			mes "����ȂɊ������ɁA";
			mes "�ǂ��֍s�����Ƃ����̂ł����H";
			mes "��낵����΁A���̉Ɖ��Œg�܂�A";
			mes "�`���R���[�g�ł����ꏏ���܂��񂩁H";
			next;
			emotion 30;
			mes "[�W���C��]";
			mes "^4A4AFF���b�h�j�A^000000�̑Ӗ��ŁA";
			mes "�܂��N���X�}�X�P�[�L��";
			mes "�p�ӂł��Ă��܂��񂪁A";
			mes "���f�B�[�̊Â����Ŏ��̐S��";
			mes "�������Ă����Ȃ�A";
			mes "�P�[�L�Ȃ�ĕK�v�����ł��傤�B";
			close;
		}
		if(XMAS_4EVE >= 7) {
			emotion 30;
			mes "[�W���C��]";
			mes "�悤�����I";
			mes "�悤������������Ⴂ�܂����A";
			mes "�}�C�X�C�[�g�n�j�[�B";
			mes "�p�[�e�B�[�̏����͂ł��Ă��܂��񂪁A";
			mes "���Ȃ������邾���ŏ\���ł��I";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�x��Đ\���󂠂�܂���I";
		mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
		next;
		mes "[�W���C��]";
		mes "�����c�c����Ȃɔ���������";
		mes "�ǂ����Ă���Ȏ����c�c";
		mes "���Ȃ��̎肪�₽�����ɂ��炳��A";
		mes "��������₽���Ȃ��Ă���ł�";
		mes "����܂��񂩁I";
		next;
		mes "-�ނ͂��Ȃ��̎�����A";
		mes "�M�S�ȑ��Â����Œg�߂悤�Ƃ���-";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����c�c���A�����c�c";
		mes "�A�n�n�c�c���v�ł�����c�c";
		mes "�z�B���x��Ė{���ɂ��݂܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ɓc�c�u�W���C���v�����ɂ�";
		mes "���̃P�[�L�ł��ˁc�c";
		next;
		input '@word$;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u�W���C���v�����Ă�";
		mes "�������ꂽ�P�[�L�́A����";
		if('@word$ != "�}�C���f�B�[�T���^�N���[�X") {
			mes '@word$+ "�ł����H";
			next;
			mes "[�W���C��]";
			mes "�����`";
			mes "���Ȃ����͂��Ă����������P�[�L�Ȃ�";
			mes "���Ƃ��y�ŏo���Ă����Ƃ��Ă�";
			mes "�c�炸�S���H�ׂĂ��܂��܂��B";
			next;
			emotion 19,"";
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c���ꂶ��Ȃ��݂������c�c";
			close;
		}
		mes "^0000FF�u�}�C���f�B�[�T���^�N���[�X�v^000000";
		mes "�ł����H";
		next;
		mes "[�W���C��]";
		mes "�����I";
		mes "���f�B�[�������ė��Ă���������";
		mes "���̃P�[�L�I";
		mes "�{���ɂ����������ł��B";
		mes "�ǂ��ł��H�@���ꏏ�Ƀp�[�e�B�ȂǁH";
		next;
		emotion 19,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "����c�c�A�n�n�n�n�c�c";
		mes "�L����b�ł����A";
		mes "�܂��z�B���c���Ă���̂Łc�c";
		next;
		mes "[�W���C��]";
		mes "���A���f�B�[�I";
		mes strcharinfo(0)+ "!!";
		mes "���ł��A�₵���Ȃ�����";
		mes "���̎��ɉ�ɂ��Ă��������I";
		next;
		emotion 30;
		mes "[�W���C��]";
		mes "���͂��ł��I";
		mes "���Ȃ���g�����}������܂��傤�B";
		mes "���̔������P�[�L�̂悤��";
		mes "�Â��A���̌��t�𚑂��Ȃ���I";
		set XMAS_4EVE,7;
		close;
	}
	else {
		if(XMAS_4EVE < 6) {
			mes "[�W���C��]";
			mes "�������Ă���H";
			mes "���ɂł��������̂��H";
			next;
			mes "[�W���C��]";
			mes "����ɂ��Ă��A^4A4AFF���b�h�j�A^000000��";
			mes "�������Ă���񂾁H";
			mes "���̉������f�B�[������";
			mes "�P�[�L��҂������т�Ă���";
			mes "�ł͂Ȃ����c�c";
			close;
		}
		if(XMAS_4EVE >= 7) {
			emotion 32;
			mes "[�W���C��]";
			mes "����˂������Ă���񂾁H";
			mes "�z�B���I�������Ȃ�";
			mes "�������Ƃǂ����s���B";
			mes "������N�̎����ɂ��炳��悤���A";
			mes "���̓��f�B�[�ȊO�ɋ����͖����I";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�x��Đ\���󂠂�܂���I";
		mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
		next;
		mes "[�W���C��]";
		mes "�t���I";
		mes "����ȂɃg�����Ĕz�B���΂܂邩�I";
		mes "���N�̉č��ɃP�[�L�����邩��";
		mes "���҂��Ă��Ƃ��낾�������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�n�c�c�{���ɂ��݂܂���B";
		mes "�����Ɓc�c�u�W���C���v�����ɂ�";
		mes "���̃P�[�L�ł��ˁc�c";
		next;
		input '@word$;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u�W���C���v�����Ă�";
		mes "�������ꂽ�P�[�L�́A����";
		if('@word$ != "�}�C���f�B�[�T���^�N���[�X") {
			mes '@word$+ "�ł����H";
			next;
			mes "[�W���C��]";
			mes "�n�I�@�����܂ŊԈႤ�Ƃ͂ȁI";
			mes "�ǂ������ł����ꂽ�񂶂�Ȃ��̂��H";
			mes "��҂ɂł����Ă��������ǂ����I";
			close;
		}
		mes "^0000FF�u�}�C���f�B�[�T���^�N���[�X�v^000000";
		mes "�ł����H";
		next;
		mes "[�W���C��]";
		mes "�����͂����ƕ����Ă����悤���ȁB";
		mes "�悵�A���̂܂܂����ɒu���čs���B";
		set XMAS_4EVE,7;
		close;
	}
}

xmas.gat,157,126,5	script	�m�G��	717,{
	if(Sex == 1) {
		if(XMAS_4EVE < 7) {
			mes "[�m�G��]";
			mes "�L���n�n��";
			mes "�����[�N���X�}�`�X�B";
			mes "�f�G�Ȃ��E�Z�E���E���";
			next;
			emotion 30;
			mes "[�m�G��]";
			mes "^4A4AFF���b�h�j�A^000000����ɉ������";
			mes "�N���X�}�X�P�[�L�𑁂�����";
			mes "�`���Ă���Ȃ��H";
			mes "���[�A���������́I";
			close;
		}
		if(XMAS_4EVE >= 8) {
			mes "[�m�G��]";
			mes "�܂��s���ĂȂ������́H";
			mes "�������͂��߂�ˁ`";
			mes "���̗��l���Ď��i���₷������B";
			mes "�L���n��";
			next;
			mes "[??????]";
			mes "�����A�m�G���I";
			mes "�܂��O�ɏo�āA������Ă�񂾁I";
			next;
			emotion 18;
			mes "[�m�G��]";
			mes "���ł��Ȃ���`";
			mes "�����߂���ā`";
			next;
			emotion 9,"";
			mes "-�ޏ��͐��̂������Ɍ������āA";
			mes "�ɂ�����Ɣ��΂݂�����-";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�x��Đ\���󂠂�܂���I";
		mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
		next;
		mes "[�m�G��]";
		mes "�f�G�Ȃ��E�ɁE���E���E���";
		mes "���������x��������";
		mes "�I�V�I�L���鏊��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�n�c�c�{���ɂ��݂܂���B";
		mes "�����Ɓc�c�u�m�G���v�����ɂ�";
		mes "���̃P�[�L�ł��ˁc�c";
		next;
		input '@word$;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u�m�G���v�����Ă�";
		mes "�������ꂽ�P�[�L�́A����";
		if('@word$ != "�W���O���x���n�b�s�[") {
			mes '@word$+ "�ł����H";
			next;
			mes "[�m�G��]";
			mes "�L���n��";
			mes "����͒��������P�[�L����Ȃ���B";
			mes "�f�G�Ȃ��Z����ł��ԈႢ�͂���񂾁H";
			close;
		}
		mes "^0000FF�u�W���O���x���n�b�s�[�v^000000�ł����H";
		next;
		mes "[�m�G��]";
		mes "�L���n��";
		mes "����ȑf�G�Ȃ��Z����";
		mes "�͂��Ă��ꂽ�N���X�}�X�P�[�L�B";
		mes "���N�̃N���X�}�X��������";
		mes "���E�܁E���E����";
		next;
		mes "[??????]";
		mes "�����A�m�G���I";
		mes "���̒j�͒N���I";
		next;
		mes "[�m�G��]";
		mes "�L���A���ł��Ȃ����B";
		mes "�N���X�}�X�P�[�L��͂��Ă��ꂽ�l�B";
		next;
		emotion 9,"";
		mes "-�ޏ��͐��̂������Ɍ������āA";
		mes "�ɂ�����Ɣ��΂݂�����-";
		set XMAS_4EVE,8;
		close;
	}
	else {
		if(XMAS_4EVE < 7) {
			mes "[�m�G��]";
			mes "�����A���c�c";
			mes "^4A4AFF���b�h�j�A^000000����͂��ɂȂ�����";
			mes "�N���X�}�X�P�[�L��͂��Ă���́I";
			mes "���[�c�c��H";
			next;
			emotion 18;
			mes "[�m�G��]";
			mes "�L���n�b��";
			mes "����ȓ��Ɉ�l�H";
			mes "���Ȃ��{���ɉ��z�ˁB";
			mes "���l�ł��ł���悤��";
			mes "���F�肵�Ă����܂��傤���H";
			mes "�L���n�n�n�n�B";
			close;
		}
		if(XMAS_4EVE >= 8) {
			emotion 18;
			emotion 9,"";
			mes "[�m�G��]";
			mes "�L���n�b��@�܂��s���ĂȂ��́H";
			mes "�ځ[���Ƃ��Ă���A";
			mes "�����Ƃ������c��񂶂Ⴄ��H";
			mes "�L���n�n�n�n�n�n�B";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�x��Đ\���󂠂�܂���I";
		mes "�N���X�}�X�P�[�L�̔z�B�ł��I";
		next;
		emotion 18;
		emotion 6,"";
		mes "[�m�G��]";
		mes "�L���n�b��";
		mes "���o����͂���������Ƃ���΂���";
		mes "������Ȃ����Ⴂ���Ȃ���ˁB";
		mes "�����̂����̂��߂ɂˁ`";
		mes "�L���n�n�n�n�n�n�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�{���ɂ��݂܂���B";
		mes "�����Ɓc�c�u�m�G���v�����ɂ�";
		mes "���̃P�[�L�ł��ˁc�c";
		next;
		input '@word$;
		mes "[" +strcharinfo(0)+ "]";
		mes "�u�m�G���v�����Ă�";
		mes "�������ꂽ�P�[�L�́A����";
		if('@word$ != "�W���O���x���n�b�s�[") {
			mes '@word$+ "�ł����H";
			next;
			mes "[�m�G��]";
			mes "�L���n�n�n�n�B";
			mes "�h�{���S�������ɂ����āA";
			mes "���͋���ۂȂ́H";
			mes "����ȃP�[�L�A";
			mes "���͒������ĂȂ���`";
			next;
			emotion 6,"";
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c�c�c�c�c�c�c�c�c";
			close;
		}
		mes "^0000FF�u�W���O���x���n�b�s�[�v^000000�ł����H";
		next;
		mes "[�m�G��]";
		mes "�z�B�ł��A����΂��Ă���������";
		mes "��������ғ����Ȃ�Ƃ��Ȃ邩���ˁH";
		mes "�L���n��@����΂��ĂˁB";
		mes "���A�P�[�L�͂����ɒu���Ƃ��Ăˁ`";
		next;
		emotion 6,"";
		mes "[" +strcharinfo(0)+ "]";
		mes "�n�c�c�n�n�n�c�c";
		set XMAS_4EVE,8;
		close;
	}
}

//==============================================================
// ���C�[�[�̃T���^�X
//==============================================================
xmas_in.gat,89,92,4	script	���C�[�[	714,{
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�˂��˂��B";
	mes "���̐Ԃ��z���̎O�p�X";
	mes "�u�T���^�̂ڂ����v�̃f�U�C������";
	mes "������ƃ_�T�C�Ǝv��Ȃ��H";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����ŁI�@�A�[�e�B�X�g�ł���";
	mes "���̃��C�[�[���A�ꔧ�E���ŁA";
	mes "���̖X�q��������f�G�ɁA";
	mes "���h�ɂ��Ă����܂��傤�`�I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���A������Ƙb�͕ς�邯�ǁA";
	mes "���̈��������A���\�j��";
	mes "����Ă���X�q�c�c����";
	mes "���̎�������Ă��������̂Ȃ̂�B";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A���\�j��߂܂��Â炢�̂́A";
	mes "�ނ̖X�q�ɓ���ȗ͂����邹���Ȃ́B";
	mes "�E�t�t�c�c�����X�q��";
	mes "������Ƃ����͂�^��������ˁB";
	next;
	emotion 3;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���āA�����̕z������ɉ߂��Ȃ�";
	mes "���ʂ́u�T���^�̂ڂ����v����������A";
	mes "���̂Ƃ��Ɏ����ė��Ă���Ȃ��H";
	mes "��������A������";
	mes "�V�����X�q������Ă�������B";
	next;
	if(countitem(2236)<1) {
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "��Łu�T���^�̂ڂ����v������΁A";
		mes "���̌����Ă��邱�Ƃ���������B";
		mes "�z�`���g���}������A";
		mes "��������������Ȃ�������͂��I";
		next;
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "���̎����V�˓I�f�U�C���Z���X��";
		mes "�������āA���̖X�q��";
		mes "�f���炵�����̂ɂ��Ă�����B";
		mes "�����Ȃ������Ă��ĂˁI";
		close;
	}
	if(select("����̂��Ƃł����H","�������܂�")==2) {
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�����`�H";
		mes "�ށ`�A�d���Ȃ���ˁB";
		mes "���`���������ɂ͂Ȃ�Ȃ��̂ɁB";
		mes "�c�c�܂��悩������A���ĂˁI";
		close;
	}
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����I�@�����A����悱��B";
	mes "����A�t���t���B�����ˁ`�B";
	mes "������������āA���������������āA";
	mes "��������������΁A����A�������ˁB";
	mes "���A���̖X�q��f�G�ɂ��邽�߂ɁA";
	mes "������ƕK�v�ȕ�������񂾂��ǁc�c�B";
	next;
	if(select("�����K�v�ł����H","��ς����Ȃ̂ŁA���������ł�")==2) {
		emotion 18;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�����`���I";
		mes "��`���l���Ă݂āI";
		mes "����ȃ`�����X�ő��ɂȂ��̂�B";
		mes "�c�c�܂��悩������A���Ă�I";
		close;
	}
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����肪������ˁB���̎p���D����B";
	mes "���Ⴀ�A�ޗ������ǁA��{�͂���ς�";
	mes "�u�T���^�̂ڂ����v���̂��́B";
	mes "������A���̎��̍˔\�������g����";
	mes "�f���炵���A�����W���Ă������B";
	mes "������A���̖X�q�͕K�v�Ȃ����B";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����A�ޗ����������`�B";
	mes "�x�[�X�ƂȂ�^0000FF�T���^�̂ڂ���^000000��";
	mes "�X�q��҂ވׂ�^0000FF�T�{�e���̐j1��^000000�B";
	mes "�j����^����ׂ�^0000FF����10��^000000�B";
	mes "�K�^���Ăэ��ވׂ�^0000FF���U���[1��^000000�B";
	mes "���ꂾ������΁A�\���I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����ŗ��h�ɁA���̖����ɂ��ӂ��킵��";
	mes "�f���炵���X�q������Ă������B";
	next;
	if(countitem(2236)<1 || countitem(952)<1 || countitem(523)<10 || countitem(2608)<1) {
		emotion 3;
		mes "[�A�[�e�B�X�g�E���C�[�[]";
		mes "�ޗ���������΁A������";
		mes "�X�q���A�����W���Ă������I";
		mes "�����ˁ`�A���ʂɎ萔���͂���Ȃ���I";
		mes "�����C����������A�A�����傤�����B";
		close;
	}
	menu "���A����Ȃ炱���Ɂc�c",-;
	emotion 21;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�킨�I";
	mes "�����肾�������������łȂ�";
	mes "�s���͂�����̂ˁI";
	mes "�悵�A����Ȃ�A�����ɂł����B";
	mes "�A�[�e�B�X�g���C�[�[�̔\�͂�";
	mes "�ڂ̑O�łƂ��ƌ����Ă����܂��傤�`�I";
	next;
	mes "-�ޏ��́A�ޗ���S���󂯎����-";
	mes "-�����ĉ̂��������݂Ȃ���A";
	mes "�����𒍂������ɖX�q��Z���Ă�����";
	mes "���o���A����f�����قǂ���-";
	next;
	misceffect 42;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A�[�e�B�X�g���C�[�[�̎�ɂ�����΁`";
	mes "���̒��S�Ă̏j�����^������`��";
	next;
	mes "-�ޏ��́A�悭������Ȃ��n�t��";
	mes "���U���[�����ėn������-";
	mes "-�����āA�M�����̗n�t�ɂ��A";
	mes "�X�q���\�����Ă�����";
	mes "��{��{�ɁA���J�ɓh����-";
	next;
	misceffect 75;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�A�[�e�B�X�g���C�[�[�̎�ɂ�����΁`";
	mes "���̒��S�Ă̍K�����^������`��";
	next;
	mes "-�T�{�e���̐j���g���āA";
	mes "�ޏ��͂��̎��̉��f�����҂݁A";
	mes "�X�q�������-";
	next;
	misceffect 91;
	emotion 3;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����̓A�[�e�B�X�g���C�[�[�̊�Ձ`";
	mes "��V�˃f�U�C�i�[�̖��́A�����I";
	mes "�A�`�e�B�X�g�A���C�`�[��`��";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�����A�����I";
	mes "�ǂ��H�@�f�G�ł���H";
	mes "�v��������J�߂Ă���Ă����̂�B";
	mes "���̍�i�͑f���炵���ł���`��";
	mes "���̃f�U�C�i�[�s�G�[����";
	mes "�������Ⴄ���������̂�B";
	next;
	emotion 18;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�{���Ȃ瑽���̎萔����";
	mes "��������Ƃ��낾���ǁc�c";
	mes "�N���X�}�X���ʑ�T�[�r�X!!";
	mes "���̖X�q�𑼂̐l�ɂ�";
	mes "�����Ă�������Ă��Ƃ�";
	mes "�^�_�ɂ��܂��傤�I";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "�ǂ��ɍs���Ă��������ĂĂ�";
	mes "��ΐ�ΐ��!!";
	mes "���̖X�q��E���Ȃ��łˁI";
	next;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "����قǑf���炵���X�q��";
	mes "�悻�ł͂����炨���������Ă�";
	mes "��ɓ�����Ȃ�����ˁI";
	mes "�����������x�Ǝ�ɂ��邱�Ƃ�";
	mes "�ł��Ȃ��A���`�������M�d��";
	mes "���󂾂����!!";
	next;
	emotion 2;
	mes "[�A�[�e�B�X�g�E���C�[�[]";
	mes "���ꂶ��A�����X�q�𑼂̐l��";
	mes "�������ɂ����Ă�����Ⴂ�`�B";
	mes "�����`�A�A�[�e�B�X�g���C�[�[�Ɂ`";
	mes "�A�����W�ł��Ȃ����̂ȂǁA";
	mes "���̐��ɂȂ��`��";
	delitem 2236,1;
	delitem 952,1;
	delitem 523,10;
	delitem 2608,1;
	getitem 5136,1;
	close;
}