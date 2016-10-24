//==============================================================================
// Ragnarok Online The Sign Script     by AthenaDev
//
//�@�� SIGN_QUE -> 0�`144,198�`203
//==============================================================================

//============================================================
// Warp
//------------------------------------------------------------
//���b�c�̉�
prontera.gat,263,279,0	warp	signwarp1001	1,1,prt_in.gat,227,18
prt_in.gat,227,15,0	warp	signwarp1002	1,1,prontera.gat,263,275
//�_���X������
cmd_in01.gat,17,34,0	warp	signwarp1003	1,1,comodo.gat,187,164
//�n���[�h�̉�
geffen.gat,140,99,0	warp	signwarp1004	1,1,geffen_in.gat,166,50
geffen_in.gat,166,54,0	warp	signwarp1005	1,1,geffen.gat,137,102
//�T�C�I���̉�
um_dun01.gat,132,91,0	warp	signwarp1006	1,1,um_in.gat,15,20
um_in.gat,11,18,0	warp	signwarp1007	1,1,um_dun01.gat,129,90
um_in.gat,33,18,0	warp	signwarp1008	1,1,um_in.gat,89,11
um_in.gat,89,9,0	warp	signwarp1009	1,1,um_in.gat,33,16
//���@���L���[�_�a�i�q�~���j
himinn.gat,49,67,0	warp	signwarp1010	1,1,himinn.gat,49,75
himinn.gat,49,72,0	warp	signwarp1011	1,1,himinn.gat,49,63
himinn.gat,49,6,0	warp	signwarp1012	1,1,gef_fild07.gat,179,241
//�w���̊�
que_sign01.gat,113,132,0	warp	signwarp1013	1,1,nif_in.gat,117,173
que_sign01.gat,179,169,0	warp	signwarp1014	1,1,niflheim.gat,30,156
que_sign01.gat,179,19,0	warp	signwarp1014	1,1,niflheim.gat,30,156
que_sign01.gat,45,15,0	warp	signwarp1014	1,1,niflheim.gat,146,245
//�w���̒�
que_sign02.gat,22,313,0	warp	signwarp1014	1,1,niflheim.gat,30,156

//============================================================
// Monster
//------------------------------------------------------------
que_sign02.gat,0,0,0,0	monster	�G���V�F���g�}�~�[	1522,8,0,0,0
que_sign02.gat,0,0,0,0	monster	�C�r���h���C�h		1435,8,0,0,0
que_sign02.gat,0,0,0,0	monster	�O�[��			1423,20,0,0,0
que_sign02.gat,0,0,0,0	monster	�C���L���o�X		1580,8,0,0,0
que_sign02.gat,0,0,0,0	monster	�C���W���X�e�B�X	1446,8,0,0,0
que_sign02.gat,0,0,0,0	monster	�X�P���v���Y�i�[	1479,15,0,0,0
que_sign02.gat,0,0,0,0	monster	�]���r�v���Y�i�[	1480,15,0,0,0
que_sign02.gat,0,0,0,0	monster	���C�X			1475,15,0,0,0
que_sign02.gat,0,0,0,0	monster	�f�b�h���[���C�X	1566,8,0,0,0

//============================================================
// ��1��
//------------------------------------------------------------
-	script	���莆#sign	111,{
	cutin "sign_01",4;
	mes "����";
	next;
	cutin "sign_02",4;
	mes "����";
	next;
	cutin "sign_03",4;
	mes "����";
	next;
	cutin "sign_04",4;
	mes "�I���";
	if(SIGN_QUE == 0)
		set SIGN_QUE,1;
	close2;
	cutin "sign_04",255;
	end;
}
prontera.gat,147,305,0	duplicate(���莆#sign)	���莆	111
geffen.gat,168,175,0	duplicate(���莆#sign)	���莆	111
morocc.gat,168,265,0	duplicate(���莆#sign)	���莆	111
payon.gat,160,183,0	duplicate(���莆#sign)	���莆	111
aldebaran.gat,54,223,0	duplicate(���莆#sign)	���莆	111
alberta.gat,35,241,0	duplicate(���莆#sign)	���莆	111

prt_in.gat,227,45,0	script	�l�Êw��	804,{
	cutin "mets_alpha",2;
	switch(SIGN_QUE) {
	case 0:
		mes "[���b�c]";
		mes "���@�A�����ĒT���ɂ͓w�͂ƔS�肪";
		mes "�厖�ł��B";
		mes "�������A���̑O�ɏ\����";
		mes "�����⒲�����K�v�ł����ˁB";
		break;
	case 1:
		mes "[���b�c]";
		mes "����A�������p�ł����ȁH";
		next;
		if(select("���莆�����ė��܂���","�P�Ȃ�ʂ肷����ł�")==2) {
			mes "[���b�c]";
			mes "���̒��ɂ͐F�X�Ȑl�����܂��B";
			mes "�@��ɏ��荇���Ă��A�����";
			mes "�Ȃ��Ȃ����������Ƃ��ł��Ȃ��l�B";
			mes "���Ȃ��ɂ��A�������������";
			mes "��ۂ��󂯂܂����c�c";
			mes "����A����B";
			break;
		}
		mes "[���b�c]";
		mes "���₨��A�����ł����B";
		mes "�悭���Ă���܂����B";
		next;
		if(BaseLevel < 50) {
			mes "[���b�c]";
			mes "�������A�c�O�Ȃ���";
			mes "���Ȃ��ɂ��̎d����C����";
			mes "���Ƃ͂ł��܂���B�M�ӂ�";
			mes "�ӋC���݂����ł́A�o���Ȃ����Ƃ�";
			mes "����̂ł��B�����ƌo����ς�ł���";
			mes "���炵�Ă��������B";
			break;
		}
		mes "[���b�c]";
		mes "���`��A�ǂ��ł��傤�B";
		mes "���Ȃ��͏\���������ł��B";
		mes "������������������܂��̂ŁA";
		mes "���΂炭���Ԃ����������܂����B";
		next;
		mes "[���b�c]";
		mes "���`�A�Ƃ���ł��Ȃ��̂����O�́c�c";
		mes "^FF0000" +strcharinfo(0)+ "^000000�ł����B";
		mes "�͂��A���肪�Ƃ��������܂��B";
		mes "�ł́A�܂���قǁB";
		set SIGN_QUE,2;
		break;
	case 2:
		mes "[���b�c]";
		mes "�҂����Ă��܂��܂������H";
		mes "�v���Ă�����菀���Ɏ�Ԏ����";
		mes "���܂��܂��āB";
		mes "�\���󂲂����܂���B";
		next;
		mes "[���b�c]";
		mes "���[��c�c�����ł��ˁB";
		mes "�����ǂ����Ă���Ȓ��莆��";
		mes "�o�������A������܂����ȁH";
		mes "���ꂾ�����ɂƂ��āA��؂�";
		mes "���ƂȂ̂ł��B�����Ă��ׂ̈ɁA";
		mes "�܂��ȒP�Ȏ������󂯂Ă��������B";
		next;
		mes "[���b�c]";
		mes "���i���܂�����A�ڍׂ����b����������";
		mes "�v���܂��B���̖ړI�́A�ƂĂ��댯��";
		mes "�������Ƃ�������Ȃ��̂ŁA�N�ɂł�";
		mes "�C������b�ł͂Ȃ��̂ł��B";
		next;
		mes "[���b�c]";
		mes "���[��c�c�����ł��ˁ`�B";
		mes "�܂��A^FF0000�����N^000000�֍s���A";
		mes "^FF0000�A�[���A^000000��T���Ă��������B";
		mes "�ނ��ŏ��̎����ɂ��ċ�����";
		mes "����܂��B";
		next;
		mes "[���b�c]";
		mes "����ł́A�S�Ă̎������I�������A";
		mes "�Ăю��̂��Ƃւ��炵�Ă��������B";
		mes "���̎��A�ڍׂ����b�����܂��B";
		next;
		mes "[���b�c]";
		mes "���`�c�c�A�[���A�ł����B";
		mes "���`�Ƃł��ˁA���̕��͎������";
		mes "�A�������ł́A�����b����";
		mes "����Ȃ����ƁB�����A���łɉ����";
		mes "���炵�āA�s�����Ȏv���������Ȃ�";
		mes "�����ɂ��l�т��܂��B";
		set SIGN_QUE,3;
		break;
	case 3:
		mes "[���b�c]";
		mes "���`��H";
		mes "�܂��o���Ȃ����Ă��Ȃ������̂ł����H";
		mes "�����A�[���A�ɂ͘A�����܂�������B";
		mes "�S�z�����ɂ��o�������������B";
		break;
	case 53:
		mes "[���b�c]";
		mes "�����c�c�����ł��B";
		mes "���₢��A��͂莄�̖ڂ�";
		mes "�����͂Ȃ������ł��ȁB";
		next;
		mes "[���b�c]";
		mes "�����܂Ŏ����ɑł������Ă����̂Ȃ�A";
		mes "�X�^�[�W���G���̂������6��";
		mes "�����Ă�����͂��ł��B";
		mes "�����A����ɂ��Đ������܂��傤�B";
		next;
		mes "[���b�c]";
		mes "����͉Ă��I���ɋ߂����c�c";
		mes "�k�~�����j�[���R���𒲍����Ă�������";
		mes "�����������̂Ȃ̂ł��B";
		mes "�����������͈�������̂ł����A";
		mes "��C�ɐG�ꂽ�Ƃ���A���̂悤��";
		mes "����Ă��܂����̂ł��B";
		next;
		mes "[���b�c]";
		mes "�����Ď��́A��������ʂ�ɂ������B";
		mes "����ɂ́A���������̗͂ł͖�������";
		mes "�����A���̂悤�Ȍ`�ŁA���͂���������";
		mes "����T�����Ƃɂ����̂ł��B";
		next;
		mes "[���b�c]";
		mes "���́A�X�^�[�W���G���̂�����ł���";
		mes "�܂��������̂����߂Ă��܂���B";
		mes "���̂�����A���ꂽ�\�ʂ�����ƁA";
		mes "��l�������܂��ł��傤�B";
		next;
		mes "[���b�c]";
		mes "����̃p�^�[���ł��邱�Ƃ��܂߁A";
		mes "���͂��ꂪ�����ł͂Ȃ�����";
		mes "�\�z���Ă���܂��B���̕�������ǂ��A";
		mes "����������Ă��邩�m�肽���̂ł��B";
		next;
		mes "[���b�c]";
		mes "���A���̂�������������";
		mes "���n�����������܂��񂩁B";
		mes "�ʔ������̂������܂��傤�B";
		next;
		misceffect 304;
		mes "^3355FF���b�c�̓X�^�[�W���G���̂������";
		mes "�󂯎��ƁA������A������������";
		mes "���o���A��̌`�ɍ��킹���B";
		mes "����ƁA��ɍ��킳�ꂽ�����炪�A";
		mes "�_��I�ȋP��������n�߂�-^000000";
		next;
		mes "[���b�c]";
		mes "�������ł��H";
		mes "���̂悤�ɂȂ��Ă��Ă��A";
		mes "���̂�����B�͉�ꂽ�킯�ł�";
		mes "�Ȃ��̂ł��B";
		mes "�����ƁA�D�ꂽ�b��t�Ȃ炱���";
		mes "��ɖ߂����Ƃ��ł���ł��傤�B";
		next;
		mes "[���b�c]";
		mes "���͈����������̂悤�Ȓb��t��";
		mes "�T���Ƃ��܂��B";
		mes "������΂����ɂł�";
		mes "���A���������グ�܂��̂ŁA";
		mes "�N������҂����������B";
		next;
		mes "[���b�c]";
		mes "�ł́A�Ō�̂������";
		mes strcharinfo(0)+ "�l��";
		mes "���a�����܂��傤�B";
		mes "�ł́A�A�������҂����������B";
		set SIGN_QUE,54;
		getitem 7177,1;
		break;
	case 54:
		if(rand(5)) {
			mes "[���b�c]";
			mes "���A��������񂪓����Ă��Ă��܂��B";
			mes "���������A�X�^�[�W���G���̂������";
			mes "��ɖ߂���b��t��������܂����B";
			mes "�������΂炭�A���҂����B";
			break;
		}
		mes "[���b�c]";
		mes "���[�A�悭����������Ⴂ�܂����I";
		mes "���́A�X�^�[�W���G���̂������";
		mes "��ɖ߂������ȕ����A��ق�";
		mes "���������̂ł��I�@�嗤�ō���";
		mes "�b��t�ƌĂ΂��A";
		mes "^FF0000�G���Q���E�n���[�h^000000�Ƃ������ł��B";
		next;
		mes "[���b�c]";
		mes "�Ƃ��낪�c�c";
		mes "���݁A�ނ͍s���s���Ƃ̂��ƁB";
		mes "�ނ̉Ƒ��́A�Q�t�F���ɂ���Ƃ���";
		mes "���܂ł͂��߂܂����B";
		mes "���̂܂܂����ɍs���āA";
		mes "���ׂĂ͂��炦�܂��񂩁B";
		next;
		mes "[���b�c]";
		mes "����ł́A���肢���܂����B";
		break;
	case 71:
	case 72:
		mes "[���b�c]";
		mes "�����A�����l�ł����B";
		mes "���ꂪ�A�C�����ꂽ";
		mes "�X�^�[�W���G���̂�����ł����B";
		mes "��΂Ƃ��Ă��A�\���ɍ��l��";
		mes "���ł��傤�ȁB�������A������";
		mes "�~�߂�킯�ɂ͂����܂���B";
		next;
		mes "[���b�c]";
		mes "����͂����ƁA���Ȃ����Ñ�̗͂�";
		mes "�����Ă����͂��ł��B�����";
		mes "�ؖ�����̂́c�c�X�^�[�W���G����";
		mes "���ď�����Ă���{�ł��B";
		next;
		mes "[���b�c]";
		mes "���̖{�Ɋւ��ẮA^FF0000�Q�t�F���^���[��";
		mes "�E�B�U�[�h^000000��K�˂�΂����ł��傤�B";
		set SIGN_QUE,72;
		break;
	case 73:
	case 74:
	case 75:
		mes "[���b�c]";
		mes "�����ł����B���̕��̓Q�t�F����";
		mes "���Ȃ������̂ł����B���̂ق����A";
		mes "�������������W�߂Ă݂܂��傤�B";
		break;
	case 76:
		mes "[���b�c]";
		mes "��������Ȃ����B";
		mes "�����A�����ł����B�킩��܂����B";
		mes "�ł́A�Ñ㌾�ꕶ��������";
		mes "���������܂����ˁH";
		next;
		mes "[���b�c]";
		mes "����A��͂�c�c�\�z�ʂ�ł��ˁB";
		mes "���̕�����ǂł�����́A���͂���";
		mes "�قƂ�ǂ��Ȃ��ł��傤�B";
		next;
		mes "[���b�c]";
		mes "�K���ɂ��A���͂��̌����";
		mes "��ǂł�����ɐS�����肪����܂��B";
		mes "���̕�����ǂł��Ȃ���΁A";
		mes "�����炭�c�c���߂邵���Ȃ��ł��傤�B";
		next;
		mes "[���b�c]";
		mes "����������āA�t�����N�Ƃ�������";
		mes "�K�˂Ă��������B���̕��Ȃ�K���A";
		mes "���̕�����ǂł���ł��傤�B";
		while(1) {
			next;
			switch(select("�t�����N���ĂǂȂ��ł����H","���̕��͂ǂ��ɁH","������܂����A�ł́B")) {
			case 1:
				mes "[���b�c]";
				mes "�{���̓t�����N�E�t�����N������";
				mes "�����܂��B�B�������ɓ����Ă��āA";
				mes "�قƂ�ǐl�Ƃ̐ڐG������܂���";
				mes "�Ñ�Ɋւ���m���́A�N����";
				mes "�L�x�ł��B";
				next;
				mes "[���b�c]";
				mes "�������A�ƂĂ��C����āA��������";
				mes "����������Ƃ�����܂���B";
				mes "�ł��A���Ȃ��Ȃ牽�Ƃ����邱�Ƃ�";
				mes "�ł���悤�ȗ\�������܂���B";
				break;
			case 2:
				mes "[���b�c]";
				mes "���̕��͍��A^FF0000���v�D^000000��";
				mes "�����Ɏ��g��ł���ƕ����܂����B";
				mes "�C���ώ@���邽�߁A�ƂɋA��Ȃ�����";
				mes "�����Ƃ��B";
				set SIGN_QUE,77;
				break;
			case 3:
				mes "[���b�c]";
				mes "�K�^���F���Ă��܂���B";
				close2;
				cutin "mets_alpha",255;
				end;
			}
		}
	case 77:
	case 78:
	case 79:
		mes "[���b�c]";
		mes "�{���̓t�����N�E�t�����N������";
		mes "�����܂��B�B�������ɓ����Ă��āA";
		mes "�قƂ�ǐl�Ƃ̐ڐG������܂���";
		mes "�Ñ�Ɋւ���m���́A�N����";
		mes "�L�x�ł��B";
		next;
		mes "[���b�c]";
		mes "�������A�ƂĂ��C����āA��������";
		mes "����������Ƃ�����܂���B";
		mes "�ł��A���Ȃ��Ȃ牽�Ƃ����邱�Ƃ�";
		mes "�ł���悤�ȗ\�������܂���B";
		break;
		next;
		mes "[���b�c]";
		mes "���̕��͍��A^FF0000���v�D^000000��";
		mes "�����Ɏ��g��ł���ƕ����܂����B";
		mes "�C���ώ@���邽�߁A�ƂɋA��Ȃ�����";
		mes "�����Ƃ��B";
		break;
	case 80:
	case 81:
		mes "[���b�c]";
		mes "��������Ȃ����B�ǂ��ł����H";
		mes "�ق��A����ł����c�c�����v���ɁA";
		mes "���̓��e�͓���̏ꏊ���w����";
		mes "����悤�ł��ȁB�����Č��́c�c";
		mes "�����̃A�C�e���ł����ȁB";
		next;
		mes "[���b�c]";
		mes "�ڂ������́A������ł���������";
		mes "���܂����c�c";
		mes strcharinfo(0)+ "�l���A";
		mes "���������撣���Ă�������B";
		break;
	case 82:
		mes "[���b�c]";
		mes "�Ȃ�ق�!!";
		mes "�u�V�ɓ͂����v�Ƃ�";
		mes "�Q�t�F���^���[�̂��Ƃł������B";
		next;
		mes "[���b�c]";
		mes "������c�c�u�I�΂�Ȃ������҂�";
		mes "������B��������҂̏ꏊ�v";
		mes "�ł����c�c���[��c�c";
		mes "�܂��܂��䂪�����ł��ȁB";
		break;
	case 137:
		mes "[���b�c]";
		mes "�����A����́I";
		mes "���ꂱ���A�������߂Ă������́I";
		next;
		mes "[���b�c]";
		mes "�����Ɍ������n�߂�Ƃ��܂��B";
		mes "�𖾂܂Ŏ��Ԃ�������܂��̂ŁA";
		mes "���Ԃ����������B";
		mes "�ł́A�a����܂��傤�B";
		delitem 7314,1;
		set SIGN_QUE,138;
		set SIGN_SUBQUE,gettime(3)/2+1;
		break;
	case 138:
		if((SIGN_SUBQUE*2+2)%24 != gettime(3) && (SIGN_SUBQUE*2+3)%24 != gettime(3)) {
			mes "[���b�c]";
			mes "�܂��������ł��B";
			mes "�����������Ԃ����������܂��񂩁B";
			break;
		}
		mes "[���b�c]";
		mes "����͐����ł��ˁB";
		mes "�܂��A����͂��̐��E�ɑ��݂��Ȃ�";
		mes "�ގ��ō���Ă��܂��B";
		mes "�����āA���̐������Y����";
		mes "�T���Ă�������ȗ͂̐��̂ł��B";
		next;
		mes "[���b�c]";
		mes "���̎��ӂɂ�������Ă���Ñ㕶����";
		mes "����̖��������Ă���悤�ł��ȁB";
		mes "�ǂ����A�Q�t�F���^���[�ƕ������";
		mes "�͂̌��ł��������炵���B";
		next;
		mes "[���b�c]";
		mes "����������A���Ȃ�������̏��L�҂�";
		mes "�Ȃ������߁A�^���[�ƕ�����̗͂�";
		mes "���͂��̌Ñ㕶���ɏh���Ă���͗l�B";
		mes "���̕��󂪉�������A��厖�ł��ȁc�c";
		next;
		mes "[���b�c]";
		mes "���̗͂́A���Ȃ������@���n����";
		mes "�o���肷�邽�߂ɕK�v�ȃG�l���M�[��";
		mes "�񋟂������������悤�ł��B";
		next;
		mes "[���b�c]";
		mes "���̂悤�ȕi�Ɋ����Ď���o���̂Ȃ�";
		mes "��͂�A�����̐l�Ԃł͈����Ȃ�";
		mes "�ł��傤�B";
		next;
		mes "[���b�c]";
		mes "�嗤�ō��̒b�艮�A";
		mes "�G���Q���E�n���[�h��";
		mes "�o�ԍĂсA�ł��ȁB";
		set SIGN_QUE,139;
		set SIGN_SUBQUE,0;
		getitem 7314,1;
		break;
	case 139:
	case 140:
		mes "[���b�c]";
		mes "�G���Q���E�n���[�h�ɂ͉����";
		mes "�݂܂������ȁH�@�ނȂ�A�����";
		mes "�������Ƃ��ł���ł��傤�B";
		break;
	case 141:
		if(countitem(2644) < 1) {
			mes "[���b�c]";
			mes "�G���Q���E�n���[�h�ɂ͉����";
			mes "�݂܂������ȁH�@�ނȂ�A�����";
			mes "�������Ƃ��ł���ł��傤�B";
			break;
		}
		mes "[���b�c]";
		mes "�����A��������Ȃ����B";
		mes "�҂��Ă��܂�����B";
		next;
		mes "[���b�c]";
		mes "��͂�c�c";
		mes "�����͂ł��ȁB";
		mes "�c�c�c�c���肪�Ƃ��������܂��B";
		mes "���́A�\���������܂����B";
		next;
		mes "[���b�c]";
		mes "���̗͂̎����A�����܂Ŋm�F�o����";
		mes "�{���ɗǂ������B";
		mes "�����܂Ŏ��ɕt�������Ă����";
		mes "���肪�Ƃ��B";
		mes "�����āA����ꂳ�܂ł����B";
		set SIGN_QUE,142;
		if(checkre())
			getexp 200000,0;
		else
			getexp 2000000,0;
		break;
	case 201:
		mes "[���b�c]";
		mes "���s�����̂ł����B";
		mes "���`��A�c�O�ł����c�c";
		mes "�����l�ł����ȁB";
		next;
		mes "[���b�c]";
		mes "�������Ă݂����������͎��";
		mes "����܂���ł������A�������ŁA";
		mes "�F�X�Ȍo�����o���܂����B";
		next;
		mes "[���b�c]";
		mes "���Ȃ��ł����A��V�������グ������";
		mes "�v���܂��B";
		mes "�킸���ł����A�ǂ������𗧂�";
		mes "���������B";
		next;
		mes "[���b�c]";
		mes "�����āA�X�^�[�W���G���͕Ԃ���";
		mes "���������܂���B";
		delitem 7178,1;
		set SIGN_QUE,202;
		if(checkre())
			getexp 10000,0;
		else
			getexp 100000,0;
		getitem 617,1;
		break;
	default:
		if(SIGN_QUE < 13) {
			mes "[���b�c]";
			mes "�A�[���A�ɉ���Ă��������B";
			mes "���܂�x���悤�ł�����A���̕���";
			mes "���݂����Ǝv���Ă���܂��B";
			mes "�ǂ����A���������Ă��������B";
			next;
			mes "[���b�c]";
			mes "���[��c�c";
			mes "�A�[���A�������������Ŕ��f���Ă�";
			mes "���߂ł���c�c";
			break;
		}
		else if(SIGN_QUE < 15) {
			mes "[���b�c]";
			mes "���`�I";
			mes "�A�[���A�̏����𓾂��܂����ˁB";
			mes "���x�́A�_�C�E�ł��ˁB";
			mes "�_�C�E�́c�c";
			mes "���`�Ɓc�c�ʔ������ł��B";
			break;
		}
		else if(SIGN_QUE < 20) {
			mes "[���b�c]";
			mes "�_�C�E�̎������N���A����܂������B";
			mes "���̓����j���ł��B";
			mes "�ނ͂ƂĂ������M�S�ł��̂ŁA";
			mes "���Ԃ�I��ŖK�₵������";
			mes "�悳�����ł��B";
			break;
		}
		else if(SIGN_QUE < 25) {
			mes "[���b�c]";
			mes "�W�X�N���G�́c�c�܂��Ⴂ�ł����ˁB";
			mes "�����A�����������Ă��Ȃ��Ƃ����";
			mes "����܂����A�D�ꂽ���ł���B";
			break;
		}
		else if(SIGN_QUE < 35) {
			mes "[���b�c]";
			mes "�f�B�A���[�X�ł����c�c";
			mes "���[��c�c�Ȃɂ��A�s���̃q���g�ł�";
			mes "����Ηǂ��̂ł����c�c";
			break;
		}
		else if(SIGN_QUE < 53) {
			mes "[���b�c]";
			mes "���悢��A�x�[�J�[�ł����B";
			mes "�ނ͍ŋ߁A�ƂĂ��Z�����炵���ł��ȁB";
			break;
		}
		else if(SIGN_QUE < 71) {
			mes "[���b�c]";
			mes "���Ȃ��ɂ΂��蓮����";
			mes "���������Ă��܂��Ă���悤�ŁA";
			mes "�\����Ȃ��B";
			next;
			mes "[���b�c]";
			mes "���́A�X�^�[�W���G���̂������";
			mes "���Ĉ������������W�߂Ă��܂��B";
			mes "�C������A�����Ɩ��ɗ��ł��傤�B";
			break;
		}
		else if(SIGN_QUE < 98) {
			mes "[���b�c]";
			mes "�������B�����܂ܐ����Ă���";
			mes "�ҒB�̑��ł����B";
			mes "������������A���̑������̎ҒB��";
			mes "�p���B���Ă���̂�������܂���ˁB";
			break;
		}
		else if(SIGN_QUE < 137) {
			mes "[���b�c]";
			mes "���������ł��B�撣���Ă��������B";
			break;
		}
		else if(SIGN_QUE > 201) {
			mes "[���b�c]";
			mes "����A�c�O�łȂ�܂���B";
			mes "���������ŁA�X�^�[�W���G����";
			mes "�����킩�����̂Ɂc�c";
			break;
		}
		mes "[���b�c]";
		mes "���Ȃ��̂������ŁA���N�̖���";
		mes "�K���܂����B�����A�܂�������������";
		mes "���肢���Ă����ł����ȁH";
		break;
	}
	close2;
	cutin "mets_alpha",255;
	end;
}

prt_in.gat,228,26,3	script	����	55,{
	if(SIGN_QUE < 3) {
		mes "[�n�f�X]";
		mes "��������Ⴂ�܂��B";
		mes "�ǂ̂悤�Ȃ��p����";
		mes "���炵���̂ł��傤���B";
		next;
		switch(select("�p�Ȃ�ĂȂ��ł�","���b�c����ɉ��","�������傤����")) {
		case 1:
			mes "[�n�f�X]";
			mes "�p���Ȃ��Ȃ�A���A�肭�������B";
			close;
		case 2:
			mes "[�n�f�X]";
			mes "����l�l�͏��ւɂ�������Ⴂ�܂��B";
			mes "��莟���܂��̂ŏ��X���҂����������B";
			close;
		case 3:
			mes "[�n�f�X]";
			mes "�c�c";
			mes "����ȕ��ł��ˁB";
			mes "�������ɂ��A�肭�������I";
			close2;
			percentheal -30,0;
			warp "prontera.gat",150,150;
			end;
		}
	}
	else if(SIGN_QUE < 14) {
		mes "[�n�f�X]";
		mes "��������Ⴂ�܂��A";
		mes strcharinfo(0)+ "�l�B";
		mes "�ǂ�Ȃ��p�ł��傤���H";
		next;
		switch(select("�A�[���A�͂ǂ�ȕ��ł����H","���b�c����̎d�����ĉ��ł����H","�C���V�͂ǂ�ȕ��ł����H")) {
		case 1:
			mes "[�n�f�X]";
			mes "�ނ́c�c�ƂĂ������ȕ�����";
			mes "�����Ă���܂��B�܂��A�����΂���";
			mes "�C���r���ƁB����ɂȂ���Ȃ�A";
			mes "���t�ɂ͋C������������낵������";
			mes "�����܂��B";
			close;
		case 2:
			mes "[�n�f�X]";
			mes "����́c�c";
			mes "���̓_�Ɋւ��Ă͉���";
			mes "�\���グ��킯�ɂ͎Q��܂���B";
			close;
		case 3:
			mes "[�n�f�X]";
			mes "�C���V�́c�c";
			mes "�c�������炱���œ����Ă���܂��B";
			mes "���ɂ͑����݂����Ȏq�ł��āB";
			mes "�ƂĂ��A�ǂ��q�ł��c�c";
			close;
		}
	}
	else if(SIGN_QUE < 15) {
		mes "[�n�f�X]";
		mes "�����A�C���V�����l������";
		mes "���������Ȃ��N��ł��ˁB���̎q��";
		mes "�v�����e���ł��b��̔����ł��āB";
		next;
		mes "[�n�f�X]";
		mes "���Ȃ肽������̒j�����狁����";
		mes "�󂯂Ă���ƕ����Ă���܂����A";
		mes "���̎q�͑S�Ēf���Ă��邻���ł��B";
		mes "�������R�ł�����̂��c�c";
		close;
	}
	else if(SIGN_QUE < 20) {
		mes "[�n�f�X]";
		mes "���������΂��̍��A���莆�̌���";
		mes "����l�l�ɉ�ɗ��������";
		mes "�����܂����B";
		mes "������c�c";
		next;
		mes "[�n�f�X]";
		mes "���Ȃ肽������̕�������l�l��";
		mes "�K�˂Ă��炵�Ă܂��̂ŁA���܂�";
		mes "�������\���Ă���ƁA�@��𓦂���";
		mes "���܂���������܂���B�ǂ���";
		mes "���߂Ȃ��悤������������";
		mes "���������܂��B";
		close;
	}
	else if(SIGN_QUE < 25) {
		mes "[�n�f�X]";
		mes "�W�X�N���G�l�͊m���ɑf���炵��";
		mes "�����ł����A�d�����̐������A";
		mes "�ǂ����Ă������S�������Ȃ��";
		mes "�����܂����c�c";
		next;
		mes "[�n�f�X]";
		mes "���������A�T���߂ɂ����ق���";
		mes "�D�܂����Ǝv���܂����A���i�␫����";
		mes "�����ȒP�ɕς�������̂ł�";
		mes "�������܂���̂Łc�c";
		close;
	}
	else if(SIGN_QUE < 35) {
		mes "[�n�f�X]";
		mes "�l�̗~���ɂ͏I��肪����܂���B";
		mes "���ɁA�q���͐l�̗~�����̂��̂�";
		mes "����悤�ł��B";
		next;
		mes "[�n�f�X]";
		mes "�������Ă��鎞�͉^���ǂ��Ɠq���𑱂�";
		mes "����������A���������Ԃ��悤��";
		mes "�q���𑱂��A���ʂƂ��ĉ����c��Ȃ��B";
		close;
	}
	else if(SIGN_QUE < 54) {
		mes "[�n�f�X]";
		mes "�x�[�J�[�l�͐������ł��B";
		mes "�Ⴂ�̂ɁA�ނقǐ�����������";
		mes "���͒m��܂���B��ォ��󂯌p����";
		mes "���Ƃ��ێ����Ă��������ł��A�ƂĂ�";
		mes "��ςȂ��Ƃ��Ƒ����܂��B";
		next;
		mes "[�n�f�X]";
		mes "�������A�����ێ�����̂ł͂Ȃ�";
		mes "���Ƃ��g�債�Ă����܂��B";
		mes "���̔\�͂͏܎^�ɒl���܂��B";
		close;
	}
	else if(SIGN_QUE == 54) {
		mes "[�n�f�X]";
		mes "����ꂳ�܂ł����B";
		mes "�����𖳎��ɏI�����ꂽ�ƕ����܂����B";
		mes "���́A���̎����ł����A���Ȃ�̕���";
		mes "�r���ō��܂���Ă���܂��B";
		next;
		mes "[�n�f�X]";
		mes "���̒i�K�Ɍ����A����l�l�͏����W��";
		mes "�͂𒍂��ł���܂��B";
		mes "�V�����i�W���������܂��܂ŁA���΂炭";
		mes "�x�܂ꂽ�炢�����ł����H";
		close;
	}
	mes "[�n�f�X]";
	mes "�厖�Ȃ��̂����A�n�l���d�˂��";
	mes "��낵�����Ƒ����܂��B";
	close;
}

prt_in.gat,248,23,2	script	���C�h	1275,{}
prt_in.gat,248,23,0	script	���C�h	111,{
	if(SIGN_QUE < 3) {
		mes "[�C���V]";
		mes "�c�c";
		mes "�������p�ł����H";
		mes "�����͂���l���܂̂������ł��B";
		mes "�o�čs���Ă��������B";
		close;
	}
	else if(SIGN_QUE < 14) {
		mes "[�C���V]";
		mes "����A";
		mes strcharinfo(0)+ "�l�B";
		mes "�������p�ł��傤���H";
		next;
		set '@str$,(Sex? "�C���V�����A���Ԃ���H": "�C���V�����Y��`");
		if(select('@str$,"���b�c������Ăǂ�ȕ��ł��傤�H")==2) {
			mes "[�C���V]";
			mes "���[��c�c";
			mes "�������ł��A����l���܂́c�c";
			next;
			mes "[�C���V]";
			mes "�������B";
			mes "�ق��̐g�ŁA�ق���l��]������";
			mes "�킯�ɂ͂܂���܂���B";
			close;
		}
		if(Sex) {
			mes "[�C���V]";
			mes "���H";
			mes "�c�c����̓f�[�g�̂��\�����݂ł����H";
			mes "�c�c�c�c";
			next;
			mes "[�C���V]";
			mes "�u���Ԃ���H�v�͂Ȃ��ł��傤�H";
			mes "���[��A�ނ��낻��́c�c";
			mes strcharinfo(0)+ "�l����ł��B";
			mes "�t�t�c�c�B";
			close;
		}
		else {
			mes "[�C���V]";
			mes "���A�ǂ����c�c���肪�Ƃ��������܂��B";
			mes "���́A���̎d���͂��܂�O��";
			mes "�o�܂��񂩂�A�F���Ɍ����邾��";
			mes "�Ȃ̂�������܂��񂪁c�c";
			mes "���́A" +strcharinfo(0)+ "�l��";
			mes "�ƂĂ��X�e�L�ł��B";
			close;
		}
	}
	else if(SIGN_QUE < 15) {
		mes "[�C���V]";
		mes "�ŋ߂̒j���͏�Ȃ��ł��B";
		mes "�����������炳�܂ɕ\����";
		mes "�e�ŃR�\�R�\���Ă邩�B";
		next;
		emotion 32;
		mes "[�C���V]";
		mes "������l����������������܂���";
		mes "�ŋ߂̒j���ɂ͐^�S�������܂���B";
		close;
	}
	else if(SIGN_QUE < 20) {
		mes "[�C���V]";
		mes "�����͏������Ă��܂��B";
		mes "���X�A����������������܂���ˁB";
		mes "�d�������������킯�ł��Ȃ��̂Ɂc�c";
		next;
		mes "[�C���V]";
		mes "����ȓ��́A�����ł�������";
		mes "�x�݂����ł����A�d��������܂����́B";
		mes "�������ŁA����΂�Ȃ���B";
		close;
	}
	else if(SIGN_QUE < 25) {
		mes "[�C���V]";
		mes "�W�X�N���G����H";
		mes "���́c�c�ƂĂ����������ł��B";
		mes "����ɁA�˔\��������ŁA���Ȃ�";
		mes "��r�ɂȂ�Ȃ����炢�ł��B";
		next;
		emotion 9;
		mes "[�C���V]";
		mes "�ƂĂ��A�܂����ł����A���̕��Ǝ���";
		mes "���𖄂߂邱�ƂȂ�āA�����ǂꂾ��";
		mes "�w�͂��Ă������ł����́B";
		close;
	}
	else if(SIGN_QUE < 35) {
		mes "[�C���V]";
		mes "�R���h�ɍs���ꂽ���Ƃ���܂����H";
		mes "���A�O��1�񂾂��s�������Ƃ������";
		mes "�ł����A�Ƃ��Ă��f�G�ȏꏊ�ł����I";
		mes "�R���h�̃J�W�m�c�c";
		mes "�ʔ���������ł����c�c";
		next;
		mes "[�C���V]";
		mes "�������ɏZ�݂����Ƃ͎v���܂���B";
		mes "�����āA�Ȃ񂩗U�f�ɕ�������";
		mes "�ł����́c�c";
		close;
	}
	else if(SIGN_QUE < 54) {
		mes "[�C���V]";
		mes "�x�[�J�[�l�̂����~�ɁA�T�C�����ƌ���";
		mes "���C�h�����܂��B�~�b�h�K�b�c�o�g�ł�";
		mes "�Ȃ��炵���̂ł����A����ł͂ǂ���";
		mes "�o�g�Ȃ�ł��傤�H";
		next;
		mes "[�C���V]";
		mes "���̑O�A�����ɂ��炵������";
		mes "��������Ƃ�����܂��B";
		mes "�����ł��ˁc�c�ٍ��I�Ȕ������Ƃł�";
		mes "�����̂ł��傤���c�c";
		mes "�W�X�N���G����Ƃ͂܂������";
		mes "�������ł����B";
		close;
	}
	else if(SIGN_QUE == 54) {
		emotion 2;
		mes "[�C���V]";
		mes "����ɂ��́B���v���Ԃ�ł��B";
		mes "�������`��";
		next;
		if(select("�����ǂ����ł��H","�����������́H")==1) {
			mes "[�C���V]";
			mes "���H�@���́A����";
			mes "�{�[�C�t�����h���o������ł��B";
			next;
			mes "[�C���V]";
			mes "�ƂĂ��������ā�";
			mes "���́A�ނ��Ĕw�������āA�n���T����";
			mes "�����Y��ȕ��ŁA����Łc�c";
			mes "�؂��Ⴍ����؂���c�c";
			next;
			mes "^3355FF���Ȃ��͂�������ƐȂ𗧂����B";
			mes "����ȏ㕷���Ă���ƁA����������";
			mes "���������B^000000";
			close;
		}
		mes "[�C���V]";
		mes "���[��c�c";
		mes "���������͂���܂������c�c";
		mes "�ӂӁA�ЁE�݁E�E�ł��B";
		mes "�������`��";
		close;
	}
	emotion 32;
	mes "[�C���V]";
	mes "���炠�炠��A��ϑ�ρI";
	mes "�ŋ߁A���q�l�������ς��I";
	close;
}

//============================================================
// ��1�� - �A�[���A�̎���
//------------------------------------------------------------
morocc_in.gat,115,154,5	script	���[�O	810,{
	if(SIGN_QUE < 3) {
		emotion 9;
		end;
	}
	switch(SIGN_QUE) {
	case 3:
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�N���H";
		next;
		switch(select("���b�c����̏����痈�܂���","^0000FF" +strcharinfo(0)+ "^000000�ł�","�����������Ȃ��́H")) {
		case 1:
			mes "[�A�[���A]";
			mes "�ӂ�B";
			mes "�M�����邩�B������B";
			close2;
			warp "morocc.gat",279,173;
			end;
		case 2:
			mes "[�A�[���A]";
			mes "�c�c�c�c";
			mes "�����c�c";
			mes "^0000FF" +strcharinfo(0)+ "^000000���B";
			mes "���b�c���畷���Ă���B";
			next;
			mes "[�A�[���A]";
			mes "�ŏ��̎����͊ȒP���B";
			mes "�������ꂩ�狳����i��";
			mes "�W�߂Ă���΂����B";
			next;
			mes "[�A�[���A]";
			mes "�������A�������������Ԓʂ��";
			mes "�����ė����B���̂��̂𓯎���";
			mes "�����ė�����v������B";
			next;
			mes "[�A�[���A]";
			mes "�܂��́A^FF0000�Ȗ� 100��^000000�����Ă����B";
			if(countitem(914) >= 100)
				delitem 914,countitem(914);
			set SIGN_QUE,4;
			close;
		case 3:
			misceffect 49;
			percentheal -50,0;
			mes "[�A�[���A]";
			mes "�c�c�c�c";
			mes "������B";
			close;
		}
	case 4:
		setarray '@need,914,7033;
		setarray '@amount,100,50;
		break;
	case 5:
		setarray '@need,7033,904;
		setarray '@amount,50,30;
		break;
	case 6:
		setarray '@need,904,930;
		setarray '@amount,30,20;
		break;
	case 7:
		setarray '@need,930,1038;
		setarray '@amount,20,15;
		break;
	case 8:
		setarray '@need,1038,7013;
		setarray '@amount,15,10;
		break;
	case 9:
		set '@need,7013;
		set '@amount,10;
		break;
	case 10:
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�����ɂ���z�Ƙb���B";
		set SIGN_QUE,11;
		close;
	case 11:
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�ʓ|��������ȁB";
		close;
	case 12:
		mes "[�A�[���A]";
		mes "����Ȃ��B";
		mes "�������A�����̓z�Ƙb���ė����B";
		set SIGN_QUE,11;
		close;
	case 13:
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�������c�c";
		mes "�t�F�C�����̃_�C�E�ɉ�ɍs���B";
		if(checkre()) {
			if(BaseLevel >= 90) getexp 1800,0;
			else if(BaseLevel >= 80) getexp 1300,0;
			else if(BaseLevel >= 70) getexp 1000,0;
			else if(BaseLevel >= 60) getexp 750,0;
			else getexp 300,0;
		} else {
			if(BaseLevel >= 90) getexp 18000,0;
			else if(BaseLevel >= 80) getexp 13000,0;
			else if(BaseLevel >= 70) getexp 10000,0;
			else if(BaseLevel >= 60) getexp 7500,0;
			else getexp 3000,0;
		}
		getitem 7177,1;
		set SIGN_QUE,14;
		close;
	case 14:
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�t�F�C�����ɍs���B";
		close;
	default:
		emotion 9;
		mes "[�A�[���A]";
		mes "�c�c�c�c";
		mes "�ʓ|��������ȁB";
		close;
	}
	//4�`9�̑���
	mes "[�A�[���A]";
	mes "�c�c�c�c";
	if(countitem('@need[0]) < '@amount[0]) {
		mes "^FF0000" +getitemname('@need[0])+ " " +'@amount[0]+ "��^000000���B";
		close;
	}
	delitem '@need[0],'@amount[0];
	if('@need[1] > 0) {
		if(countitem('@need[1]) >= '@amount[1])
			delitem '@need[1],countitem('@need[1]);
		mes "����^FF0000" +getitemname('@need[1])+ " " +'@amount[1]+ "^000000���B";
	}
	else {
		mes "����őS�����B";
		mes "�܂���ŗ����B";
	}
	set SIGN_QUE,SIGN_QUE+1;
	close;
}

morocc_in.gat,114,162,4	script	�N	118,{
	if(SIGN_QUE < 11) {
		emotion 19;
		mes "[�K�[�i]";
		mes "�ŋ߁A������ȁ[�I";
		mes "���̊X�͏����ď����đ�ς���B";
		mes "�����ȊO�͗ǂ��X�Ȃ񂾂��ǂȁ[�I";
		close;
	}
	if(SIGN_QUE == 12 || SIGN_QUE == 13) {
		mes "[�K�[�i]";
		mes "����͏I���܂����B";
		mes "���ʂ͂��t���l���畷���Ă��������B";
		close;
	}
	if(SIGN_QUE >= 14) {
		mes "[�K�[�i]";
		mes "���[��A�����������";
		mes "�����������炢���̂ɂȁ[�I";
		mes "�䖝���邵���Ȃ����ȁ`�B";
		close;
	}
	mes "[�K�[�i]";
	mes "���H�@�t�����l�ɘb�����āH";
	mes "�ǂ����ǂ����I";
	mes "������肵�Ă��ĉ������B";
	mes "�l���ł��邱�ƂȂ�A�Ȃ�ł�";
	mes "���܂�����[�I";
	next;
	mes "[�K�[�i]";
	mes "�����Ƃł��ˁA���ꂩ�炢����";
	mes "���₵�܂��B�ǁ[���l���āA������";
	mes "���������ˁB";
	next;
	mes "[�K�[�i]";
	mes "���ق�A���āA�ŏ��̖��ł��B";
	mes "�c�c�c�c";
	mes "���l���ɂ�������l�ŗ��ꒅ���܂����B";
	mes "��ԍŏ��ɉ������܂����H";
	next;
	switch(select("����T��","�D��҂�","�H�ו���T��","����T������")) {
		case 1: set '@point,'@point+7; break;
		case 2: set '@point,'@point+1; break;
		case 3: set '@point,'@point+4; break;
		case 4: set '@point,'@point+10; break;
	}
	mes "[�K�[�i]";
	mes "��Ԗڂ̎���ł��B";
	mes "�c�c�c�c";
	mes "�傫���������}�ɕ���āA�ƂĂ�����";
	mes "�ꏊ�ɕ����߂��Ă��܂��܂����B";
	mes "����Ȏ��A�Ȃɂ����܂����H";
	next;
	switch(select("�吺�ŏ����ā[�Ƌ���","�����Ƃ��Ă���","�����o�傷��","�O�ɏo����@��T��")) {
		case 1: set '@point,'@point+3; break;
		case 2: set '@point,'@point+7; break;
		case 3: set '@point,'@point+1; break;
		case 4: set '@point,'@point+7; break;
	}
	mes "[�K�[�i]";
	mes "�O�Ԗڂ̎���ł��B";
	mes "�c�c�c�c";
	mes "���Ȃ��̓_���W�����ŁA���ԂƂ͂����";
	mes "���q�ɂȂ��Ă��܂��܂����B";
	mes "�����A�ǂ����܂��H";
	next;
	switch(select("���Ԃ�T�����","�O�ɏo����@��T��","�����Ƃ��Ă���","��l�Ń_���W���������")) {
		case 1: set '@point,'@point+0; break;
		case 2: set '@point,'@point+5; break;
		case 3: set '@point,'@point+10; break;
		case 4: set '@point,'@point+1; break;
	}
	mes "[�K�[�i]";
	mes "�l�Ԗڂ̎���ł��B";
	mes "�c�c�c�c";
	mes "���Ȃ��́A�O�ƘA�������Ȃ��󋵂ŁA";
	mes "����قɒ��Ԃƕ����߂���";
	mes "���܂��܂����B����Ȓ��A�E�l�������I";
	mes "�ǂ����܂����H";
	next;
	switch(select("���������������̂�҂�","���Ԃ��S�����邩�m���߂�","�O�ƘA���������@��T��","���玖������������","�������E�����O�ɂ��������Ԃ��c�c")) {
		case 1: set '@point,'@point+7; break;
		case 2: set '@point,'@point+5; break;
		case 3: set '@point,'@point+3; break;
		case 4: set '@point,'@point+1; break;
		case 5: set '@point,'@point+1; break;
	}
	mes "[�K�[�i]";
	mes "�ܔԖڂ̎���ł��B";
	mes "�c�c�c�c";
	mes "��T�Ԍ�ɁA���E���ŖS����Ƃ��܂��B";
	mes "����܂ł̈�T�ԁA�������܂����H";
	next;
	switch(select("��l�����ŖS��҂�","�؂������ς��A����","���̐��E�ֈڏZ������@���l����","�c�������ԂŐ��E��T������","�������Ƃ����Ă݂�")) {
		case 1: set '@point,'@point+5; break;
		case 2: set '@point,'@point+3; break;
		case 3: set '@point,'@point+7; break;
		case 4: set '@point,'@point+10; break;
		case 5: set '@point,'@point+1; break;
	}
	mes "[�K�[�i]";
	mes "�ӂނӂށA������Ǝ���c�c";
	mes "�����A�����OK�B";
	mes "���ʂ͎t���ɕ����Ă��������B";
	mes "�ł́[�I";
	if('@point > 33)
		set SIGN_QUE,13;
	else
		set SIGN_QUE,12;
	close;
}

//============================================================
// ��1�� - �_�C�E�̎���
//------------------------------------------------------------
payon_in03.gat,11,31,4	script	�_�C�E	808,{
	mes "[�_�C�E]";
	mes "����͂��͂��́[��!!";
	mes "���������Ă����I";
	mes "�y��t�ł�!!";
	mes "�t�n�n�n�n�n�b�n�b�n�b!!";
	next;
	mes "[�_�C�E]";
	mes "���E���̒����I";
	mes "���E���̔���!!";
	mes "���E����ɓ��ꂽ�����R!!!!";
	mes "�n�n�n�n�n�n�I";
	next;
	if(SIGN_QUE == 15) {
		mes "[�_�C�E]";
		mes "����ȏ��ŉ������Ă���H";
		mes "��A�s�����Y�ꂽ���H";
		mes "���𕷂��Ă����񂾁A���O�́B";
		mes "�A���f�o������^CE0000�����j��^000000���B";
		mes "�����A����I";
		next;
		mes "[�_�C�E]";
		mes "�̂��ʂ̏������z������A������";
		mes "�l�C�̏��Ȃ��ꏊ�łЂ������";
		mes "��炵�Ă邾�낤���B";
		close;
	}
	if(SIGN_QUE > 15) {
		mes "[�_�C�E]";
		mes "�����A�H�����H�����c�c";
		mes "���ꂾ���H�ׂ���A��������";
		mes "�����Ȃ��Ă������B";
		next;
		mes "[�_�C�E]";
		mes "�S�[�g����C�A�S�[�g���c�c";
		mes "�c�cz�c�czz�c�cZZ";
		close;
	}
	mes "[�_�C�E]";
	mes "�����A�ᑢ�B";
	mes "�A�܂������H";
	mes "�A�܂����Ȃ�A�̂��Ȃ��Ă݂�I";
	mes "�n�[�b�n�b�n�n�n�n�I";
	if(SIGN_QUE < 14)
		close;
	next;
	mes "[�_�C�E]";
	mes "������H";
	mes "���������������Ƃł�����̂��H";
	mes "�Ȃ��Ȃ�A�Ƃ��ƂƏ����ȁB";
	if(Sex) {
		mes "�j�����̑O�łӂ�ӂ炷��ȁB";
		mes "�C���������B";
	}
	else {
		mes "����Ƃ��A���O�������ɗ���";
		mes "�ꏏ�Ɉ�t��邩�H";
	}
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����A��������Ă���܂��񂩁H";
	next;
	mes "^3355FF-���Ȃ��͉�����A";
	mes "���炩�Ȍ��𔭂���";
	mes "�����ȕ�΂����o����-^000000";
	next;
	emotion 0;
	mes "[�_�C�E]";
	mes "�Ȃ񂾂ƁH";
	mes "���A����́c�c";
	next;
	mes "[�_�C�E]";
	mes "����́A�A�[���A�́I";
	mes "����Ȃ��ƂȂ�A���������I";
	mes "���O���A�w�_�C�E�l�_�C�E�l";
	mes "�T�C�����������`�x�ƒǂ��񂷁A";
	mes "���̒ǂ��������Ǝv���āA";
	mes "�ǂ��o���Ƃ��낾��������Ȃ����I";
	next;
	mes "[�_�C�E]";
	mes "���O�A���ꂪ�Ȃ񂾂��m���Ă���̂��H";
	next;
	switch(select("�͂��A�m���Ă��܂�","���ꂪ���Ɗ֌W�����ł����H","�킩��Ȃ��̂ŋ����Ă���܂��񂩁H")) {
	case 1:
		mes "[�_�C�E]";
		mes "�ق��A�v������蔎�����ȁB";
		mes "�������B�ł́A����͉����H";
		next;
		if(select("�c�c�ƂĂ��ǂ����ł�","���͂킩��Ȃ���ł��B�ĂցB")==1) {
			emotion 9;
			mes "[�_�C�E]";
			mes "�Ȃ񂾁A���̓K���ȕԎ��́I";
			mes "���͂��������A�B���ɂ��܂������Ƃ���";
			mes "�z�͑匙�����I";
			set '@point,'@point+2;
		}
		else {
			emotion 32;
			mes "[�_�C�E]";
			mes "�c�c";
			mes "�����ɂ��c�c";
			set '@point,'@point+4;
		}
		break;
	case 2:
		emotion 9;
		mes "[�_�C�E]";
		mes "�c�c�c�c";
		next;
		mes "[�_�C�E]";
		mes "���O�́A�ǂ����Ă���ȋ�J�����Ă܂�";
		mes "�������󂯂Ȃ���΂Ȃ�Ȃ����A";
		mes "�������Ă��Ȃ��悤���ȁB";
		break;
	case 3:
		mes "[�_�C�E]";
		mes "�A�[���A�͐������Ȃ������̂��H";
		mes "�܂������B�����������Ă��B";
		mes "����ɒm�������Ԃ肷����A";
		mes "�m��Ȃ��Ȃ�m��Ȃ��ƌ����z�̂ق���";
		mes "�f���ł����킢�I";
		if(checkre())
			getexp 0,0;
		else
			getexp 5,0;
		set '@point,'@point+5;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "���O�������Ă��邻��́A";
	mes "^31009C�X�^�[�W���G���̂�����^000000�ƌ����B";
	mes "����́A���ʂ̕i������Ȃ��B";
	mes "�V�����͂��߂��A���Ȃ肢�킭����";
	mes "���񂾁B";
	next;
	mes "[�_�C�E]";
	mes "���b�c�����R��ɓ��ꂽ���񂾂��A";
	mes "����ȊO�͒m���B";
	next;
	mes "[�_�C�E]";
	mes "���b�c�͒��ԂɁA���̐V�����͂�";
	mes "���������l����T���Ă���Ɨ��񂾁B";
	mes "�����A���Ǝ����ɗ��h�ɑς�����";
	mes "�l�����ȁB";
	next;
	mes "[�_�C�E]";
	mes "����ŉ��B�͂��ꂼ��A���E����";
	mes "�U��΂�A���b�c�̏Љ�ŗ����z����";
	mes "�������Ƃɂ����̂��B";
	next;
	switch(select("�����Y�o���I�K�C�҂ł�","��낵�����肢���܂��I","�͂��c�c","�����ł���")) {
	case 1:
		mes "[�_�C�E]";
		mes "���[�H";
		mes "���̎��M�͂ǂ�����o�Ă�񂾁B";
		mes "�܁A���̂悤�ɗ��Ŕ�ꂽ���Ԃ������";
		mes "�ːF�����̃_���f�B�[�Ȓj�ɂ�";
		mes "�y�΂Ȃ����A���O�������͂Ȃ��ȁB";
		set '@point,'@point+5;
		break;
	case 2:
		emotion 33;
		mes "[�_�C�E]";
		mes "�����I�@�����ˁA���̐S�ӋC!!";
		mes "���������S�����A�厖�Ȃ񂾁B";
		mes "��������˂����A�����c�c";
		mes "�悵�A����" +(Sex? "�Y��ȉł���ł�": "�s�b�^���̒U�߂�");
		mes "�����Ă�邩�I";
		set '@point,'@point+7;
		break;
	case 3:
		emotion 6;
		mes "[�_�C�E]";
		mes "�u�͂��c�c�v���Ƃ�?!";
		next;
		emotion 7;
		mes "[�_�C�E]";
		mes "����Ȃ���񂾐��_�ŉ����ł���I";
		mes "���̃o�J��낤�I";
		percentheal -10,0;
		set '@point,'@point+2;
		break;
	case 4:
		emotion 9;
		mes "[�_�C�E]";
		mes "�c�c�c�c";
		next;
		mes "[�_�C�E]";
		mes "�c�c�A�[���A�݂����ɖ��C�͂�";
		mes "�������Ȃ������E���ȁB";
		mes "���͖��̂Ȃ��z�͌������ˁB";
		set '@point,'@point+4;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "�c�c���O�Ƃ͂���������Ƙb������";
	mes "�K�v������ȁB";
	mes "�������A�R�~���j�P�[�V�������Ă̂�";
	mes "�厖�Ȃ񂾂��B";
	next;
	emotion 20;
	mes "[�_�C�E]";
	mes "���b�c����A�V�r�A�Ȏ����";
	mes "���Ƃ��Ă�����ė��܂�Ă邵�c�c";
	mes "�܁A�����v���ȁB";
	next;
	mes "[�_�C�E]";
	mes "�F�B�͂��邩�H";
	mes "�ꏏ�ɂ悭�p�[�e�B�[��";
	mes "�g�񂾂肷��F�B���B";
	next;
	switch(select("�͂�","1�l�ł��鎞���D���ł�","�F�B�Ȃ�Ă��܂���")) {
	case 1:
		emotion 23;
		mes "[�_�C�E]";
		mes "���́A�K�������I";
		mes "�l���Ă̂͂ȁA�ꂿ���̕��̒���";
		mes "���鎞����ԍK���Ȃ񂾂Ƃ�B";
		mes "���̌�́A�o��l������ĂȁB";
		next;
		mes "[�_�C�E]";
		mes "���̓I�Ƃ��A���_�I�Ƃ�����˂��B";
		mes "^3355FF����^000000�͑傫�ȗ͂����ĖY���Ȃ�I";
		set '@point,'@point+5;
		break;
	case 2:
		mes "[�_�C�E]";
		mes "�܂��ȁ`�B1�l�ɂȂ肽����������";
		mes "���邳�c�c�B�ł��ȁA�ǓƂ��Ă̂�";
		mes "�ꂵ�����񂳁B�����������ɁA";
		mes "�������g�Ɛ킢�A�����A�����̂�";
		mes "�d�v�����ȁB";
		next;
		mes "[�_�C�E]";
		mes "�����A�����ɔ�����Ȃ�B";
		mes "���i�������������āA���l��";
		mes "�y������z�͎̂Ă�����񂾂��B";
		mes "�����ƐF��Ȑl�Ɖ���Ă݂ȁB";
		mes "�ǂ�ȕ��}�Ȍo�������āA������";
		mes "��₵�ɂȂ�񂾂��B";
		set '@point,'@point+4;
		break;
	case 3:
		mes "[�_�C�E]";
		mes "�c�c���̔N�ŗF�B��1�l��";
		mes "���Ȃ����Ă̂��H";
		mes "�ǂ�Ȑ������Ă����񂾁c�c�u�c�u�c�B";
		mes "������x�A�l���U��Ԃ��Ă݂���";
		mes "�ǂ���H�@���݂����ɓ��X�Ƃ����z��";
		mes "����ɂ́A���R�Ɛl���W�܂���񂳁B";
		set '@point,'@point+3;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "�ŋߐl�X�̒��Řb��ɂȂ��Ă���";
	mes "�̂́A����l�������������";
	mes "�����X�^�[�������A��ĐF���";
	mes "�ꏊ�ɏo�v������Ă���������";
	mes "���Ă��B";
	mes "���O�͂ǂ��v���H";
	next;
	switch(select("�{���ɕ|���ł���ˁI","�䖝�ł��܂���I","����Ȃ��Ƃ�����ł��傤�B")) {
	case 1:
		emotion 9;
		mes "[�_�C�E]";
		mes "�c�c�c�c";
		next;
		emotion 9;
		mes "[�_�C�E]";
		mes "�c�c�c�c";
		next;
		emotion 6;
		mes "[�_�C�E]";
		mes "�����������Ă₪��ȁB";
		next;
		emotion 6;
		mes "[�_�C�E]";
		mes "��ς��Ƃ�߂���";
		mes "�|�����Ă���΂��肩�I";
		next;
		emotion 6;
		mes "[�_�C�E]";
		mes "���O�������Ă��������Ă̂�";
		mes "����Ȃ��̂Ȃ̂��H";
		next;
		emotion 6;
		mes "[�_�C�E]";
		mes "�l�X�����ł�������";
		mes "�΂��l���ڂɕ����Ԃ��c�c�B";
		next;
		mes "[�_�C�E]";
		mes "�����c�c";
		break;
	case 2:
		mes "[�_�C�E]";
		mes "�����I�@���������v��!!";
		next;
		mes "[�_�C�E]";
		mes "�s�͂��Ȃ��߁c�c";
		mes "���ɂ͂��ꂪ��������";
		mes "�C����Ă����������B";
		mes "�������畅���Ă₪��I";
		next;
		emotion 6;
		mes "[�_�C�E]";
		mes "�E�H�[!!!";
		next;
		mes "[�_�C�E]";
		mes "������Ƌ������Ă��܂����c�c";
		next;
		emotion 21;
		mes "[�_�C�E]";
		mes "���O�����ꂩ�����o������";
		mes "�o����Ă��A���̐S�ɐM�O��";
		mes "���������邱�Ƃ�";
		mes "�����ĖY��Ȃ��łق����B";
		set '@point,'@point+5;
		break;
	case 3:
		mes "[�_�C�E]";
		mes "�����I";
		mes "�M�O�����������̂��I";
		mes "�����āc�c�������Ă����̂�";
		mes "���Ղ������Ƃ���Ȃ�����";
		mes "���炢�͂킩�邾�낤�H";
		next;
		mes "[�_�C�E]";
		mes "��ςȐl�������炱���A";
		mes "���l������A�����ċP������";
		mes "���̂Ȃ񂾁B";
		next;
		mes "[�_�C�E]";
		mes "��ςł������Ƒς���";
		mes "�����Ă��������ɁA";
		mes "�����������Ă��鎩����";
		mes "�C�Â����Ƃ����邾�낤�B";
		next;
		mes "[�_�C�E]";
		mes "��x�Ƃ���ȓK���Ȃ��Ƃ�";
		mes "����Ȃ��ł����ȁH";
		set '@point,'@point+3;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "�ŋ߁A�U��킪����炵���ȁB";
	next;
	mes "[�_�C�E]";
	mes "�ٔ������󋵂ŁA�ꏏ�Ɋ��𗬂��A";
	mes "������C���z��!!";
	next;
	mes "[�_�C�E]";
	mes "�s���������������A���@������h���Ԃ�";
	mes "�킵���v���[�X�g�̎o�����B���c�c";
	mes "���A���فA���فA���A����A���c�c";
	next;
	emotion 9;
	mes "[�_�C�E]";
	mes "�Ƃɂ����A�j�̃��}��������c�c";
	mes "�ӂ��c�c";
	next;
	mes "[�_�C�E]";
	mes "�ł͎��₾!!";
	mes "�U���̐S���Ƃ�������G���y���E����";
	mes "���̂悤�Ȍ`�ł͂Ȃ��A�킵��������";
	mes "������������A���O�͂ǂ�����!!";
	next;
	switch(select("�ǂ�Ȍ`���낤�Ɖ�","��΂ɉ󂹂Ȃ�","�ڂ��Ԃ��ĉ�")) {
	case 1:
		mes "[�_�C�E]";
		mes "�ق��A�����ȁB";
		if(Sex) {
			mes "�j�������C�W����̂�";
			mes "�D������Ȃ����ȁB";
		}
		else
			mes "���A���ɂ��鎿�₶��Ȃ��������B";
		set '@point,'@point+3;
		break;
	case 2:
		mes "[�_�C�E]";
		mes "�n�b�n�b�n!!�@��͂肻�����B";
		mes "�������҂́A���������̂�";
		mes "���˂΂Ȃ�Ȃ�!!";
		next;
		mes "[�_�C�E]";
		mes "���������̂��A�ǂ����Ď���";
		mes "�󂹂悤���`�I";
		set '@point,'@point+5;
		break;
	case 3:
		mes "[�_�C�E]";
		mes "�����𓾂邽�߂ɁA������";
		mes "�]���ɂ���c�c���B";
		mes "�����ˁB";
		set '@point,'@point+6;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "���Ȃ�A���Ԑ؂�ɂȂ�܂ŁA";
	mes "���̃G���y���E�������ʂ������낤�I";
	mes "�E�n�n�n�n�n�n!!!!";
	next;
	mes "[�_�C�E]";
	mes "���x�̓M���h�Ɋւ��鎿�₾�B";
	next;
	mes "[�_�C�E]";
	mes "�Ⴆ�΁A���O���N�����m���Ă���";
	mes "�L���M���h�ɓ������Ƃ��悤�B";
	next;
	mes "[�_�C�E]";
	mes "�����āA���̃M���h�ɂ́A";
	mes "����܂��L���ȓG�΃M���h������B";
	mes "���̓�̃M���h�̓����́A��������";
	mes "���ڂ���Ă���ƁA�t�������Ă������B";
	next;
	mes "[�_�C�E]";
	mes "���āB���O�������̂悤�Ɏ���";
	mes "���Ă���ƁA����l���Ƌ��R�o������B";
	mes "�����́A�G�΃M���h�̒��S�l�����B";
	next;
	mes "[�_�C�E]";
	mes "����ɂ́A���O�Ƃ����ȊO�N��";
	mes "���Ȃ��B�����āA����͉����ƂĂ�";
	mes "�����Ă���炵���A�����Ă���Ȃ�����";
	mes "�����Ă����B";
	next;
	mes "[�_�C�E]";
	mes "�����A���O�͂ǂ�����H";
	next;
	switch(select("��`��","��������","������")) {
	case 1:
		mes "[�_�C�E]";
		mes "�G�ł���`�����B����͂���!!";
		mes "�܂��A�����������肷��ƁA";
		mes "�M�X�M�X�����֌W���ǂ��Ȃ������";
		mes "���邵�ȁB";
		mes "���O�̍l���͂킩���ė������B";
		set '@point,'@point+6;
		break;
	case 2:
		mes "[�_�C�E]";
		mes "�܂��m���ɁA��`���K�v�����邩�ǂ���";
		mes "����񂩂�ȁB�G�Ί֌W���Ă̂����邵";
		mes "�܁A�d���Ȃ����Ėʂ����邩�B";
		mes "���O�̍l���͂킩���ė������B";
		set '@point,'@point+5;
		break;
	case 3:
		mes "[�_�C�E]";
		mes "�c�c��˂��ȁB";
		mes "���������s���̂����ŁA�G�Ί֌W��";
		mes "����w�������Ȃ���Ă��Ƃ�";
		mes "����񂾂��B";
		mes "���O�̍l���͂킩���ė������B";
		set '@point,'@point+4;
		break;
	}
	next;
	mes "[�_�C�E]";
	mes "���āA�Ō�̎��₾�B";
	next;
	mes "[�_�C�E]";
	mes "���̐����A�y�������H";
	next;
	if(select("�͂�","������")==1) {
		mes "[�_�C�E]";
		mes "�������A�悩�����ȁB";
		mes "������Ă̂́A�J��Ԃ��̂ق���������";
		mes "�C�����Γ����ꏊ������Ă���悤��";
		mes "�󂵂��������鎞�����Ă���B";
		next;
		mes "[�_�C�E]";
		mes "���ł��]�T��Y�ꂸ�A�y�����S��";
		mes "��点��B�����Y��ȏ��Ɠ��������";
		mes "�������Ƃ˂�!!�@�ō��̐l����!!";
		mes "��[���͂��͂��͂���!!!!";
	}
	else {
		mes "[�_�C�E]";
		mes "�����Ȃ̂��c�c";
		mes "�܂��A����������������邵�A����";
		mes "�����悤�Ȃ��Ƃ��J��Ԃ��Ă��A";
		mes "�󂵂������鎞�����Ă��邾�낤�ȁB";
		next;
		mes "[�_�C�E]";
		mes "�Ȃ�ł��ŏ��͊y�����Ă��A";
		mes "���X�ɋC�����Ȃ�Ă͕̂ς���Ă��B";
		next;
		mes "[�_�C�E]";
		mes "�����ȁI";
		mes "���S�Y���ׂ��炸���I";
		mes "���S�A���Ȃ킿�u���߂̐S�v!!";
		mes "���́A���̌��t�͑厖���Ǝv��!!";
		next;
		mes "[�_�C�E]";
		mes "���S��Y���΁A�l�͕ς��B";
		mes "���܂ňꐶ�����A�l�����ē���";
		mes "�����ė����̂͂킩�邳�B";
		next;
		mes "[�_�C�E]";
		mes "�����ȁA������Ɨ����~�܂��āA";
		mes "�����������Ă��������������Ă݂���";
		mes "�ǂ������H�@�������Y�ꂿ�܂������̂�";
		mes "�����A�����Ă��邩���m��Ȃ����B";
		next;
		emotion 21;
		mes "[�_�C�E]";
		mes "�����ƁA���炵���˂��B";
		mes "���̃��b�g�[�͍ːF������";
		mes "�������j�Ȃ̂ɂ�B�t�b�c�c�B";
	}
	next;
	mes "[�_�C�E]";
	mes "�����A���Ⴀ�����猩��";
	mes "���O�̕]�����B";
	next;
	mes "[�_�C�E]";
	mes "�c�c�c�c�c�c�c�c";
	next;
	if('@point < 20) {
		mes "[�_�C�E]";
		mes "����A�c�O���B";
		mes "�ǂ����Ă����O�͋C�ɐH���B";
		mes "�����ɑ���Ȃ����̂͂Ȃ�Ȃ̂��A";
		mes "�ǂ��l�������Ă݂邱�Ƃ��ȁB";
		close;
	}
	if('@point < 27) {
		mes "[�_�C�E]";
		mes "���[��c�c";
		mes "����������Ȃ��I";
		mes "����ȓz�͒ǎ���!!!";
		close;
	}
	set SIGN_QUE,15;
	getitem 7177,1;
	if(checkre()) {
		if(BaseLevel >= 90) getexp 1800,0;
		else if(BaseLevel >= 80) getexp 1300,0;
		else if(BaseLevel >= 70) getexp 1000,0;
		else if(BaseLevel >= 60) getexp 700,0;
		else getexp 300,0;
	}
	else {
		if(BaseLevel >= 90) getexp 18000,0;
		else if(BaseLevel >= 80) getexp 13000,0;
		else if(BaseLevel >= 70) getexp 10000,0;
		else if(BaseLevel >= 60) getexp 7000,0;
		else getexp 3000,0;
	}
	if('@point < 30) {
		mes "[�_�C�E]";
		mes "�ӂށA�܂������͂Ȃ����B";
		mes "���i�Ƃ��悤�B";
	}
	else {
		emotion 18;
		mes "[�_�C�E]";
		mes "���߂łƂ��I";
		mes "���͂��O���C�ɓ�����!!";
		mes "���O�A�{���ɉ��Ǝ��Ă�ȁB";
		mes "�n�n�n�A���h���낤�I";
		next;
		mes "[�_�C�E]";
		mes "�c��̃e�X�g���A�撣���B";
		mes "�ȂɁA���O�Ȃ炫���Ƃł��邳�B";
	}
	next;
	mes "[�_�C�E]";
	mes "���̓A���f�o������";
	mes "^CE0000�����j��^000000��K�˂�Ƃ����B";
	mes "������ƂЎゾ���A�ǂ��z���B";
	mes "���ɁA�����ɑ΂���S�͔M���I";
	next;
	mes "[�_�C�E]";
	mes "���Ⴀ�A����΂��[�I";
	next;
	mes "[�_�C�E]";
	mes "�c�c�c";
	next;
	emotion 3;
	mes "[�_�C�E]";
	mes "�悵�A�J�v���T�[�r�X�ɘA�����B";
	close;
}

payon.gat,154,170,3	script	�n�V��	78,{
	mes "[�n�V��]";
	mes "���`���@�ނ��Ă΂Ȃ��";
	mes "�������Ȃ̂�����`�B";
	next;
	mes "[�n�V��]";
	mes "���������͂���ȂɃ����p�N�������̂�";
	mes "���̊ԂɁA���`��Ȃɑf�G�ɂȂ��āB";
	next;
	mes "[�n�V��]";
	mes "���b�N�X�Ȃ�Ĕ��Q�ŁA���i��";
	mes "�E�t�􂾂���A����Ȃɂ��������";
	mes "�������ނ̂��ƂɏW�܂�̂�";
	mes "������O���Ǝv��Ȃ��H";
	next;
	mes "[�n�V��]";
	mes "���`���`�A�c����݂̂��̎���";
	mes "�U�f���Ă���Ȃ�������A�͂��c�c";
	next;
	if(select("���̃n���T������͂ǂ��ł����H","�������͍߂��ˁ`")==2) {
		emotion 6;
		mes "[�n�V��]";
		mes "����₾�`�B";
		mes "�������ĎႢ���͐��������̂�B";
		mes "�����A�����킹��̂�[�I";
		close;
	}
	mes "[�n�V��]";
	mes "�t�F�C������A�n���T���ȃ_�C�E�l�H";
	next;
	mes "[�n�V��]";
	mes "�_�C�E�l�́A���傤�ǐ��ς�肷��O";
	mes "������������B�����Ȃ��Ă����";
	mes "�����������񂾂��ǁA����Ȃɑs����";
	mes "�f�G�ɂȂ��ċA���Ă���Ȃ�āc�c";
	next;
	menu "�_�C�E�l�͂ǂ��ł����H",-;
	mes "[�n�V��]";
	mes "�����Ɓc�c";
	if(Sex) {
		mes "�����ˁB���Ȃ����_�C�E�l�ɉ���āA";
		mes "�^�̒j���Ă��̂��w�ԂƂ�����B";
	}
	else {
		mes "���Ȃ����A���B�̃_�C�E�l��";
		mes "�\�𕷂��Ă����̂ˁ`�B";
		next;
		mes "[�n�V��]";
		mes "�l�C�����肷���č������Ⴄ�`�B";
	}
	next;
	mes "[�n�V��]";
	mes "�_�C�E�l�́A���̒��̖k�ɂ��邨���~��";
	mes "�����������B";
	close;
}

payon_in03.gat,13,31,4	script	����	1416,{}
payon_in03.gat,13,31,0	script	����	111,{
	mes "[����]";
	mes "�_�C�E�l�A����������񏢂��オ����";
	mes "���������܂��B����́A�̂ɗǂ�";
	mes "��̖򑐂ƌՂ̑��̗�������A";
	mes "5���Ԃ�������ύ��񂾂��̂�";
	mes "�������܂��B";
	next;
	mes "[����]";
	mes "�����̔�ꂪ������сA����ɁA";
	mes "���ׂ̗\�h�A�����Ďア����";
	mes "�������Ă���܂���B";
	mes "�͂��A���`��B";
	close;
}

payon_in03.gat,8,31,4	script	����	1416,{}
payon_in03.gat,8,31,0	script	����	111,{
	mes "[����]";
	mes "���̗��{�̉����B���A�ǂ�����";
	mes "�������Ƃ�����p�ł��A�|�Ⓛ��";
	mes "�����悤�Ƃ��Ă͂Ȃ�܂���B";
	next;
	mes "[����]";
	mes "���B�́A�_�C�E�l�̎���ɂ��A";
	mes "���̂悤�Ȉߑ��ɐg����ł��邾����";
	mes "�������܂��B�ł��̂ŁA�ǂ��������";
	mes "���[�߂��������B";
	close;
}

payon_in03.gat,81,22,4	script	����	1170,{}
payon_in03.gat,81,22,0	script	����#sign	111,{
	mes "[����]";
	mes "��������Ⴂ�܂��A";
	mes "�����̓_�C�E�l������炵��";
	mes "�t�F�C�������{�ł��B";
	close;
}
payon_in03.gat,81,15,0	script	����	1170,{}
payon_in03.gat,81,15,0	duplicate(����#sign)	����	111
payon_in03.gat,79,22,4	script	����	1404,{}
payon_in03.gat,79,22,0	duplicate(����#sign)	����	111
payon_in03.gat,79,15,0	script	����	1404,{}
payon_in03.gat,79,15,0	duplicate(����#sign)	����	111

//============================================================
// ��1�� - �����j���̎���
//------------------------------------------------------------
aldeba_in.gat,155,101,3	script	�����j��	805,7,7,{
	if(gettime(3) >= 6) && (gettime(3) < 17) {
		mes "^0063FF-�G�ɖ{���U��΂��Ă��钆�A";
		mes "�j��1�l�A��Ɏ����ǂ��������܂�";
		mes "���̕\��𕂂��ׂĂ���-";
		mes "-�ǂ����悤�H-^000000";
		next;
		if(select("���������Ă݂�","�����Ă���")==1) {
			mes "[" +strcharinfo(0)+ "]";
			mes "���́c�c�c�c";
			next;
			mes "[�����j��]";
			mes "�c�c�c�c�c�c";
			next;
			mes "^0063FF-�����̎����ɏW�����邠�܂�";
			mes "������̐����������Ă��Ȃ��悤��-^000000";
			next;
			if(select("������x���������Ă݂�","�����Ă���")==1) {
				mes "[" +strcharinfo(0)+ "]";
				mes "���炵�܁[�[�[��!!";
				next;
				mes "[�����j��]";
				mes "�c�c!!";
				mes "���c�c����ɂ��́c�c";
				mes "�c�c�\���󂠂�܂��񂪁A���͂������";
				mes "�肪�����Ȃ��̂Łc�c�ߌ�5���ȍ~�ɁA";
				mes "�܂����Ă��������c�c";
				next;
				mes "[�����j��]";
				mes "�c�c����������c�c������c�c�悵�B";
				mes "�c�c����ł��Ȃ����c�c";
				mes "����ł́A�܂�������x�c�c";
				close;
			}
		}
		mes "^0063FF-��u�A���������悤�Ǝv������";
		mes "�܂��o�������Ƃɂ���-";
		mes "-�����̒��ŁA�ނ��Ⴍ�Ԃ₭����";
		mes "�����ǂ��y���Ԃ��鉹��������-^000000";
		close;
	}
	if(gettime(3) < 6) || (gettime(3) >= 22) {
		mes "[�����j��]";
		mes "�c�cz�c�czz�c�cZ";
		close;
	}
	if(SIGN_QUE < 15) {
		mes "[�����j��]";
		mes "�����c�c�c�c";
		mes "�_�͖{���ɑf���炵���B";
		mes "������L�����o���c�c";
		mes "�����a���ƁA���̉��[���c�c";
		mes "�܂��ɐ_�邾�c�c";
		next;
		mes "[�����j��]";
		mes "���͒P�Ȃ�w�҂ɂ����܂��񂪁A";
		mes "���[��c�c�c�c";
		mes "�w�͂���݂̂ł��c�c";
		mes "�_�ւ̗̈�ɒ���c�c";
		mes "�c�c�����󂯂Ă��܂��ł��傤���H";
		next;
		mes "[�����j��]";
		mes "���M�́c�c����܂���c�c";
		mes "�ł��A���͐M���Ă��܂��B";
		mes "���̐��̑S�Ă��A����̏����ɂ���āA";
		mes "���̌`�Ԃ𐬂��Ă���̂��Ɓc�c";
		next;
		mes "[�����j��]";
		mes "�����̒a���������c�c";
		mes "�����͂��̔閧���c�c�c�c";
		mes "�K�����������̂ł��B";
		mes "���̎��c�c�l�͂����ƈ̂��푰��";
		mes "�Ȃ��̂ł��傤���H";
		close;
	}
	switch(SIGN_QUE) {
	case 15:
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c";
		next;
		emotion 23;
		mes "^313FFF-�K�`����-^000000";
		next;
		mes "[�����j��]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		emotion 19;
		mes "[�����j��]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		emotion 28;
		mes "[�����j��]";
		mes "�����c�c�c�c";
		mes "5���Ԃ����đ��₵���̂ɁA";
		mes "����Ȃ��ƂɁc�c";
		mes "���������c�c";
		next;
		emotion 28;
		mes "[�����j��]";
		mes "���������c�c�����p�ł����c�c";
		mes "�Â��Ɍ����ł���Ǝv���āA������";
		mes "��������������̂Ɂc�c�����c�c";
		next;
		if(select("�_�C�E����̏Љ�ŗ��܂���","�\���󂠂�܂���c�c")==2) {
			emotion 28;
			mes "[�����j��]";
			mes "���������c�c�c�c";
			mes "�܂�5���ԁc�c";
			close;
		}
		emotion 4;
		mes "[�����j��]";
		mes "���c�c";
		mes "�����Ȃ�ł����c�c�I";
		mes "���������΂���ȗ��݂�";
		mes "�󂯂܂��������c�c";
		next;
		emotion 19;
		mes "[�����j��]";
		mes "�������A����Łc�c�����O�́c�c�H";
		next;
		menu strcharinfo(0)+ "�ƌ����܂�",-;
		mes "[�����j��]";
		mes "���c�c";
		mes strcharinfo(0);
		mes "����ł����B";
		mes "���̓����j���ł��c�c";
		mes "�������D���ȕ��}�Ȋw�҂ł��c�c";
		next;
		mes "[�����j��]";
		mes "���b�c����̗��݂��f�낤��";
		mes "�v������ł����c�c";
		mes "���́A�悤�����B";
		next;
		mes "[�����j��]";
		mes "���c�c" +strcharinfo(0)+ "����";
		mes "���炵���ƌ������Ƃ�";
		mes "���ꂩ��͂����Ƒ�R�̐l���A������";
		mes "����悤�ɂȂ�Ƃ������ł��ˁB";
		next;
		mes "[�����j��]";
		mes "�����c�c";
		mes "���̌����́c�c���������c�c";
		mes "���b�c����c�c";
		next;
		mes "[�����j��]";
		mes "�����c�c";
		mes "�񑩂ł�����d���Ȃ��ł��c�c";
		mes "��قǁA���Ȃ����}��";
		mes "���������������ŁA���̏d�v��";
		mes "�����T���v��������Ă��܂��܂����B";
		mes "�܂��́A���ُ̕����炨�肢���܂��B";
		next;
		mes "[�����j��]";
		mes "���c�c����Ȃ��ɂ܂Ȃ��ł���������I";
		mes "����͂Ƃ��Ă��厖�ȃT���v��";
		mes "��������ł��I";
		next;
		mes "[�����j��]";
		mes "���A����łł��ˁc�c";
		mes "��̎����� 10��";
		mes "�C�O�h���V���̗t 2��";
		mes "�΃n�[�u 10��";
		mes "�ȒP�ł���c�c�n�n�c�c";
		next;
		mes "[�����j��]";
		mes "�ŋ߁A�����H�w�̌��������Ă܂��āB";
		mes "�_�̂悤�ɁA������L��n���c�c";
		mes "�s�v�c�Ȑ��\�𔭊�����";
		mes "�C�O�h���V���̗t�ɁA���̔閧��";
		mes "�B����Ă��Ȃ����Ǝv���āc�c";
		next;
		emotion 4;
		mes "[�����j��]";
		mes "����ł͂��肢�������܂��c�c";
		mes "���A�������c�c���́A���́c�c";
		mes "���c�c��10���ɂȂ�ƁA�v�c����";
		mes "�d�r���؂ꂽ�݂�����";
		mes "�������Ⴄ��ł��c�c�Ȃ̂ŁA";
		mes "10���O�ɂ��炵�Ă��������c�c";
		set SIGN_QUE,16;
		close;
	case 16:
		if(countitem(1092) < 10 || countitem(610) < 2 || countitem(511) < 10) {
			mes "[�����j��]";
			mes "�c�c�܂��������ł����H";
			mes "��̎����� 10��";
			mes "�C�O�h���V���̗t 2��";
			mes "�΃n�[�u 10�ł��c�c";
			mes "���A����ȕ|���炵�Ȃ��ł��c�c";
			mes "���݂܂��c�c�E�E�c�c";
			close;
		}
		delitem 1092,10;
		delitem 610,2;
		delitem 511,10;
		emotion 15;
		mes "[�����j��]";
		mes "�����������A���肪�Ƃ��������܂��c�c";
		mes "����ł܂������𑱂����܂�";
		next;
		mes "[�����j��]";
		mes "���c�c����ł͎����̕����c�c";
		next;
		mes "[�����j��]";
		mes strcharinfo(0)+ "����́A";
		mes "^CE3131���҂̐�^000000�������m�ł����H";
		next;
		mes "[�����j��]";
		mes "���B�����҂̊ԂŁA���Ɣ閧����";
		mes "����Ă���΂ł��B���ہA����";
		mes "���݉ۂɂ��ẮA�N���ڂ������Ƃ�";
		mes "�m��܂���c�c";
		next;
		mes "[�����j��]";
		mes "^CE3131���҂̐�^000000�������́A";
		mes "�����悭�m��܂���c�c";
		mes "�����A�{�\�I�Ɋ�����̂ł��c�c";
		mes "���ꂳ������΁A��؂��Ă���";
		mes "���̎������c�c�Ȃɂ��A��������";
		mes "���邱�Ƃ��ł���̂ł͂Ȃ����Ɓc�c";
		next;
		mes "[�����j��]";
		mes "�����Łc�c�I";
		mes "^CE3131���҂̐�^000000�ɂ���";
		mes "���������肢���܂��I";
		next;
		mes "[�����j��]";
		mes "�\�ɂ��ƁA�ߋ��ɖ���y����";
		mes "����A���P�~�X�g�̏���������";
		mes "�m���Ă���Ƃ̂��ƁB�����A���̕���";
		mes "������A�n�ʂƖ������̂āA";
		mes "���{�̂悤�Ȑ[���X��";
		mes "�����Ă��܂����ƌ����Ă��܂��B";
		next;
		mes "[�����j��]";
		mes "���̏����ɉ���Ƃ��ł���΁A";
		mes "���҂̐΂ɂ��ĉ��炩��";
		mes "���𓾂���͂��ł��B";
		mes "�ޏ���T���Ă��������B";
		mes "����ł́A���肢���܂�����B";
		set SIGN_QUE,17;
		close;
	case 17:
	case 18:
		mes "[�����j��]";
		mes "���҂̐΂Ɋւ�����͂܂��ł����H";
		close;
	case 19:
		mes "[�����j��]";
		mes "�����c�c��������Ȃ����I";
		mes "����ŁA���҂̐΂ɂ��āA";
		mes "�����킩��܂������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���ꂪ�A�قƂ�ǉ����킩��܂���";
		mes "�ł����B�����A���҂̐΂͐Ԃ��F��";
		mes "���Ă���Ƃ��A�s�V�s���̖򂾂Ƃ���";
		mes "�b�𕷂��܂����B";
		mes "�܂�A�������͂����΂Ȃ񂾂�";
		mes "�v���܂��B";
		next;
		mes "[�����j��]";
		mes "��͂�A�����̉\�ɉ߂��Ȃ�������";
		mes "�������Ƃł��傤���c�c�B";
		mes "�ł��A���̘b���ƁA���҂̐΂�";
		mes "�߂����݂��A�g�߂ɂ������悤�ȁc�c";
		mes "�Ȃ񂾂��������c�c";
		mes "���Ȃ��A�����S������͂���܂��񂩁H";
		next;
		input '@word$;
		if('@word$ != "�C�G���[�W�F���X�g�[��" && '@word$ != "���b�h�W�F���X�g�[��" && '@sign_word$ != "�u���[�W�F���X�g�[��") {
			mes "[�����j��]";
			mes "���[��A�Ⴄ�Ǝv���܂���c�c";
			close;
		}
		mes "[�����j��]";
		mes "�c�c�����A�����ł��ˁB";
		mes "�m���ɁA�߂����݂�������܂���c�c";
		mes "�m�M�͂���܂��񂪁c�c";
		next;
		mes "[�����j��]";
		mes "�͂��A�悭�킩��܂����c�c";
		mes "���҂̐΂ɂ��ẮA���̂܂ܖY��āA";
		mes "�����̌����ɐ�O�������Ǝv���܂��c�c";
		mes "�\�ɗ��낤�Ƃ��Ă����������A";
		mes "���ƂȂ��Ă͒p���������āc�c";
		mes "���������c�c";
		next;
		set SIGN_QUE,20;
		getitem 7177,1;
		mes "[�����j��]";
		mes "�����l�ł��c�c";
		mes "�ł́A����������グ�܂��B";
		mes "���͂܂������ɖ߂�Ƃ��܂��c�c";
		mes "�A�A�c�c����ŖK�˂Ă���l��";
		mes "�����Ă����΂����̂ɂȁc�c";
		next;
		mes "[�����j��]";
		mes "���́A���@�̓s�s�ɂ���������";
		mes "^0063FF�W�X�N���G^000000�l��";
		mes "�K�˂Ă��������c�c";
		next;
		mes "[�����j��]";
		mes "�ޏ���1�����ɂƂǂ܂鐫�i�ł�";
		mes "�Ȃ����A�F�l���������Ȃ̂ŁA";
		mes "���ق̂悤�ȏꏊ�ɖ��ɂȂ��Ă����";
		mes "�v���܂��B����ł́c�c";
		close;
	case 20:
		mes "[�����j��]";
		mes "���́A���@�̓s�s�ɂ���������";
		mes "^0063FF�W�X�N���G^000000�l��";
		mes "�K�˂Ă��������c�c";
		close;
	default:
		mes "[�����j��]";
		mes "�����c�c�����ł��Ȃ����c�c";
		mes "��������Ɓc�c������!!";
		mes "�������ł��Ȃ������c�c";
		mes "���������c�c�ǂ����悤�c�c";
		close;
	}
OnTouch:
	if(rand(2)) {
		emotion 5;
		misceffect 305;
	}
	else {
		emotion 23;
		misceffect 306;
	}
	end;
}

aldeba_in.gat,156,118,4	script	�s���s��	102,{
	if(gettime(3) >= 6 && gettime(3) < 12) {
		mes "[�s���s��]";
		mes "�������撣���Č��������`";
		mes "������M�S�Ɏ��������`";
		next;
		mes "[�s���s��]";
		mes "���̌������ɂ́A�l�Ƃ��t���l����";
		mes "���܂��񂪁A���N�ێ��̂��߁A";
		mes "��΂Ɏ���Ă���K��������܂��B";
		next;
		mes "[�s���s��]";
		mes "�ߑO10������A�ߌ�5���܂�";
		mes "�����ɐ�O�B";
		mes "���R���Ԃ�5���ȍ~�ł��B";
		mes "���t���l�́A��10���܂Ō������āA";
		mes "���̂܂ܐQ�Ă��܂��܂����ǂˁB";
		next;
		mes "[�s���s��]";
		mes "������A�����ȊO�̗p�ł�����";
		mes "5�����߂��Ă���K�˂Ă��Ă��������B";
		close;
	}
	if(gettime(3) < 6) {
		mes "[�s���s��]";
		mes "�c�c�N�E�c�c�O�E�c�c";
		mes "�t�j���c�c���j���c�c";
		next;
		if(select("�N����","��߂�")==2) {
			mes "[�s���s��]";
			mes "���j���c�c�O�[�c�c";
			close;
		}
		mes "[�s���s��]";
		mes "�c�c�c�c";
		mes "���Ă�񂾁[�I";
		mes "10���܂ŐQ������[�I";
		mes "���@�[!!!�@�L���A�A�A�A�b!!!!";
		close;
	}
	emotion 28;
	mes "[�s���s��]";
	mes "�������A����!!�@�Q����!!";
	mes "�ł��A����΂�Ȃ��Ƒ��Ƃ��c�c";
	mes "�炢�ȁ`�c�c���������c�c";
	mes "���t���l�`�A�����͂����܂ł���";
	mes "���߂ł����`�H";
	next;
	switch(select("�����͉������鏊�ł����H",(SIGN_QUE == 17)? "�������A���P�~�X�g�ɂ���": "",(SIGN_QUE == 17)? "���҂̐΂��ĂȂ�ł����H": "")) {
	case 1:
		mes "[�s���s��]";
		mes "�����͎��̂��t���l�A�����j���l��";
		mes "�������ł��B";
		mes "���t���l�͍ŋ߁A�l�H�I�ɐ�����";
		mes "���ݏo�����Ƃ��ł��邩�̌�����";
		mes "�Ȃ����Ă���܂��B";
		next;
		mes "[�s���s��]";
		mes "�������A���₷�����Ƃł�";
		mes "����܂���B";
		mes "�ł��̂ŁA���t���l�͍ŋ߂�����";
		mes "���̌����ɖv�����Ă��炵�āc�c";
		mes "�N�Ƃ�����Ă��Ȃ����A�S�z�ł��B";
		close;
	case 2:
		mes "[�s���s��]";
		mes "�������A���P�~�X�g�ł����H";
		mes "���̂��w�l�́A�����H�w�̕����";
		mes "�Ƃ��Ă��L���Ȑl��������";
		mes "�����Ă��܂��B";
		next;
		mes "[�s���s��]";
		mes "������A����̍ޗ���g�ݍ��킹��";
		mes "�����X�^�[������������@�𔭕\���A";
		mes "���E�Ɉ��Z���Z�[�V������";
		mes "�����N����������ɁA";
		mes "������Ǝp�������������ł��B";
		next;
		mes "[�s���s��]";
		mes "�����܂ł͒N�ł��m���Ă邨�b�ł��B";
		mes "���́A���̃A���P�~�X�g����A";
		mes "���̗F�B�������̂ł��I";
		mes "�Ƃ��Ă��D�G�Ȏq��������ł���B";
		next;
		mes "[�s���s��]";
		mes "�ޏ��Ɣޏ��̂�������́A������F�B�A";
		mes "�S�Ă��]���ɂ��āA�����ɖ������";
		mes "�܂����B�����āA�����X�^�[�����p��";
		mes "����������ł��B";
		next;
		mes "[�s���s��]";
		mes "�������A���܂�ɂ������ŃG�l���M�[��";
		mes "�g�����������ʁA���̌����̊�����A";
		mes "�����Ɍ��C���������ƌ����āc�c";
		mes "��������ƈꏏ�ɉו����܂Ƃ߂āA";
		mes "^CE3131��ɂ���X^000000�ɓ����čs����";
		mes "���܂��܂����B";
		next;
		mes "[�s���s��]";
		mes "�킴�킴�A����Ȋ�Ȃ��ꏊ��I��";
		mes "�K�v�����������ǂ����^��ł��B";
		mes "�ł��A���ꂾ���A���������Y��ĐÂ���";
		mes "��炵���������̂�������܂���B";
		mes "���̍��́A���������A�N������ޏ���";
		mes "�K��Ă��܂������ˁB";
		next;
		mes "[�s���s��]";
		mes "���Ȃ�X�g���X�����܂��Ă���";
		mes "�݂����ł����c�c�B";
		mes "�l�Ƃ��t���l�̌���������������A";
		mes "�ޏ��B�݂����ɐ����̂Ă�悤��";
		mes "�Ȃ�̂��ȁc�c�H";
		close;
	case 3:
		mes "[�s���s��]";
		mes "����́A�l���킩��܂���B";
		mes "���������Ő������Ă���Ƃ������A";
		mes "�O�ɂ���܂�o�ĂȂ�����A�\�Ƃ�";
		mes "�S�R�킩��Ȃ���ł��B";
		close;
	}
}

aldeba_in.gat,139,103,0	script	�m�[�g	111,{
	mes "[�����j��]";
	mes "�A�A�b�A�G��Ȃ��ł��������I";
	mes "���̌����������A���Ƃ̏ꏊ��";
	mes "�߂��Ă��������I";
	mes "�͂₭!!";
	close;
}

prt_maze02.gat,58,150,0	script	prtmazemove	139,5,5,{
OnTouch:
	mes "^3355FF�[���X�̒��A���Ȃ��͖؁X��";
	mes "�Ԃɏ����鏭���̌��p������";
	mes "�}���ł��̌��ǂ���-^000000";
	close2;
	switch(rand(10)) {
		default: warp "prt_maze02.gat",11,146; break;
		case 4: 
		case 5: 
		case 6: warp "prt_maze03.gat",55,8; break;
		case 7: 
		case 8: 
		case 9: warp "prt_maze01.gat",62,129; break;
	}
	end;
}
prt_maze02.gat,57,151,1	duplicate(prtmazemove)	�v����	91

prt_maze02.gat,18,126,0	script	prtmazewarp	139,3,3,{
	warp "prt_maze02.gat",90,170;
	end;
}

prt_maze02.gat,25,161,0	script	prtmazemusic	139,7,7,{
	soundeffect "assassin_of_sunset.wav",0;
	end;
}

prt_maze02.gat,14,183,4	script	�^�b�^	51,{
	if(SIGN_QUE > 18) {
		mes "[�^�b�^]";
		mes "��������͂����₭�`";
		mes "�ǂ�ȂɈ̂��w�҂ł��`��";
		mes "�����Ȃ�Ŕ������P�����`";
		mes "�ǂ�Ȍ����ł��킩��Ȃ��`��";
		mes "�������`��";
		next;
		emotion 18;
		emotion 4,"�v����#sign";
		mes "[�v����]";
		mes "��������c�c";
		mes "[�^�b�^]";
		mes "�n�n�n�b�A������ƃN�T���������ȁH";
		close;
	}
	if(SIGN_QUE < 18) {
		emotion 2;
		mes "[�^�b�^]";
		mes "�v�����A�����͉�������";
		mes "�V��ł����񂾂��H";
		next;
		emotion 2,"�v����#sign";
		mes "[�v����]";
		mes "�����́A�F����Ɣ��F�����";
		mes "�S���������ėV�񂾂́B";
		next;
		emotion 2;
		mes "[�^�b�^]";
		mes "�߂��ɂ͋��낵���������Z��ł���B";
		mes "���ɖ���Ȃ��悤�A�C��t����񂾂�B";
		mes "�����ˁH";
		next;
		emotion 18,"�v����#sign";
		mes "[�v����]";
		mes "�́[���A��������B";
		mes "�ł��A�������̖��{�́A";
		mes "�ڂ���Ă������Ēʂ���B";
		next;
		mes "[�^�b�^]";
		mes "�ӂӁA���̐X�ɗ��Ă��炩�Ȃ�";
		mes "�o���Ă��܂����ˁB";
		mes "���̂킪�܂܂�";
		mes "���O�̐l�����]���ɂȂ�Ȃ����A";
		mes "�S�z�������Ƃ͂����c�c";
		next;
		emotion 31,"�v����#sign";
		mes "[�v����]";
		mes "������A���B�͂��ׂ����Ƃ�";
		mes "�S�Ă�����ł���H";
		mes "������A�x�ގ��ɂȂ���������B";
		mes "�����ɗ��Ă���A�S��������";
		mes "�������������́B";
		next;
		emotion 28;
		mes "[�^�b�^]";
		mes "�������B";
		mes "������������A�����������������c�c";
		next;
		emotion 2;
		mes "[�^�b�^]";
		mes "���B�͖��{�̐e�q�`";
		mes "�Â��Ő[�����т����X�̒��`";
		mes "�������������͍K���Ł`�`";
		if(SIGN_QUE != 17)
			close;
		next;
		if(select("����[!!!!","���炵�܂�")==1) {
			set SIGN_QUE,18;
			monster "prt_maze02.gat",14,177,"�t���[��",1118,1;
			monster "prt_maze02.gat",17,171,"�t���[��",1118,1;
			monster "prt_maze02.gat",24,173,"�t���[��",1118,1;
			monster "prt_maze02.gat",17,175,"�}�����X�t�B�A�[",1142,1;
			monster "prt_maze02.gat",17,168,"�}�����X�t�B�A�[",1142,1;
			emotion 23,"�v����#sign";
			emotion 23;
			mes "[�v����]";
			mes "���[�b!!";
			mes "�o�C�I�v�����g!!";
			mes "[�^�b�^]";
			mes "�͂�!!";
			mes "�X�t�B�A�[�}�C��!!";
			close;
		}
		emotion 0,"�v����#sign";
		emotion 0;
		mes "[�^�b�^]";
		mes "���́c�c�l�����̂悤�ȏꏊ�ɁH";
		mes "���������A�ǂ̂悤�Ȃ��p���ŁH";
	}
	if(SIGN_QUE == 18) {
		emotion 32;
		mes "[�v����]";
		mes "���҂�!!";
	}
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���͂��������������Ƃ������āA";
	mes "����l��T���Ă��܂����B";
	mes "��Ċ������ł��B";
	next;
	mes "[�^�b�^]";
	mes "����́A�ǂ����c�c";
	mes "����ȏ��܂ł���Ă���Ƃ́A";
	mes "��́A���𕷂������̂ł��傤�H";
	next;
	switch(select("���҂̐΂ɂ���","�A���P�~�X�g�̌����ɂ���","����ς�Ȃ�ł��Ȃ��ł�")) {
	case 1:
		mes "[�^�b�^]";
		mes "�c�c���͎��B�ɂ�";
		mes "�悭�킩��Ȃ��̂ł��B";
		next;
		mes "[�^�b�^]";
		mes "���Ԃ�A���҂̐΂Ƃ́A�N��";
		mes "�������Ă͂����Ȃ����̂Ȃ̂ł��B";
		mes "���X�A�\�ɂȂ�����Ȃ�Ȃ�������c�c";
		mes "�N�������o�����b�Ȃ̂���";
		mes "����܂���B";
		next;
		mes "[�^�b�^]";
		mes "����ȏ��܂ŖK�˂Ă��Ă����������̂�";
		mes "���͂ɂȂꂸ�\���󂲂����܂���B";
		next;
		mes "[�^�b�^]";
		mes "�\�b���x�ł悯��΁c�c";
		mes "���҂̐΂́A�ǂ�ȕ���������";
		mes "�����邱�Ƃ��ł���A�G�}�̂悤��";
		mes "���̂��ƌ����Ă��܂��B";
		next;
		mes "[�^�b�^]";
		mes "�B���p����������҂��A";
		mes "��������ڎw�����ɂ̑��݂ł��B";
		next;
		mes "[�^�b�^]";
		mes "�������Ƃ���A�������ɕς���ȊO��";
		mes "�s���̖���Ƃ������Ă��܂��B";
		mes "���̐F�͐[�g�������ł��c�c";
		mes "�ǂ��ł���ȉ\�����������A�ł����H";
		next;
		mes "[�^�b�^]";
		mes "���l���̊w�҂́A���҂̐΂�";
		mes "�T���̂ł͂Ȃ��A���҂̐΂���낤��";
		mes "���܂����B�����āA���҂̐΂��̂��̂�";
		mes "�����ł������A����ɋ߂����͂̍���";
		mes "�΂����̂ɂ͐��������ƕ�����";
		mes "���܂��B";
		next;
		mes "[�v����]";
		mes "���B���m���Ă���̂́A���̒��x�ł��B";
		mes "�������������܂ł��炵���̂ɁA";
		mes "�\���󂲂����܂���B";
		next;
		mes "[�^�b�^]";
		mes "����ł́A�A�蓹�͎��B��";
		mes "�ē����܂��傤�B";
		mes "�����͊댯�ł�����B";
		next;
		mes "[�^�b�^][�v����]";
		mes "��������悤�A���l����B";
		close2;
		set SIGN_QUE,19;
		warp "mjolnir_12.gat",44,23;
		end;
	case 2:
		mes "[�v����]";
		mes "���Ƃ�������́A�Ƃ��Ă�������";
		mes "�����𑱂��Ă��܂����B�����āA";
		mes "�������Ă��܂�����ł��B";
		next;
		mes "[�v����]";
		mes "����\�ȓ���̍ޗ���g�ݍ��킹�A";
		mes "�܂������ʂ̗͂𔭊�����";
		mes "�����t�ł��B";
		next;
		mes "[�v����]";
		mes "������g���ƁA����̃����X�^�[��";
		mes "����������A������������o���܂��B";
		mes "�������ʂ𔭕\�������́A�{����";
		mes "��ςł����c�c���E���̃A���P�~�X�g��";
		mes "�W�܂������Ǝv���قǁA�����l��";
		mes "�K��Ă��܂����I";
		next;
		mes "[�^�b�^]";
		mes "�����Ŕ��Ă�����A������̒��ڂ�";
		mes "���͐S�g���ɂ���Ă��܂��܂����B";
		mes "����ŁA�l�Ɍ�����Ȃ��悤��";
		mes "���̐X�ɏZ�ނ��Ƃɂ����̂ł��B";
		next;
		mes "[�^�b�^]";
		mes "�����t�ɂ��ĕ��������Ȃ�A";
		mes "�B���p�t�M���h�̐l��A";
		mes "�X�̃A���P�~�X�g��";
		mes "�����΂�낵���ł��傤�B";
		next;
		mes "[�^�b�^]";
		mes "���B�́A��������ȏ�A";
		mes "����ɂ���";
		mes "�b�������Ȃ��̂ł��B";
		close;
	case 3:
		mes "[�^�b�^]";
		mes "�n�n�n�A�������낢�������B";
		close;
	}
}

prt_maze02.gat,16,183,3	script	�v����#sign	91,{
	if(SIGN_QUE < 19) {
		mes "[�v����]";
		mes "�������`";
		mes "�������`";
		close;
	}
	mes "[�v����]";
	mes "���҂̐΁c�c";
	close;
}

//============================================================
// ��1�� - �W�X�N���G�̎���
//------------------------------------------------------------
geffen_in.gat,59,74,4	script	�W�X�N���G#sign	803,{
	if(SIGN_QUE < 20) {
		mes "[�W�X�N���G]";
		mes "�}�X�^�`�`";
		mes "������t�`";
		close;
	}
	switch(SIGN_QUE) {
	case 20:
		mes "[�W�X�N���G]";
		mes "�}�X�^�`�`";
		mes "������t�`";
		next;
		mes "[�W�X�N���G]";
		mes "�ӂ��c�c";
		mes "����";
		mes (Sex? "�f�G�Ȃ��Z����A": "�������삳��")+ "�A����ɂ��́B";
		mes "���̓W�X�N���G�B";
		mes "���������Ƃ���ł���H";
		mes "�t�t�A�������H";
		next;
		if(select("�����ł��c�c","���������Ƃ���܂��I")==1) {
			emotion 4;
			mes "[�W�X�N���G]";
			mes "�N�X�N�X�A��k�c�c";
			mes "���͒m���Ă����ł��傤�H";
			next;
			if(select("�͂�","�S�R�m��܂���")==2) {
				emotion 9;
				mes "[�W�X�N���G]";
				mes "�c�c";
				next;
				mes "[�W�X�N���G]";
				mes "�����c�c";
				mes "�֐S���Ȃ����̂悤�ˁB";
				next;
			}
		}
		else
			set @menu,1;
		if(@menu==1) {
			emotion 32;
			mes "[�W�X�N���G]";
			mes "�z�z�z�A�����ł��傤�B";
			mes "�ł��A���͔�������������Ȃ��̂�I";
			mes "���͍D��S�������āA�����������Ȃ���";
			mes "�C�����܂�Ȃ����A���l���m���Ă���";
			mes "���Ƃ��S�Ēm�肽���B";
			mes "���Ȑ��i��ˁA�q�b�N�B";
			next;
			mes "[�W�X�N���G]";
			mes "�ł��ˁA�������Ŏ����m��Ȃ����Ƃ�";
			mes "����Ȃ��́B�t�t�c�c";
			mes "����A������H";
			mes "���o����`�A������t�`�I";
			next;
		}
		mes "[�W�X�N���G]";
		mes "���͂ˁA�����ŋP���Ă��鎩�����D���B";
		next;
		mes "[�W�X�N���G]";
		mes "���ɁA�������Ō���l�X�̎���!!";
		mes "�]�b�Ƃ���悤�ȁA�s�����Ƃ���悤��";
		mes "���̎����c�c�t�t�b�B";
		next;
		mes "[�W�X�N���G]";
		mes "���ׂ̈ɁA�w�Ԃ��Ƃɋ������悤��";
		mes "�������āc�c";
		next;
		mes "[�W�X�N���G]";
		mes "�E�B�U�[�h�����͂������A";
		mes "�����ȏ�̒m����g�ɕt���Ȃ����";
		mes "��ւƌ�����Z�[�W�������I";
		next;
		mes "[�W�X�N���G]";
		mes "���w�I�v�Z�\�͂Ɛ��m�����K�v��";
		mes "�A���P�~�X�g�������A�D�G�Ȑ��т�";
		mes "���i�����A�D�G�Ȋw�k�ł���Ɠ�����";
		mes "�L�\�Ȋw�ҁc�c���ꂪ���B";
		next;
		mes "[�W�X�N���G]";
		mes "�z�z�z�A�����Ō����̂��Ȃ񂾂��ǁA";
		mes "����蔎���Ȑl�͂��̐��ɂ��Ȃ���B";
		mes "�z�z�z�A�z�z�z�z�z�B";
		next;
		if(select("������Ă����","�قǂقǂɂ��Ă��������c�c")==2) {
			mes "[�W�X�N���G]";
			mes "�t�[���c�c";
			mes "���񂾂炢���Ȃ��H";
			mes "���͂�������D���Ȃ́�";
			mes "�q�b�N�B";
			next;
			mes "[�W�X�N���G]";
			mes "�܂������̒����A���̖ڂɂ�";
			mes "������������̂�A�킩��Ȃ��ā`�H";
			close;
		}
		mes "[�W�X�N���G]";
		mes "����c�c";
		mes "����������Ă���H";
		next;
		emotion 6;
		mes "[�W�X�N���G]";
		mes "����ȂɗD�G�Ȏ����H";
		mes "�c�c�c�Ӂ[��B";
		next;
		emotion 7;
		mes "[�W�X�N���G]";
		mes "���܂ŒN���A����Ȃ��Ƃ����̎���";
		mes "�������l�͂��Ȃ�������c�c";
		mes "�����āA���͎��������̂ł�����!!!";
		next;
		mes "[�W�X�N���G]";
		mes "�킩������!!!!";
		mes "���Ȃ�������蓪���ǂ��Ȃ�";
		mes "�������̐��ӋC�Ȍ��t���Y��āA";
		mes "���͎�����������Ă����";
		mes "�F�߂܂��傤�I";
		next;
		mes "[�W�X�N���G]";
		mes "�ł��A���Ȃ����������Ȃ�A";
		mes "���̎����S���������㏞��";
		mes "���ꑊ���Ɏx�����Ă��炤��!!";
		next;
		mes "[�W�X�N���G]";
		mes "�b�͊ȒP�B";
		mes "�����ɂ���A�������o���e�X�g��";
		mes "��l�Ŏ󂯂邾���B�I���肾����";
		mes "�Q�Ă邱�Ƃ͂Ȃ���B";
		next;
		mes "[�W�X�N���G]";
		mes "�������ǂ����́A�S�z���Ă�";
		mes "�n�܂�Ȃ����B";
		mes "���͉��������w��";
		mes "�ˏ��Ȃ񂾂���B�t�t�B";
		next;
		emotion 29;
		mes "[�W�X�N���G]";
		mes "���������̂��āA�����Ȏ����ǂ����Ă�";
		mes "�L���ɂȂ��Ă��܂��񂾂��ǁA������A";
		mes "�����o�J�ɂ����㉿��B�I�z�z�z�z�B";
		next;
		mes "[�W�X�N���G]";
		mes "����A���肢�B";
		mes "�A�����H";
		set SIGN_QUE,21;
		close;
	case 21:
	case 22:
		mes "[�W�X�N���G]";
		mes "�]�������Ă�]�T�������āH";
		mes "�����A�n�߂܂��傤���I";
		close;
	case 23:
		mes "[�W�X�N���G]";
		mes "�ӁA�ӂӂӁc�c";
		mes "���̏�����!!";
		next;
		emotion 6;
		mes "[�W�X�N���G]";
		mes "�l���t��������ň��̕��@�ŁA";
		mes "���Ȃ��ɒp���������Ă�肽������";
		mes "���͗L�\�ŗ����I�Ȓm���l�B";
		next;
		mes "[�W�X�N���G]";
		mes "�܁A������Ƃ�������Ă����c�c";
		next;
		mes "[�W�X�N���G]";
		mes "�Ƃɂ����I";
		mes "���̐S�����������Ƃ�";
		mes "�Y��Ă������B";
		next;
		mes "[�W�X�N���G]";
		mes "�ł��A���㎄�̋߂��Ɍ���ꂽ��A";
		mes "�i�p�[���o���J���ŉ����܂�";
		mes "��΂��Ă��������Ă�B";
		next;
		emotion 29;
		mes "[�W�X�N���G]";
		mes "���Ⴀ�A���������Ă����H";
		next;
		if(select("���̂܂ܑނ����Ƃ͂ł��܂���I","���́A�����A���́c�c")==2) {
			mes "[�W�X�N���G]";
			mes "��H�@�܂���!!";
			mes "�����������������Ƃ�";
			mes "����Ȃ����ˁH";
			mes "������A�ǂ����������߂Ă���";
			mes "�����Ȃ����I";
			close;
		}
		mes "[�W�X�N���G]";
		mes "���[�A�����I";
		mes "�{���ɔ���l�ˁc�c";
		next;
		mes "[�W�X�N���G]";
		mes "�t���A�܂�������B";
		mes "�������z�ł����̂ˁB";
		mes "���x�����͏���!!";
		set SIGN_QUE,22;
		close;
	case 24:
		mes "[�W�X�N���G]";
		mes "�����A�����I";
		mes "�܂���������!!";
		next;
		mes "[�W�X�N���G]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�ӂӁc�c�c�c�c�c�c�c";
		mes "������A���̕�����B";
		mes "���A�܂��܂��C�s�s���Ȃ̂ˁB";
		next;
		mes "[�W�X�N���G]";
		mes "������B�F�߂܂��B";
		mes "�����A����Ȃ��Ƃ�����Ȃ��ق�";
		mes "�킩�炸������Ȃ����B";
		mes "������������Ă������āA�F�߂��B";
		next;
		mes "[�W�X�N���G]";
		mes "�ӂӂ��A����������ƈ����";
		mes "�܂��O�݂����ɗ��ɏo�悤������B";
		next;
		mes "[�W�X�N���G]";
		mes "���A�Ƃ���ł��Ȃ��B���O�́H";
		mes "����|�������肾���́B";
		mes "���O�A�m�肽����B";
		next;
		input 'name$;
		mes "[�W�X�N���G]";
		mes "�ց`�A";
		mes 'name$+ "�ˁc�c";
		mes "�i���ɖY��Ȃ���A���̖��O�B";
		next;
		set SIGN_QUE,25;
		getitem 7177,1;
		mes "[�W�X�N���G]";
		mes "����̓v���[���g��B";
		mes "���̗F�B�A���b�c���K���Ȑl��";
		mes "�n���΂������Ă��ꂽ�񂾂��ǁB";
		mes "���������Ă���肾�������ǁA";
		mes "���Ȃ��̂ق������������悤��";
		mes "�C�������B";
		next;
		mes "[�W�X�N���G]";
		mes "����ɂ��ċ�������Ȃ�A";
		mes "^3131CE�f�B�A���[�X^000000��";
		mes "�K�˂Ȃ����B";
		next;
		mes "[�W�X�N���G]";
		mes "�q�������D���ŁA���Ɠ�����";
		mes "�ꃖ���ɗ��������Ȃ��l������c�c";
		mes "���A�ǂ��ɂ��邩�m��Ȃ���B";
		next;
		mes "[�W�X�N���G]";
		mes "��͎����ŒT���Ă݂āB";
		mes "���͈�t����ŁA���̂ق�ꂢ�C������";
		mes "�a�炰��Ƃ��邩��B";
		mes "����A�o�C�o�C�B";
		close;
	case 25:
		set '@rand,rand(3);
		mes "[�W�X�N���G]";
		mes "�������c�c�����c�c";
		mes "�����A" +('name$ != ""? 'name$: "�G���Q���E�n���[�h")+ "�ˁB";
		mes "�f�B�A���[�X�͌��������H";
		next;
		mes "[�W�X�N���G]";
		mes "�ނ́A�q�������O�x�̂��т��";
		mes "�D��������A���������ꏊ�ɍs����";
		mes "��邩���ˁB";
		close;
	default:
		mes "[�W�X�N���G]";
		mes "���`�A�q�b�N�c�c";
		mes "���݉߂���������H";
		close;
	}
}

geffen_in.gat,61,72,7	script	�A����	754,{
	switch(SIGN_QUE) {
	case 21:
		emotion 9;
		mes "[�A����]";
		mes "�c�c�c�c�c�c�c�c";
		next;
		emotion 9;
		mes "[�A����]";
		mes "�c�cz�c�cZ�c�c";
		next;
		emotion 6,"�W�X�N���G#sign";
		mes "[�W�X�N���G]";
		mes "�A����!!";
		next;
		emotion 23;
		mes "[�A����]";
		mes "�͂�!!";
		mes "�������Q���Ă܂������c�c";
		mes "�����Ɏキ�āA�͂́B";
		next;
		emotion 19;
		mes "[�A����]";
		mes "���݂܂���B";
		mes "���ق�A����ł͎����ٔ��c�c";
		mes "����Ȃ��āA�����o�茓�ē���";
		mes "���߂�Ηǂ��̂ł��ˁH";
		mes "�����`�A���������݂ɂ����̂Ɂc�c";
		next;
		mes "[�A����]";
		mes "����ł́A�������Ɓc�c";
		mes "�}�ɗ��ނ񂾂���c�c";
		mes "�d���Ȃ��A���̑O�A�w���B�ɏo����";
		mes "�����c�c";
		set SIGN_QUE,22;
		close;
	case 22:
		break;
	default:
		emotion 23;
		mes "[�A����]";
		mes "���������������[!!";
		mes "�������A���ƈꏏ�Ƀv�����e���吹����";
		mes "�s���܂��傤!!!";
		mes "�������܂��傤!!!";
		next;
		emotion 21;
		mes "[�A����]";
		mes "���̊�I�@���̋r����!!";
		mes "���ׂĂ����̍D�݂ł�!!!!";
		mes "���ƌ������āA���̐��Ɉ���";
		mes "�U��T���܂��傤!!";
		next;
		emotion 14;
		mes "[�A����]";
		mes "���������ƋM�����K���Ɂc�c";
		mes "���c�c";
		mes "�q�b�N�I�@�����̂��ꂢ�Ȃ��o����!!";
		mes "���ƌ������܂��傤!!!";
		next;
		mes "-�₽������-";
		next;
		emotion 28;
		mes "[�A����]";
		mes "�c�c�c�c";
		close;
	}
	//22�̑���
	emotion 0;
	mes "[�A����]";
	mes "�ł͎n�߂܂��B";
	mes "����10��ł��B";
	next;
	while(1) {
		switch('@c) {
		case 0:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "1�z�u���b�N�X�~�X�]�E��";
				mes "�֌W�Ȃ��l�́H";
				next;
				if(select("�o�C�X","�q���b�P","�o���J�f�[","�O����")==3)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "1�z���a�܂���鎞�A�K�v�̂Ȃ�";
				mes "�ޗ��́H";
				next;
				if(select("�J���{�[�f�B��","�f�B�g���~��","�A���R�[��")==1)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "1�z���̒��ő傫���̈Ⴄ";
				mes "�����X�^�[�́H";
				next;
				if(select("����E�B�X�p�[","�}�[����","�J�i�g�E�X","�R�{���h�A�[�`���[")==2)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 1:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "2�z�v���[�X�g�̃X�L���A���̍~����";
				mes "�֘A����X�L���́H";
				next;
				if(select("���b�N�X�f�B�r�[�i","�O�����A","���J�o���[","�T���N�`���A��")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "2�z�z���C�g�X�����|�[�V������";
				mes "���̂ɕK�v�̂Ȃ��ޗ��́H";
				next;
				if(select("����","�����̐��̕�","��̎�����","��̃|�[�V�����r")==4)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "2�z�u���b�N�X�~�X���O���f�B�E�X��";
				mes "���̂ɕK�v�ȍޗ��́H";
				next;
				if(select("�T�t�@�C�A","�W���R��","�g�p�[�Y","���ꂽ���r�[")==1)
					set '@m,'@m+1;
				break;
			}
			set '@r,7;
			break;
		case 2:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "3�z�{���g�n���@�̑����̒��ŁA";
				mes "�}�W�V�������K���ł��Ȃ�";
				mes "�����͉����H";
				next;
				if(select("��","�n","��","��")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "3�z�E�T�M�̃w�A�o���h��";
				mes "�h��͂Ɣ\�͒l�́H";
				next;
				if(select("1/LUK+2","1/LUK+5","2/LUK+2","2/LUK+5")==3)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "3�z���̒��ŁA�J�[�h�̑����㖼�̂�";
				mes "�Ԉ���Ă���̂́H";
				next;
				if(select("�z�[�l�b�g�J�[�h���}�[�^�[","���N�C�G���J�[�h���J�I�X","���[���e�[���J�[�h���N���o�[","�S�[�����J�[�h���C���[�^��")==4)
					set '@m,'@m+1;
				break;
			}
			set '@r,7;
			break;
		case 3:
			mes "[�A����]";
			mes "�ł͎��̖��ł��B";
			next;
			switch(rand(2)) {
			case 0:
				mes "[�A����]";
				mes "4�z�~�b�h�K�b�c�����A";
				mes "�����̖��O�́H";
				next;
				if(select("�g���X�g��3��","�g���X�^��3��","�g���C�X�^�[3��","�g���X�g3��")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "4�z���̒��ŁA�푰���Ⴄ";
				mes "�����X�^�[�́H";
				next;
				if(select("�y�m���i","�n�e�B�[","�y�X�g","�G�N�X�v���[�W����")==1)
					set '@m,'@m+1;
				break;
			}
			set '@r,7;
			break;
		case 4:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "5�z���̒��ŁA�C�O�h���V���̗t��";
				mes "�h���b�v���Ȃ������X�^�[�́H";
				next;
				if(select("�}���h�D�[�N","�o�t�H���b�gJr.","�G���W�F�����O","�f�r����")==1)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "5�z�V���N���[�u�𒅂邱�Ƃ�";
				mes "�ł��Ȃ��E�Ƃ́H";
				next;
				if(select("�\�[�h�}��","�}�[�`�����g","�n���^�[","�}�W�V����")==3)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "5�zPVP���ɓ���ł���悤�ɂȂ�";
				mes "���x���́H";
				next;
				if(select("30","31","32","33")==2)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 5:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "6�z�󂫃r���̏d�ʂ́H";
				next;
				if(select("1","2","3")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "6�z�C���f�B�A���̃w�A�o���h��";
				mes "�h��l�́H";
				next;
				if(select("0","1","2","3")==4)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "6�z�^�[�g���A�C�����h��";
				mes "��ԋ߂��s�s�́H";
				next;
				if(select("�A���f�o����","�A���x���^","�R���h","�C�Y���[�h")==2)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 6:
			switch(rand(3)) {
			case 0:
				mes "[�A����]";
				mes "7�z(((51�~15)�^3)�{5)���H";
				next;
				if(select("250","255","260","265")==3)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "7�z(((4560�^4)�^2)�{3)���H";
				next;
				if(select("573","574","575","576")==1)
					set '@m,'@m+1;
				break;
			case 2:
				mes "[�A����]";
				mes "7�z(3102�{500�{4)�^6���H";
				next;
				if(select("600","601","602")==2)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 7:
			switch(rand(2)) {
			case 0:
				mes "[�A����]";
				mes "8�z�W���m�[�̐��B����";
				mes "��ԋ߂��̂́H";
				next;
				if(select("�Z�[�W�L���b�X��","�����X�^�[������","����X","����h��X")==4)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "8�z���̃n���^�[�̃g���b�v�X�L����";
				mes "�_���[�W��^���Ȃ����̂́H";
				next;
				if(select("�N���C���A�g���b�v","�t���[�W���O�g���b�v","�V���b�N�E�F�[�u�g���b�v","�����h�}�C��")==3)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 8:
			switch(rand(2)) {
			case 0:
				mes "[�A����]";
				mes "9�z�Α����̕��킪��ԗL����";
				mes "�����X�^�[�́H";
				next;
				if(select("�S�u�������j","�S�u�������j","�S�u�����O�j","�S�u�����l�j")==4)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "9�z�X�g�[���J�[�X���ʂ��Ȃ�";
				mes "�����X�^�[�́H";
				next;
				if(select("�G���_�[�E�B���[","�C�r���h���C�h","���@��","�}���N")==2)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 9:
			switch(rand(2)) {
			case 0:
				mes "[�A����]";
				mes "10�z���̒��œ����O������Ȃ��̂́H";
				next;
				if(select("�v�����e���̃z���O����","�v�����e���̐l�`���l","�C�Y���[�h�̓����l","�����N�̓����l")==3)
					set '@m,'@m+1;
				break;
			case 1:
				mes "[�A����]";
				mes "10�z���̒��Ńm�[�r�X��";
				mes "�����ł��Ȃ��̂́H";
				next;
				if(select("�����p�̖X�q","����","�E�h�D�����C��","�u���[�t")==3)
					set '@m,'@m+1;
				break;
			}
			set '@r,8;
			break;
		case 10:
			mes "[�A����]";
			mes "�͂��A�����܂ŁB";
			mes "�e�X�g���ʂ����܂��傤�B";
			next;
			mes "[�A����]";
			mes strcharinfo(0)+ "�����";
			mes "���т́c�c";
			mes '@m+ "�_�ł��ˁB";
			next;
			mes "[�A����]";
			mes "�����āA�W�X�N���G�̐��т�";
			mes '@e+ "�_�ł��B";
			next;
			if('@m > '@e) {
				set SIGN_QUE,24;
				mes "[�W�X�N���G]";
				mes "�܁A�܂����c�c";
			}
			if('@m < '@e) {
				set SIGN_QUE,23;
				emotion 29,"�W�X�N���G#sign";
				mes "[�W�X�N���G]";
				mes "�ققفA����ς�I";
				mes "�J�߂ĖJ�߂�!!!";
				mes "�I�z�z�z�z!!";
			}
			if('@m == '@e) {
				set SIGN_QUE,24;
				mes "[�W�X�N���G]";
				mes "�N�b�A�v����������ˁc�c";
			}
			next;
			mes "[�A����]";
			mes "����ł�낵���ł����H";
			mes "���[��A����������ƈ��݂�������";
			mes "���ǁc�c�B���Ƃ͂���l�Řb��������";
			mes "���������ˁB";
			close;
		}
		if(rand(10) < '@r) {
			emotion 2,"�W�X�N���G#sign";
			mes "[�W�X�N���G]";
			mes "�ӂӁA�ȒP�ˁB";
			set '@e,'@e+1;
		}
		else {
			emotion 23,"�W�X�N���G#sign";
			mes "[�W�X�N���G]";
			mes "�N�b�A���̎�������ȃ~�X��";
			mes "����Ȃ�āc�c";
		}
		if('@c >= 2) {
			next;
			mes "[�W�X�N���G]";
			mes "�����ƁA���܂̂Ƃ���_���́c�c";
			next;
			if('@m > '@e) {
				mes "[�W�X�N���G]";
				mes "�n�b!!�@���̂܂܂��ᕉ�����Ⴄ�I";
				mes "������!!";
			}
			if('@m < '@e) {
				mes "[�W�X�N���G]";
				mes "�ӂӁA������ۂ����H";
				mes "����������Ɣ]�݂���";
				mes "�]�����Ă݂���ǂ��H";
			}
			if('@m == '@e) {
				mes "[�W�X�N���G]";
				mes "����A�v����������ˁB";
				mes "���f�Ȃ�Ȃ���B";
			}
		}
		set '@c,'@c+1;
		next;
		continue;
	}
}

//==============================================================
// ��1�� - �f�B�A���[�X�̎���
//==============================================================
cmd_in02.gat,88,51,4	script	�ςȒj	806,{
	if(SIGN_QUE < 25) {
		mes "[�f�B�A���[�X]";
		mes "�����[�A�܂��O�������c�c";
		mes "�������c�c";
		mes "����H�@�Ȃ񂾂��O�H";
		next;
		if(Zeny < 10000) {
			emotion 32;
			mes "[�f�B�A���[�X]";
			mes "���A�������Ă�悤���ȁB";
			mes "���A��H����˂���B";
			mes "�W���W�����Ă񂶂�˂��I";
			mes "�ꔭ�H�炢�Ă��̂�?!";
			percentheal -10,0;
			close;
		}
		misceffect 10;
		mes "[�f�B�A���[�X]";
		mes "���A�������Ă�悤���ȁB";
		mes "�t�b";
		mes "������Ƃ΂����؂���B";
		mes "�N�N�N�c�c";
		set Zeny,Zeny-10000;
		close;
	}
	switch(SIGN_QUE) {
	case 25:
		mes "[�f�B�A���[�X]";
		mes "���A�����I";
		mes "�܂��O���₪����";
		mes "�ӂ��c�c";
		next;
		if(select("���́c�c","���Ă��Ȃ��ӂ�����Ēʂ�߂���")==2) {
			mes "[�f�B�A���[�X]";
			mes "���[�A�������z���󂾂ȁc�c";
			close;
		}
		mes "[�f�B�A���[�X]";
		mes "�����H";
		mes "���͍��A�C���C�����Ă񂾁B";
		mes "��₩���Ȃ�A�o�債���A";
		mes "�Ă߂��I";
		next;
		if(select("���A���߂�Ȃ���","���b�c����̏Љ�ŗ��܂���")==1) {
			mes "[�f�B�A���[�X]";
			mes "�����ƁI�@���̉������炩���Ƃ�";
			mes "�����x������˂����I";
			mes "�o�債�ȁc�c�N�N�c�c";
			close2;
			heal -(Hp-1),0;
			soundeffect "sign_noise.wav",0;
			warp "comodo.gat",122,100;
			end;
		}
		mes "[�f�B�A���[�X]";
		mes "�������A�Ȃ񂾁B";
		mes "���b�c�������������E���B";
		mes "���Ă��Ƃ́A���ꂾ��A����B";
		mes "�N�N�c�c";
		next;
		mes "[�f�B�A���[�X]";
		mes "���̃e�X�g���󂯂���������A";
		mes "30,000zeny�����Ă��ȁB";
		mes "�т��ꕶ�܂��˂����B";
		set SIGN_QUE,26;
		close;
	case 26:
		mes "[�f�B�A���[�X]";
		mes "���͎����Ă������H";
		mes "�N�N�c�c";
		next;
		if(select("�����Ă��܂���","�܂��ł�")==2) {
			mes "[�f�B�A���[�X]";
			mes "��������!?";
			mes "�N�N�c�c���������ق����������B";
			mes "���̋C�����ς��Ȃ������ɂ�c�c";
			mes "�N�N�c�c";
			close;
		}
		mes "[�f�B�A���[�X]";
		mes "�ق��c�c�H";
		if(Zeny < 30000) {
			mes "���c�c�H";
			mes "�Ă߂��������炩���Ă�̂��H";
			mes "�o�����₪��I";
			close;
		}
		set Zeny,Zeny-30000;
		mes "�N�N�c�c";
		mes "�悵�A�܂������̗[���ɗ����B";
		set SIGN_QUE,27;
		close;
	case 27:
		if(gettime(3) < 18 || gettime(3) >= 23) {
			mes "[�f�B�A���[�X]";
			mes "�[���ɗ������Č���������B";
			mes "�Ă߂��͎��Ԃ��킩��˂��̂��H";
			close;
		}
		mes "[�f�B�A���[�X]";
		mes "�����A���ԃs�b�^�����ȁB";
		mes "����܂莞�Ԃɂ��邳�������E��";
		mes "�D������˂����B";
		next;
		mes "[�f�B�A���[�X]";
		mes "�񑩂͖񑩂��B�e�X�g�����Ă�����B";
		mes "���������āA���ڂ�񂶂�˂����B";
		mes "�N�N�c�c";
		set SIGN_QUE,28;
		close;
	case 28:
		mes "[�f�B�A���[�X]";
		mes "�悵�A�e�X�g����1���B";
		mes "���D�݂�";
		mes "^FF0000�H�|�i���ł��邾���W�߂ė���^000000�B";
		mes "�Ӓ����Ă�����Ă��B";
		next;
		mes "[�f�B�A���[�X]";
		mes "������x�̂��̂���Ȃ����";
		mes "���i����˂��B�킩�����ȁB";
		mes "�N�N�c�c";
		set SIGN_QUE,29;
		close;
	case 29:
		mes "[�f�B�A���[�X]";
		mes "�����Ă������H";
		mes "�ǂ�A�����Ă݂�B";
		next;
		if(countitem(734)) set '@point,'@point+1; //�Ԃ��z��
		if(countitem(735)) set '@point,'@point+1; //��������
		if(countitem(736)) set '@point,'@point+1; //�����M
		if(countitem(7149)) set '@point,'@point+1; //���F���M
		if(countitem(747)) set '@point,'@point+2; //������
		if(countitem(749)) set '@point,'@point+4; //�X�o��
		if(countitem(740)) set '@point,'@point+1; //�ʂ������
		if(countitem(741)) set '@point,'@point+1; //�|�����l�`
		if(countitem(742)) set '@point,'@point+2; //�`�����`�����l�`
		if(countitem(743)) set '@point,'@point+3; //�X�|�A�l�`
		if(countitem(752)) set '@point,'@point+3; //�o�b�^�l�`
		if(countitem(753)) set '@point,'@point+4; //�T���l�`
		if(countitem(754)) set '@point,'@point+4; //�^�k�L�l�`
		if(countitem(750)) set '@point,'@point+7; //�o�t�H���b�g�l�`
		if(countitem(751)) set '@point,'@point+7; //�I�V���X�l�`
		if('@point == 0) {
			mes "[�f�B�A���[�X]";
			mes "�c�c";
			mes "�����B�����Ȃ�����˂����B";
			mes "�������𖞑�������i�������ė����B";
			mes "�ӂ���ȁI";
			close;
		}
		if('@point <= 10) {
			mes "[�f�B�A���[�X]";
			mes "���`��c�c";
			mes "������Ƒ���˂��ȁB";
			mes "���̒��x����A���͖������Ȃ����B";
			close;
		}
		mes "[�f�B�A���[�X]";
		mes "�ق��A�����˂��ȁB";
		mes "����́A�ف`�c�c";
		next;
		mes "[�f�B�A���[�X]";
		mes "�悵�悵�A�������낤�B";
		mes "���Ⴀ���̃e�X�g�����鎎�����";
		mes "�����Ă��B";
		next;
		mes "[�f�B�A���[�X]";
		mes "�������ɁA���f�B�}�����ēz������B";
		mes "�ڂ����͓z�ɕ����ȁB";
		delitem 734,1;
		delitem 735,1;
		delitem 736,1;
		delitem 7149,1;
		delitem 747,1;
		delitem 749,1;
		delitem 740,1;
		delitem 741,1;
		delitem 742,1;
		delitem 743,1;
		delitem 752,1;
		delitem 753,1;
		delitem 754,1;
		delitem 750,1;
		delitem 751,1;
		set SIGN_QUE,30;
		if(checkre()) {
			if(BaseLevel >= 90) getexp 1300,0;
			else if(BaseLevel >= 80) getexp 1000,0;
			else if(BaseLevel >= 70) getexp 800,0;
			else if(BaseLevel >= 60) getexp 500,0;
			else getexp 300,0;
		}
		else {
			if(BaseLevel >= 90) getexp 13000,0;
			else if(BaseLevel >= 80) getexp 10000,0;
			else if(BaseLevel >= 70) getexp 8000,0;
			else if(BaseLevel >= 60) getexp 5000,0;
			else getexp 3000,0;
		}
		close2;
		warp "cmd_in01.gat",33,29;
		end;
	case 30:
	case 31:
		mes "[�f�B�A���[�X]";
		mes "�Ȃ񂾂Ă߂��c�c";
		mes "�܂��e�X�g�Ɏ󂩂��ĂȂ��̂��B";
		mes "�܂��������ɑ����Ă�邩��A";
		mes "���������撣��ȁc�c�N�N�c�c";
		close2;
		warp "cmd_in01.gat",33,29;
		end;
	case 32:
		mes "[�f�B�A���[�X]";
		mes "�s���i���B";
		mes "�܁A���߂�̂��l�����ĂȁB";
		mes "�ǂ�����H";
		next;
		if(select("����1��","�܂����")==2) {
			mes "[�f�B�A���[�X]";
			mes "�N�N�c�c�����������ʂȗ��K�ł�";
			mes "���ė���񂾂ȁB";
			close;
		}
		mes "[�f�B�A���[�X]";
		mes "�N�N�c�c���������撣��ȁc�c";
		mes "���̒��x���ፇ�i�͉����񂶂�˂��H";
		mes "�N�N�N�c�c";
		close2;
		warp "cmd_in01.gat",33,29;
		end;
	case 33:
		mes "[�f�B�A���[�X]";
		mes "�ꉞ���i���Ă��B";
		mes "���I�ɂ́A�܂��܂��Ȃ񂾂��A";
		mes "�񑩂�����A�p�X���Ă��Ƃɂ��Ă��B";
		next;
		mes "[�f�B�A���[�X]";
		mes "��������ȁc�c";
		mes "�A���x���^�̃x�[�J�[���ēz��";
		mes "�K�˂�B";
		set SIGN_QUE,35;
		getitem 7177,1;
		if(checkre()) {
			if(BaseLevel >= 90) getexp 1700,0;
			else if(BaseLevel >= 80) getexp 1200,0;
			else if(BaseLevel >= 70) getexp 900,0;
			else if(BaseLevel >= 60) getexp 700,0;
			else getexp 300,0;
		}
		else {
			if(BaseLevel >= 90) getexp 17000,0;
			else if(BaseLevel >= 80) getexp 12000,0;
			else if(BaseLevel >= 70) getexp 9000,0;
			else if(BaseLevel >= 60) getexp 7000,0;
			else getexp 3000,0;
		}
		next;
		mes "[�f�B�A���[�X]";
		mes "���̖��͂����܂ł��B";
		mes "��x�Ɨ���Ȃ�B";
		close;
	case 34:
		mes "[�f�B�A���[�X]";
		mes "�ӂ�A�v���Ă�����肩��������";
		mes "�˂����B";
		next;
		mes "[�f�B�A���[�X]";
		mes "���ꂶ�႟�ȁc�c";
		mes "�A���x���^�̃x�[�J�[���ēz��";
		mes "�K�˂�B";
		set SIGN_QUE,35;
		getitem 7177,1;
		set Zeny,Zeny+20000;
		if(checkre()) {
			if(BaseLevel >= 90) getexp 1900,0;
			else if(BaseLevel >= 80) getexp 1400,0;
			else if(BaseLevel >= 70) getexp 1000,0;
			else if(BaseLevel >= 60) getexp 700,0;
			else getexp 300,0;
		}
		else {
			if(BaseLevel >= 90) getexp 19000,0;
			else if(BaseLevel >= 80) getexp 14000,0;
			else if(BaseLevel >= 70) getexp 10000,0;
			else if(BaseLevel >= 60) getexp 7000,0;
			else getexp 3000,0;
		}
		next;
		mes "[�f�B�A���[�X]";
		mes "����́A�M�l���ŏ��Ɏ����Ă�������";
		mes "�҂��������B�����Ă����B";
		mes "�c�c";
		mes "���̖��͂����܂ł��B";
		mes "��x�Ɨ���Ȃ�B";
		close;
	default:
		emotion 29;
		mes "[�f�B�A���[�X]";
		mes "���������A��x�Ɨ���Ȃ���";
		mes "��������ȁB";
		next;
		if(select("���悤�Ȃ�","�܂��e�X�g���󂯂����ł�")==1) {
			emotion 32;
			mes "[�f�B�A���[�X]";
			mes "�p���Ȃ�����񂶂�˂���B";
			mes "�Ƃ��ƂƎ����ȁB";
			close;
		}
		emotion 29;
		mes "[�f�B�A���[�X]";
		mes "���D�����ȁc�c";
		mes "�͂��͂��A�����Ă���B";
		next;
		warp "cmd_in01.gat",33,29;
		end;
	}
}

cmd_in01.gat,33,25,5	script	������	724,{
	switch(SIGN_QUE) {
	case 30:
	case 31:
		mes "[���}�f�B��]";
		mes "������̃`���b�g���[�����T����";
		mes "�Ȃ��Ă���܂��B�T���ł��҂�";
		mes "���������`�B�`���b�g���[����";
		mes "�N���b�N���邱�ƂŁA�T���ɓ��邱�Ƃ�";
		mes "�ł��܂��B�e�X�g�̓��e��";
		mes "���Y������������̂ł��B";
		next;
		mes "[���}�f�B��]";
		mes "���ԂɂȂ�Ɠ��݃��[���Ɉړ����܂��B";
		mes "���Ɂu�~�v�^�̃p�l��������܂��B";
		mes "����[|�_]�A�E��[�^|]�A";
		mes "����[|�^]�A�E��[�_|]�̎l�ӏ���";
		mes "����鉹�y�ɂ��킹�ē���ł��������B";
		next;
		mes "[���}�f�B��]";
		mes "���y�̎w���ʂ�Ƀp�l���𓥂ނƓ_��";
		mes "���Z����܂��B�����Ɖ��y�ɂ��킹��";
		mes "���܂Ȃ��Ƒʖڂł���`�B";
		next;
		mes "[���}�f�B��]";
		mes "���y���I�������A�������v�_��";
		mes "�v�Z���܂��B�_���ɂ���āA";
		mes "���i�E�s���i������܂�����";
		mes "�C�����Ă��������ˁB";
		next;
		mes "[���}�f�B��]";
		mes "�e�X�g���I���܂�����A���̂��Ƃ�";
		mes "�_���m�F�ɂ��炵�Ă��������B";
		mes "�ł́A�撣���Ă��������`�B";
		close;
	case 32:
		mes "[���}�f�B��]";
		mes "�͂��A";
		mes strcharinfo(0)+ "�l�ł��ˁB";
		mes "�����Ɓc�c";
		next;
		mes "[���}�f�B��]";
		mes "���炠��B�s���i�ł��`�B";
		mes "�����ƍ��i�_������Ȃ����";
		mes "�ʖڂł��B";
		next;
		mes "[���}�f�B��]";
		mes "�܂��Ē��킵�Ă��������܂��B";
		mes "���肪�Ƃ��������܂����`�B";
		set SIGN_QUE,30;
		close;
	case 33:
		mes "[���}�f�B��]";
		mes "�͂��A";
		mes strcharinfo(0)+ "�l�ł��ˁB";
		mes "�����Ɓc�c";
		next;
		mes "[���}�f�B��]";
		mes "���߂łƂ��������܂��I�@���i�ł��I";
		mes "�f�B�A���[�X����ɂ́A�A������";
		mes "�����܂��ˁB�ł́A�ނ̂ق���";
		mes "���K�˂��������B";
		mes "����ꂳ�܂ł����`�I";
		close;
	case 34:
		mes "[���}�f�B��]";
		mes "�͂��A";
		mes strcharinfo(0)+ "�l�ł��ˁB";
		mes "�����Ɓc�c";
		next;
		mes "[���}�f�B��]";
		mes "�������`�`�`�`�`!!";
		mes "���߂łƂ��������܂�!!!!";
		mes "���_�ł�!!!!";
		mes "����ł́A�f�B�A���[�X�����";
		mes "�A�����܂��ˁB";
		next;
		mes "[���}�f�B��]";
		mes "����ȗǂ��_���ł����́B";
		mes "�f�B�A���[�X���񂪂��j�����Ă�����";
		mes "�����ł��ˁB";
		mes "�ł́A����ꂳ�܂ł����`�I";
		close;
	default:
		mes "[���}�f�B��]";
		mes "�Ȃɂ����p�ł����H";
		mes "�����̓f�B�A���[�X�l�̎��L�n�ł��B";
		mes "�ނ�݂ɓ����Ă��Ȃ��ŉ������B";
		next;
		warp "comodo.gat",187,164;
		end;
	}
}

cmd_in01.gat,33,33,1	script	�T��#sign	66,{
	end;
OnInit:
	waitingroom "DANCE�@DANCE!!",20,"�T��#sign::OnStart",1;
	end;
OnStart:
	disablewaitingroomevent;
	getwaitingpcid '@accid;
	if(attachrid('@accid)) {
		set getvariableofnpc('charid,"SignDance"),getcharid(3);
		hideonnpc "SignDanceStep#1";
		hideonnpc "SignDanceStep#2";
		hideonnpc "SignDanceStep#3";
		hideonnpc "SignDanceStep#4";
		hideonnpc "SignDanceStep#5";
		donpcevent "SignDance::OnStart";
		set @sign_dance,0;
		warp "cmd_in01.gat",16,15;
	}
	else
		enablewaitingroomevent;
	end;
}

cmd_in01.gat,0,0,0	script	SignDance	-1,{
	function StepReset {
		for(set '@i,1; '@i <= 5; set '@i,'@i+1) {
			if('@i != getarg(0))
				hideonnpc "SignDanceStep#" +'@i;
		}
		if(getarg(0))	//0�ȊO�͎w��^�C���o��
			hideoffnpc "SignDanceStep#" +getarg(0);
		return;
	}
	end;
OnStart:
	initnpctimer;
	end;
OnTimer2000:
	announce "�ł̓e�X�g���n�߂܂��B�撣���āI",9;
	end;
OnTimer4000:
	announce " ����`�� : |�_",9;
	set 'count,1;
	StepReset 4;
	end;
OnTimer6000:
	announce " �E���`�� : �_|",9;
	set 'count,2;
	StepReset 2;
	end;
OnTimer8000:
	announce " ��������E��ց`�� : |�^�@�^|",9;
	set 'count,3;
	StepReset 5;
	end;
OnTimer11000:
	announce " ���̂܂܉��ց`�� : �_|",9;
	set 'count,5;
	StepReset 2;
	end;
OnTimer13000:
	announce " �����A�E��A����A�^�񒆂ŃN�������� : |�^�@�^|�@|�_�@��",9;
	set 'count,6;
	StepReset 5;
	end;
OnTimer18000:
	announce " �����A�E���A�܂������`�� : |�^�@�_|�@|�^",9;
	set 'count,10;
	StepReset 5;
	end;
OnTimer21000:
	announce " �E���A�����A�E���`�� : �_|�@���@�_|",9;
	set 'count,13;
	StepReset 2;
	end;
OnTimer24000:
	announce " �����A����A�E��A�E���A�^�񒆁`�� : |�^�@|�_�@�^|�@�_|�@��",9;
	set 'count,16;
	StepReset 5;
	end;
OnTimer30000:
	announce " �����A�E��A����A�E���`�� : |�^�@�^|�@|�_�@�_|",9;
	set 'count,21;
	StepReset 5;
	end;
OnTimer34000:
	announce " �E��A�E���A�͂����s�[�g�`�� : �^|�@�_|�@�^|�@�_|",9;
	set 'count,25;
	StepReset 3;
	end;
OnTimer38000:
	announce " ����A�E��A�^�񒆁A�E��A�����A�E���Ō��߁� : |�_�@�^|�@���@�^|�@|�^�@�_|",9;
	set 'count,29;
	StepReset 4;
	end;
OnTimer44000:
	StepReset 0;
	announce "����ꂳ�܂ł����`��",9;
	end;
OnTimer46000:
	stopnpctimer;
	if(attachrid('charid)) {
		if(SIGN_QUE == 30) {
			if(@sign_dance < 30)
				set SIGN_QUE,32;
			else if(@sign_dance < 34)
				set SIGN_QUE,33;
			else
				set SIGN_QUE,34;
		}
		set @sign_dance,0;
	}
	areawarp "cmd_in01.gat",12,12,20,20,"cmd_in01.gat",29,33;
	set 'charid,0;
	set 'count,0;
	hideoffnpc "SignDanceStep#1";
	hideoffnpc "SignDanceStep#2";
	hideoffnpc "SignDanceStep#3";
	hideoffnpc "SignDanceStep#4";
	hideoffnpc "SignDanceStep#5";
	enablewaitingroomevent "�T��#sign";
	end;
}

cmd_in01.gat,16,16,0	script	SignDanceStep#1	139,1,1,{
	end;
OnTouch:
	if(getvariableofnpc('charid,"SignDance") != getcharid(3)) {
		warp "cmd_in01.gat",29,33;
		end;
	}
	set '@num,strnpcinfo(2);
	switch('@num) {
		case 1: soundeffect "effect\\sign_center.wav",0; break;
		case 2: soundeffect "effect\\sign_down.wav",0; break;
		case 3: soundeffect "effect\\sign_right.wav",0; break;
		case 4: soundeffect "effect\\sign_up.wav",0; break;
		case 5: soundeffect "effect\\sign_left.wav",0; break;
	}
	set @sign_dance,@sign_dance+1;
	hideonnpc;
	switch(getvariableofnpc('count,"SignDance")) {
	case 8:
	case 13:
	case 19:
	case 30:
		hideoffnpc "SignDanceStep#1";
		break;
	case 10:
	case 14:
	case 18:
	case 23:
	case 25:
	case 27:
	case 33:
		hideoffnpc "SignDanceStep#2";
		break;
	case 3:
	case 6:
	case 17:
	case 21:
	case 26:
	case 29:
	case 31:
		hideoffnpc "SignDanceStep#3";
		break;
	case 7:
	case 16:
	case 22:
		hideoffnpc "SignDanceStep#4";
		break;
	case 11:
	case 32:
		hideoffnpc "SignDanceStep#5";
		break;
	default:
		break;
	}
	set getvariableofnpc('count,"SignDance"),getvariableofnpc('count,"SignDance")+1;
	end;
}
cmd_in01.gat,16,11,0	duplicate(SignDanceStep#1)	SignDanceStep#2	139,1,3
cmd_in01.gat,21,16,0	duplicate(SignDanceStep#1)	SignDanceStep#3	139,3,1
cmd_in01.gat,16,21,0	duplicate(SignDanceStep#1)	SignDanceStep#4	139,1,3
cmd_in01.gat,11,16,0	duplicate(SignDanceStep#1)	SignDanceStep#5	139,3,1

//==============================================================
// ��1�� - �x�[�J�[�̎���
//==============================================================
alberta_in.gat,125,101,5	script	��������ȏ��l	807,{
	if(SIGN_QUE < 35) {
		mes "[�x�[�J�[]";
		mes "���[��A����������A�v�����e����";
		mes "����Ȋ����ŁA�W���m�[�́c�c";
		mes "������A�����ɂ��c�c";
		mes "�u�c�u�c�c�c";
		close;
	}
	switch(SIGN_QUE) {
	case 35:
		mes "[�x�[�J�[]";
		mes "���[��A�{���ɍ������ȁc�c";
		mes "����H�@�Ȃ񂾂��O�B";
		next;
		if(select("���A�Ȃ�ł��Ȃ��ł�","���b�c����̎��ŗ�����ł���")==1) {
			mes "[�x�[�J�[]";
			mes "���͖Z�����񂾁B";
			mes "�E�T���Ȃ�A�����ɑ��k���āB";
			close;
		}
		mes "[�x�[�J�[]";
		mes "�����A�����Ȃ̂��B";
		mes "���A�����΂���Z�����̂ŁA";
		mes "�܂���ŗ��Ă���邩���H";
		set SIGN_QUE,36;
		close;
	case 36:
		mes "[�x�[�J�[]";
		mes "�ӂނӂށA�������������B";
		mes "�f�B�A���[�X�̃e�X�g��";
		mes "�N���A�����񂾁B";
		mes "���̏؋��A�����Ă���邩���H";
		next;
		if(select("���X���҂���������","������c�c")==1) {
			mes "[�x�[�J�[]";
			mes "�����ˁB�l�͑��̐l�B�݂�����";
			mes "�ɂ���Ȃ��񂾁B";
			close;
		}
		mes "[�x�[�J�[]";
		mes "������Ɣq���c�c";
		next;
		mes "[�x�[�J�[]";
		mes "���A�҂����肾�B";
		mes "�����A���ꂶ�Ⴀ�ˁc�c";
		mes "���ꂩ��i������N�ɗa���邩��";
		mes "�����z�B���Ă��āB";
		next;
		mes "[�x�[�J�[]";
		mes "���Ȃ�M�d�ȕi��������A";
		mes "�C�����Ĉ����Ă�B";
		mes "���������肵����A�����͕s���i�B";
		mes "��蒼���͖���������ˁB";
		mes "�ڂ������Ƃ͎����ɕ����Ă���邩���B";
		set SIGN_QUE,37;
		close;
	case 37:
	case 38:
	case 39:
		mes "[�x�[�J�[]";
		mes "�����A���̎d���́A���̐l�Ɂc�c";
		mes "���[��c�c������Ɠ�����ȁc�c";
		mes "���A�d���ɂ��Ă͎����ɕ����āB";
		close;
	case 40:
		mes "[�x�[�J�[]";
		mes "�����A�z�B�͏I����������H";
		mes "������A�d��������񂾁B";
		mes "�܂������ɐ������Ă��邩��A";
		mes "���肢�ˁB";
		set SIGN_QUE,41;
		close;
	case 41:
	case 42:
	case 43:
	case 44:
	case 45:
	case 46:
	case 47:
	case 48:
	case 49:
	case 50:
	case 51:
		mes "[�x�[�J�[]";
		mes "�����󂯂��d�����I��点�Ă���";
		mes "���Ă���邩���B";
		mes "������ƍ��A�Z�����ĂˁB";
		close;
	case 52:
		mes "[�x�[�J�[]";
		mes "�����A��������I";
		mes "�A���͎󂯂Ă��B";
		mes "�����m�炸�̐l���A���ꂾ���e�g��";
		mes "��`����Ȃ�āA���b�c�ꂳ��̖ڂ�";
		mes "�ԈႢ�͂Ȃ��������Ď����ȁB";
		next;
		mes "[�x�[�J�[]";
		mes "�ł��邱�ƂȂ�A�l��������";
		mes "�󂯂����������炢�Ȃ񂾂��ǂˁB";
		mes "�ŋ߂̓A�}�c��R�������Ƃ̌��Ղ�";
		mes "�����ĂāA�ǂ����Ă������������āB";
		next;
		mes "[�x�[�J�[]";
		mes "�T�C�������A�A�}�c�ŉ���������";
		mes "�ق����q�łˁB�ޏ��̌Z���v�����e����";
		mes "�ق��Ă��炦�����Ƃ����A�l�̎���";
		mes "�悤�Ɋ��������āB";
		next;
		mes "[�x�[�J�[]";
		mes "�����A������ǂ����B";
		mes "�l���Ō�ł��B";
		mes "����������āA���b�c�ꂳ���";
		mes "�񍐂���Ƃ�����B����������";
		mes "���b�c�ꂳ��ƌN���悩�ȁB";
		set SIGN_QUE,53;
		getitem 7177,1;
		if(checkre()) {
			if(BaseLevel >= 90) getexp 2000,0;
			else if(BaseLevel >= 80) getexp 1500,0;
			else if(BaseLevel >= 70) getexp 1100,0;
			else if(BaseLevel >= 60) getexp 800,0;
			else getexp 500,0;
		}
		else {
			if(BaseLevel >= 90) getexp 20000,0;
			else if(BaseLevel >= 80) getexp 15000,0;
			else if(BaseLevel >= 70) getexp 11000,0;
			else if(BaseLevel >= 60) getexp 8000,0;
			else getexp 5000,0;
		}
		close;
	default:
		mes "[�x�[�J�[]";
		mes "�₟�A�ŋ߂ǂ��H";
		mes "�ł��邱�ƂȂ�A�l��������";
		mes "�󂯂����������炢�Ȃ񂾂��ǂˁB";
		mes "�l�����āA���ꂪ���������Ȃ�Ȃ̂�";
		mes "�m�肽�����I";
		close;
	}
}

alberta_in.gat,114,178,5	script	�ς���Ă��鎷��	109,{
	if(SIGN_QUE < 37) {
		mes "[�}�n�g]";
		mes "���b�n�b�n�A";
		mes "�悤������������Ⴂ�܂����B";
		mes "������̓A���x���^��̖f�Տ��A";
		mes "�A���X�L�B�Ƃ̓@��ł��B";
		next;
		mes "[�}�n�g]";
		mes "���́A������̎��������Ă���";
		mes "�}�n�g�Ɛ\���܂��B";
		mes "�������p������Ȃ�A�����Ȃ�";
		mes "�����Ă��������B��`���邱�ƂȂ�";
		mes "�Ȃ�ł��������܂��傤�B";
		mes "���b�n�b�n�`�B";
		close;
	}
	switch(SIGN_QUE) {
	case 37:
		mes "[�}�n�g]";
		mes "�����A����l�l���炨�b��";
		mes "�f���Ă���܂��B�ƂĂ��}��v����";
		mes "���d���ł��̂ŁA��Z�ɁB";
		mes "���ꂩ��n���i����";
		mes "^FF0000���[�r�b�q^000000�l��";
		mes "���͂����������B";
		next;
		mes "[�}�n�g]";
		mes "���[�r�b�q�l�͈�̓y�n��";
		mes "��Z����Ȃ����ł��̂ŁA";
		mes "�܂��͔ނ�T���Ƃ��납��";
		mes "�n�߂Ă��������Ȃ���΂Ȃ�܂���B";
		mes "���������ΈȑO�A�����ɂ������";
		mes "���ɂ��܂����B";
		next;
		mes "[�}�n�g]";
		mes "�����āA���̕i�͂��ꂮ���";
		mes "�������Ȃ��悤���肢�������܂��B";
		next;
		mes "-���Ȃ��͒������΂��󂯎����-";
		mes "-�����ڂ͕��ʂ̐΂����A���̐΂ɂ�";
		mes "���Ȃ��̖��O�����܂�Ă���-";
		set SIGN_QUE,38;
		getitem2 7049,1,1,0,0,254,0,getcharid(0),(getcharid(0)>>16)&0xffff;
		close;
	case 38:
		mes "[�}�n�g]";
		mes "���[�r�b�q�l�͂܂�������܂��񂩁H";
		mes "���a�������i�́A��p�i��";
		mes "�������܂���̂ŁA�������Ȃ��悤";
		mes "���C�������������B";
		next;
		mes "[�}�n�g]";
		mes "����ł́A���C�����āB";
		close;
	case 39:
		mes "[�}�n�g]";
		mes "���A��Ȃ����܂��B";
		mes "�����A���[�r�b�q�l��";
		mes "������܂������B";
		mes "����ł́A����l�l�ɘA������";
		mes "�����܂��̂ŁA������ɂ�";
		mes "����o���Ă����Ă��������܂��B";
		delitem 7181,1;
		set SIGN_QUE,40;
		close;
	case 40:
		mes "[�}�n�g]";
		mes "����A�����͎������Ă����d���łˁB";
		mes "����͏�����܂����B";
		close;
	case 41:
		mes "[�}�n�g]";
		mes "����H�@���p�ł����ȁH";
		next;
		if(select("���ł��Ȃ��ł�","������d��������Ɓc�c")==1) {
			mes "[�}�n�g]";
			mes "���b�n�b�n�A�����ł����B";
			mes "�ł͂܂��B";
			close;
		}
		mes "[�}�n�g]";
		mes "�ق��A�����ł����B";
		mes "�ӂނӂށA�����ł��ˁc�c";
		next;
		mes "[�}�n�g]";
		mes "���[��A�������B";
		mes "�ŋ߁A^FF0000�T�C����^000000�������Ă���";
		mes "�l�q�Ȃ̂ł��B�ޏ��̑��k��";
		mes "�̂��Ă����Ă���܂����H";
		set SIGN_QUE,42;
		close;
	case 42:
	case 43:
	case 44:
	case 45:
	case 46:
	case 47:
	case 48:
	case 49:
	case 50:
		mes "[�}�n�g]";
		mes "����ł́A���݂܂�����B";
		mes "�l��������I";
		mes "�ǂ����Ƃł͂���܂��񂩁B";
		mes "�z�b�z�B";
		mes "����ɁA�T�C�����͂��킢����";
		mes "�v���܂��񂩁H�z�b�z�b�z�B";
		close;
	case 51:
		mes "[�}�n�g]";
		mes "�ǂ��ł����A�T�C�����́H";
		mes "�ӂނӂށc�c�������A�����ł������B";
		mes "���肪�Ƃ��������܂��B";
		mes "����l�l�ɂ́A�����炲�񍐂���";
		mes "�����܂��傤�B";
		next;
		mes "[�}�n�g]";
		mes "����ł͍K�^�����F�肢�����܂��B";
		set SIGN_QUE,52;
		close;
	default:
		mes "[�}�n�g]";
		mes "�܂������A����l�l�ɂ͍������c�c";
		mes "���ꂾ���d���̍Œ������ł�������";
		mes "�����Ă��������ƌ����Ă��A������";
		mes "����܂���B�g�Ȃ肭�炢�A������";
		mes "�V�����Ƃ��Ă��炢�������̂ł��B";
		close;
	}
}

yuno.gat,330,100,4	script	�R�m	734,{
	if(SIGN_QUE < 38) {
		mes "[���[�r�b�q]";
		mes "���͒������i���W�߂�̂���ł��B";
		mes "����ŁA���̕t�߂ł͓��荢��ȕ���";
		mes "�T����������܂����c�c";
		next;
		mes "[���[�r�b�q]";
		mes "���������i���~�������́A�A���x���^��";
		mes "�A���X�L�B���𗊂����肵�܂��B";
		mes "���X�l�͒���܂����A�m���Ɏ��";
		mes "����Ă���܂�����ˁB";
		close;
	}
	if(SIGN_QUE > 38) {
		mes "[���[�r�b�q]";
		mes "���̑O�͂��肪�Ƃ��������܂����B";
		mes "�������ŁA�R���N�V�������܂�";
		mes "�����܂�����B";
		close;
	}
	mes "[���[�r�b�q]";
	mes "����A���������ăA���X�L�B���̏�����";
	mes "���炵���̂ł����H";
	mes "�ł́A����ł����i�͎����Ă���";
	mes "���������܂������H";
	next;
	switch(select("�������A�Ⴂ�܂�","���̎��ŖZ�����ł�","�͂��A�����ł�")) {
	case 1:
		mes "[���[�r�b�q]";
		mes "����A�\���󂠂�܂���B";
		close;
	case 2:
		mes "[���[�r�b�q]";
		mes "�����ł����c�c";
		mes "��������A���x���^�܂ł́A";
		mes "�����ł����ˁc�c���Ⴂ����";
		mes "�\���󂠂�܂���B�������Ă����i��";
		mes "�������x���̂ŁA������Â���������";
		mes "����悤�ł��B";
		close;
	case 3:
		if(countitem(7049)) {
			mes "[���[�r�b�q]";
			mes "���ꂪ�����ł����H";
			mes "���[��A�m���ɁI";
			next;
			mes "[���[�r�b�q]";
			mes "�͂��Ă��������āA�{����";
			mes "���肪�Ƃ��������܂��B";
			mes "�A���x���^���炱���܂�";
			mes "��ς������ł��傤�B";
			next;
			mes "[���[�r�b�q]";
			mes "����ł́A���̗̎�����";
			mes "�x�[�J�[����ɓ͂��Ă��������B";
			mes "���肪�Ƃ��������܂����B";
			delitem 7049,1;
			set SIGN_QUE,39;
			getitem 7181,1;
			if(checkre()) {
				if(BaseLevel >= 90) getexp 1100,0;
				else if(BaseLevel >= 80) getexp 700,0;
				else if(BaseLevel >= 70) getexp 400,0;
				else if(BaseLevel >= 60) getexp 200,0;
				else getexp 100,0;
			}
			else {
				if(BaseLevel >= 90) getexp 11000,0;
				else if(BaseLevel >= 80) getexp 7000,0;
				else if(BaseLevel >= 70) getexp 4000,0;
				else if(BaseLevel >= 60) getexp 2000,0;
				else getexp 1000,0;
			}
			close;
		}
		mes "[���[�r�b�q]";
		mes "�����A�����ł����B";
		mes "�Ƃ���ŁA�i���́H";
		next;
		if(select("���S�ȏꏊ�ɕۊǂ��Ă���܂�","�������܂���")==1) {
			mes "[���[�r�b�q]";
			mes "�����Ȃ̂ł����B�n�n�n�B";
			mes "�ł́A�҂��Ă��܂�����A";
			mes "�����Ɏ����Ă��Ă��������܂��񂩁H";
			close;
		}
		mes "[���[�r�b�q]";
		mes "���H";
		mes "�c�c�c�c�c�c�c�c";
		mes "�{���ł����H";
		next;
		if(select("�͂�","��k�ł�")==1) {
			mes "[���[�r�b�q]";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�͂�";
			mes "�����ł����c�c�킩��܂���";
			mes "�x�[�J�[����ɂ́A���̂悤��";
			mes "���`�����Ă����܂��B";
			mes "����ł́B";
			close;
		}
		mes "[���[�r�b�q]";
		mes "�A�n�n�c�c����͂�A";
		mes "�т����肵������Ȃ��ł����B";
		mes "�n�n�n�B�ł́A�҂��Ă��܂�����A";
		mes "�����Ɏ����Ă��Ă��������܂��񂩁H";
		close;
	}
}

alberta_in.gat,154,171,5	script	���C�h	758,{
	if(SIGN_QUE < 38) {
		mes "[�T�C����]";
		mes "���A���݂܂���B���|�����ł��̂ŁA";
		mes "�����A�ǂ��Ă��������܂����H";
		mes "���́A����ƉƂɓ����Ă���Ƃ���";
		mes "���������Y��ɐ@���Ă���";
		mes "�オ���Ă��������Ȃ��ł��傤���H";
		close;
	}
	switch(SIGN_QUE) {
	case 38:
		mes "[�T�C����]";
		mes "���[�r�b�q����ł����H";
		mes "�x�X�A�ς�����������������ł��B";
		mes "�Ō�̒����́c�c�~�����j�[���R����";
		mes "���������Ǝv���܂��B";
		next;
		mes "[�T�C����]";
		mes "���͂ǂ��ɂ���������̂��A";
		mes "�킩��܂���B���[��c�c���̊Ԃ�";
		mes "�~�����j�[���R���ŁA���̑O���m��";
		mes "����������������c�c���x��";
		mes "�V���o���c�o���h���a���̕���";
		mes "�s������������܂���B";
		close;
	case 39:
	case 40:
	case 41:
	case 42:
		mes "[�T�C����]";
		mes "�����A�ǂ����悤�c�c";
		mes "�͂��c�c";
		mes "�c�c�c�c";
		mes "��?!";
		mes "�ǂ����Đl�̘b����������";
		mes "�����Ă���̂ł���?!";
		next;
		mes "[�T�C����]";
		mes "�Z������ł��B";
		mes "�o�čs���Ă��������I";
		if(SIGN_QUE == 42)
			set SIGN_QUE,43;
		close;
	case 43:
		mes "[�T�C����]";
		mes "�͂��c�c�ǂ����悤�c�c";
		next;
		if(select("�ʂ肷����","���́A�}�n�g���񂩂猾���āc�c")==1) {
			mes "[�T�C����]";
			mes "����A1�l�ŔY��łĂ��������Ȃ��B";
			mes "�d�����悤�c�c";
			close;
		}
		mes "[�T�C����]";
		mes "���A�����̃}�n�g���܂��H";
		mes "���������A���́H";
		next;
		menu "�����Y��ł���̂��ƐS�z���Ă��܂���",-;
		emotion 15;
		mes "[�T�C����]";
		mes "����c�c";
		mes "���́A�ł́c�c������Ǝ�`����";
		mes "���������Ȃ��ł��傤���H";
		mes "��낵�����肢���܂��B";
		next;
		mes "[�T�C����]";
		mes "���́A���͂����������̌Z��";
		mes "�a�����Ȃ�ł��B�ł��A�d����";
		mes "�Z�������āA���Ԃ��Ȃ��āc�c";
		mes "����ŔY��ł��܂����B";
		next;
		mes "[�T�C����]";
		mes "�O�ɌZ�ɉ�������A���C��";
		mes "�Ȃ�������ł��B�Ȃ̂ŁA���C���ł�";
		mes "^FF0000���͍�^000000�Ƃ��������";
		mes "�v���[���g���悤���Ȃ�";
		mes "�v���Ă���̂ł����c�c";
		next;
		mes "[�T�C����]";
		mes "���́A�����ǂ�������A���̑����";
		mes "��ɓ���Ă��Ă���Ȃ��ł��傤���H";
		mes "���́A���ł�����A�����ɂƂ́c�c";
		next;
		switch(select("�ʓ|����","������ƍl��������","���Ŏ�`����",)) {
		case 1:
			mes "[�T�C����]";
			mes "�����ł����B";
			mes "���́A�����l�����ς��܂�����";
			mes "���肢�ł��܂����H";
			mes "����ł́A��@���悤�B";
			set SIGN_QUE,44;
			close;
		case 2:
			mes "[�T�C����]";
			mes "�͂��A�\���܂���B";
			mes "���҂����Ă܂��ˁB";
			set SIGN_QUE,45;
			close;
		case 3:
			break;
		}
		break;
	case 44:
		mes "[�T�C����]";
		mes "���A�l���Ȃ����Ă��������܂������H";
		mes "��`���Ă��������܂����H";
		mes "���́A����`�����Ă���������Ȃ�";
		mes "�킸���ł����A��������܂����c�c";
		next;
		if(select("�ǂ����悤","��`����")==2)
			break;
		mes "[�T�C����]";
		mes "�����ł����B";
		mes "���́A�����l�����ς��܂�����";
		mes "���肢�ł��܂����H";
		mes "����ł́A��������悤�B";
		close2;
		emotion 9;
		end;
	case 45:
		mes "[�T�C����]";
		mes "���A�ǂ��ł��傤�H";
		mes "��`���Ă��������܂����H";
		mes "���́A����`�����Ă���������Ȃ�";
		mes "�킸���ł����A��������܂����c�c";
		next;
		if(select("�܂��Y��ł�","��`���܂�")==2)
			break;
		mes "[�T�C����]";
		mes "�����c�c�ł���";
		mes "���́A���܂莞�Ԃ��Ȃ���ł��c�c";
		mes "�l�������Ȃ�A�����߂Ɂc�c";
		close;
	case 46:
	case 47:
		mes "[�T�C����]";
		mes "�����Ȃ��Ƃ𗊂�ł���̂�";
		mes "���m���Ă��܂��B";
		mes "�ł��A�ǂ������肢���܂��B";
		close;
	case 48:
		if(countitem(7044) < 1) {
			mes "[�T�C����]";
			mes "���A�ǂ��ł����H";
			mes "�Ȃɂ��킩��܂������H";
			close;
		}
		mes "[�T�C����]";
		mes "���҂����Ă��܂����[�B";
		mes "����A�{���ɂ��肪�Ƃ��������܂��B";
		next;
		mes "[�T�C����]";
		mes "���́A������v�����e����ɋ΂߂Ă���";
		mes "�Z�Ɏ����Ă����Ă��������܂��񂩁H";
		mes "�Z�̖��O��^FF0000���[�C��^000000�ł��B";
		next;
		mes "[�T�C����]";
		mes "���A����Ɓc�c";
		mes "������ꏏ�ɂ��肢���܂��B";
		set SIGN_QUE,49;
		getitem 7183,1;
		close;
	case 49:
		mes "[�T�C����]";
		mes "�Z�̓v�����e����ɋ΂߂Ă���܂��B";
		mes "���́A���܂莞�Ԃ��Ȃ��̂Łc�c";
		mes "�ǂ������肢���܂��B";
		close;
	case 50:
		mes "[�T�C����]";
		mes "�����A���肪�Ƃ��������܂��I";
		next;
		mes "[�T�C����]";
		mes "���́A���ꏭ�Ȃ��ł����c�c";
		mes "�ق�̋C�����ł��B";
		set SIGN_QUE,51;
		getitem 525,3;
		next;
		emotion 31;
		close;
	default:
		mes "[�T�C����]";
		mes "����l���܂́A���������������Ƃ�";
		mes "�Ȃ��̂ł����A���ނ��Ƃɂ��������āB";
		mes "���̏��ނ̊Ǘ������ł����J�ł��B";
		close;
	}
	//43�`45�̑���
	mes "[�T�C����]";
	mes "���H�@�{���ł����H";
	mes "���ցc�c";
	mes "���肪�Ƃ��������܂��B";
	mes "�{���́A�Ƃ��Ă��S�z��������ł��B";
	next;
	mes "[�T�C����]";
	mes "�����ƁA���̂���ł����A";
	mes "�A���f�o�����̘B���p�M���h��";
	mes "�֌W����ƕ����Ă��܂��B�����A����";
	mes "����ȏ�͂킩��Ȃ��āc�c";
	next;
	mes "[�T�C����]";
	mes "���肢���闧��Ȃ̂ɁA���ꂵ��";
	mes "��񂪂Ȃ��Đ\���󂠂�܂���B";
	mes "���́A����ł���낵�����肢���܂��B";
	set SIGN_QUE,46;
	close;
}

alde_alche.gat,169,162,7	script	�A���P�~�X�g	749,{
	if(SIGN_QUE < 46) {
		mes "[�����J]";
		mes "�B���p�̋��ɂ̌`��";
		mes "���҂̐΂��Ƃ������A�A���P�~�X�g";
		mes "�S�����A�����ڎw���Ă���";
		mes "�킯����Ȃ��B";
		mes "���̂悤�ɁA���̌��������Ă���҂�";
		mes "�����ς����邳�B";
		next;
		if(select("�c�c","�ǂ�Ȍ����ł����H")==1) {
			mes "[�����J]";
			mes "�F��ȈӖ��ŁA���҂̐΂͌��z��";
			mes "�߂��Ȃ���������Ȃ�����ˁB";
			mes "���܂Ő������̃A���P�~�X�g���A";
			mes "�����ڕW�ɂ��Ă������ǁA";
			mes "�����Ɍ����̂��̂ɂȂ���";
			mes "���Ȃ������B";
			close;
		}
		mes "[�����J]";
		mes "�t�t�A���̌����͈ꖡ�Ⴄ���B";
		next;
		mes "[�����J]";
		mes "�ڂ������͔閧�B";
		mes "����[�A�ŋߔ閧��m�肽����l��";
		mes "�����č����Ă���񂾁B";
		close;
	}
	switch(SIGN_QUE) {
	case 46:
		mes "[�����J]";
		mes "����A�Ȃ񂩗p�����H";
		mes "�p���Ȃ��Ȃ�A�o�Ă�����";
		mes "����Ȃ����ȁB";
		next;
		if(select("���͍܂�����l��T���Ă���̂ł���","���A���߂�Ȃ���")==2) {
			mes "[�����J]";
			mes "�ӂ邱�Ƃ��ł���A���̐S������";
			mes "�ǂ��Ǝv����B";
			mes "����A�ł��邾���Â���";
			mes "�o�čs���Ă��炦�邩�ȁB";
			close;
		}
		mes "[�����J]";
		mes "�ȂɁH�@�N�A�ǂ����Ă����?!";
		mes "���̂��Ƃ�m���Ă���l�́A";
		mes "���������Ȃ��͂��Ȃ̂Ɂc�c";
		mes "������c�c����ŁH";
		next;
		if(select("������ƕ����Ă݂������������ł�","���͍܂�����Ă��炦�܂��񂩁H")==1) {
			mes "[�����J]";
			mes "�c�c";
			mes "��l�����炩���̂͊֐S���Ȃ��ȁB";
			mes "�������ƋA��Ȃ����B";
			close;
		}
		mes "[�����J]";
		mes "������c�c�����܂ŖK�˂Ă�������";
		mes "���Ƃ́A������x�m�M�������Ă���";
		mes "�Ƃ������Ƃ��ȁB";
		next;
		mes "[�����J]";
		mes "�悵�A����Ă����悤�B";
		mes "�������A�ޗ��͌N���W�߂Ă���񂾂�B";
		next;
		mes "[�����J]";
		mes "����ŁA�ޗ����B";
		mes "�����ƃ����ł����񂾂�B";
		next;
		mes "[�����J]";
		mes "^FF0000���[�����[���[ 10��";
		mes "�n�`�� 20��";
		mes "���܂̑��̗� 30��";
		mes "�q�i���̗t 1��";
		mes "�����g 1��";
		mes "�󂫃r�� 1��^000000";
		next;
		mes "[�����J]";
		mes "���������H�@������񌾂���B";
		next;
		mes "[�����J]";
		mes "^FF0000���[�����[���[ 10��";
		mes "�n�`�� 20��";
		mes "���܂̑��̗� 30��";
		mes "�q�i���̗t 1��";
		mes "�����g 1��";
		mes "�󂫃r�� 1��^000000";
		next;
		mes "[�����J]";
		mes "���ꂶ��A���񂾂�B";
		set SIGN_QUE,47;
		close;
	case 47:
		mes "[�����J]";
		mes "�ޗ��A�W�߂Ă��������H";
		next;
		if(select("�܂��ł�","�����Ă��܂���")==1) {
			mes "[�����J]";
			mes "���͍�邾��������ˁB";
			mes "�ޗ��͂�������A�N���W�߂Ă��Ȃ�B";
			close;
		}
		mes "[�����J]";
		mes "�������B";
		mes "���Ⴀ�A�����Ă���邩���H";
		next;
		if(countitem(526) < 10 || countitem(518) < 20 || countitem(948) < 30 || countitem(520) < 1 || countitem(708) < 1 || countitem(713) < 1) {
			mes "[�����J]";
			mes "����A����Ȃ���B";
			mes "������x�A�ޗ��������邩��ˁB";
			mes "������Ɛ������낦�Ă���悤�ɁB";
			next;
			mes "[�����J]";
			mes "^FF0000���[�����[���[ 10��";
			mes "�n�`�� 20��";
			mes "���܂̑��̗� 30��";
			mes "�q�i���̗t 1��";
			mes "�����g 1��";
			mes "�󂫃r�� 1��^000000";
			close;
		}
		mes "[�����J]";
		mes "�ӂނӂށc�c";
		mes "�悵�A�S�������Ă�ˁB";
		mes "���Ⴀ�A����Ă����悤�c�c";
		mes "�ƌ��������Ƃ��낾���ǁA����������I";
		next;
		mes "[�����J]";
		mes "��������͍̂��񂾂��B";
		mes "�ǂ�Ȃɓ��������Ă��A";
		mes "2�x�ڂ͂Ȃ�����ˁB";
		mes "���ƁA�኱�萔�������炤��B";
		next;
		if(Zeny < 10000) {
			mes "[�����J]";
			mes "�萔����10,000zeny�B";
			mes "���ꂾ�������Ă��Ă��ꂽ��A";
			mes "����Ă������B";
			close;
		}
		mes "[�����J]";
		mes "�萔����10,000zeny�B";
		mes "����ȑ�����Ă킯����Ȃ����낤�H";
		mes "�悵�A���Ⴀ������Ƒ҂��ĂȁB";
		next;
		mes "-�����J�͂Ă��ς��ƍޗ���";
		mes "�����ǂŌ�������M�����肵�n�߂�-";
		next;
		mes "�c�c";
		next;
		mes "�c�c";
		mes "�c�c�c�c";
		next;
		mes "�c�c";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "�c�c";
		mes "�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		next;
		if(rand(50) == 0) {
			delitem 526,10;
			delitem 518,20;
			delitem 948,30;
			delitem 520,1;
			delitem 708,1;
			delitem 713,1;
			misceffect 306;
			mes "[�����J]";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "���c�c";
			mes "���܂����c�c";
			mes "���s���Ă��܂����݂������B";
			mes "�������ǁA�܂��ޗ����W�߂Ă���";
			mes "���炦�邩���H";
			close;
		}
		misceffect 305;
		mes "[�����J]";
		mes "�悵�A�����I";
		mes "����������Ă����Ȃ����B";
		mes "���A�ł����ꂾ���͒��ӂ��āB";
		mes "����͒Z���Ԃɑ��p���Ă͂����Ȃ���B";
		mes "�����ˁB";
		next;
		mes "[�����J]";
		mes "��x�ɂ���������ޕK�v���Ȃ���B";
		mes "�����������Ȃ肷���āA";
		mes "�|��Ă��܂�����ˁB";
		set Zeny,Zeny-10000;
		delitem 526,10;
		delitem 518,20;
		delitem 948,30;
		delitem 520,1;
		delitem 708,1;
		delitem 713,1;
		set SIGN_QUE,48;
		getitem 7044,1;
		close;
	default:
		mes "[�����J]";
		mes "���͍܂́A�g���l�ɂ���Ė�ɂ�";
		mes "�łɂ��Ȃ�񂾁B";
		mes "������A�C������񂾂�B";
		close;
	}
}

prt_castle.gat,107,58,5	script	���m	105,{
	if(SIGN_QUE == 49 && countitem(7044) && countitem(7183)) {
		mes "[���[�C��]";
		mes "���H";
		mes "������H";
		mes "���ł��傤���c�c�H";
		mes "�܁A�܂����A���ɂȂɂ�?!";
		next;
		menu "�����񂩂�a�����v���[���g�ł�",-;
		mes "[���[�C��]";
		mes "���H";
		mes "���A���������΂�������";
		mes "���̒a�����ł����I";
		mes "���͂́A��������Y��Ă܂����B";
		next;
		emotion 0;
		mes "[���[�C��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�킴�킴�A����ȂƂ���܂�";
		mes "�������ꂽ�񂾂낤�c�c";
		next;
		mes "[���[�C��]";
		mes "���A����́c�c";
		mes "�O�Ɍ����Ă��́A�o���Ă��񂾁c�c";
		next;
		mes "[���[�C��]";
		mes "���́A���肪�Ƃ��������܂��B";
		mes "������������̂ł����A";
		mes "�Ζ����Ȃ̂Łc�c";
		next;
		mes "[���[�C��]";
		mes "���A�������B";
		mes "�����x��ł������炢�����ł��傤�H";
		mes "�ȂɁA�����͂����ς��l��";
		mes "�o���肵�܂�����A�������炢";
		mes "�o���܂����B";
		delitem 7044,1;
		delitem 7183,1;
		set SIGN_QUE,50;
		percentheal 100,100;
		next;
		mes "[���[�C��]";
		mes "���ɂ́A��������A�����Ă����܂��B";
		mes "����ȏ�A���萔������������킯�ɂ�";
		mes "�����܂��񂵁A�����͖{����";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
	if(SIGN_QUE > 49) {
		mes "[���[�C��]";
		mes "���A�悤�����B";
		mes "����͂��肪�Ƃ��������܂����B";
		mes "����́A���肪�����g�킹��";
		mes "���������܂�����B";
		mes "���A���Ɏg�������āH";
		mes "���͂́A����͔閧�ł��B";
		close;
	}
	mes "[���[�C��]";
	mes "�悤�����A�����ł��������܂����B";
	mes "����͖������Ƃ�����܂�����A";
	mes "�C�����Ă��������B";
	close;
}

alberta.gat,98,202,5	script	�x����	105,{
	if(SIGN_QUE > 51) {
		mes "[�t���u]";
		mes "��������Ⴂ�܂��I";
		mes "���̊Ԃ���A�x�[�J�[�l�̂��炪";
		mes "�ƂĂ����邢�̂ł��B";
		mes "�Ȃ񂾂��A�傫�Ȍ��ׂ̉����肽��";
		mes "����������Ă܂����B";
		close;
	}
	mes "[�t���u]";
	mes "������̓A���X�L�B�Ƃ̓@��ł��B";
	mes "���p���́A�܂�����ʂ��Ă��������悤";
	mes "���肢���܂��B";
	if(SIGN_QUE < 35)
		close;
	next;
	if(select("�x�[�J�[����͂�������Ⴂ�܂����H","���炵�܂���")==1) {
		mes "[�t���u]";
		mes "�x�[�J�[�l�́A��������s����";
		mes "�߂�ꂽ�Ƃ���ł��B";
		close;
	}
	mes "[�t���u]";
	mes "�����ł����B";
	mes "����ł́A����������炵�܂��B";
	close;
}

alberta.gat,43,49,5	script	�n�������ȏ��l	89,{
	if(SIGN_QUE < 35) {
		mes "[�}�`�F��]";
		mes "�����A�ǂ����悤�c�c";
		mes "���̉Ƃ͂ǂ��Ȃ����Ⴄ�񂾂낤�c�c";
		next;
		mes "[�}�`�F��]";
		mes "�A���X�L�B�Ƃ����Ĉȗ��A����";
		mes "�ɂ�������������";
		mes "�����Ȃ��Ȃ���������c�c";
		mes "����c�l�ɍ��킹��炪�Ȃ���c�c";
		close;
	}
	if(SIGN_QUE < 52) {
		mes "[�}�`�F��]";
		mes "�x�[�J�[����́A���������ǂ������";
		mes "���Y�𑝂₵�Ă���񂾂낤�c�c";
		next;
		if(select("�x�[�J�[����H","�x�[�J�[�����m���Ă��܂����H")==1) {
			mes "[�}�`�F��]";
			mes "�����c�c�x�[�J�[����ɂ��ĂȂ�";
			mes "���ɕ����Ȃ��ق��������ł���B";
			mes "���̉Ƃ́A�A���X�L�B�Ƃ�����O��";
			mes "�A���x���^��̏��Ƃ�������ł���B";
			next;
			mes "[�}�`�F��]";
			mes "�A���X�L�B�Ƃ��A���x���^�ɗ����̂�";
			mes "50�N���炢�O���������ȁB";
			next;
			mes "[�}�`�F��]";
			mes "�ŏ��͂����ł��Ȃ������񂾂��ǁA";
			mes "�O�̓���ɂȂ��Ă���A�}�ɍ��Y��";
			mes "�����������񂾁B";
			next;
			mes "[�}�`�F��]";
			mes "�����āA���̓���ɂȂ��āA�X��";
			mes "���Y�𑝂₵�A���ł�";
			mes "�~�b�h�K�b�c�ł��L���̋�������";
			mes "�Ȃ����̂��B�Ȃ񂩁A�������G����c�c";
			close;
		}
		mes "[�}�`�F��]";
		mes "�x�[�J�[����H";
		mes "�����A�_�l�̉Ƃɂł�";
		mes "�ł����Ă�񂶂�Ȃ��́H";
		next;
		menu "�c�c�c�c",-;
		mes "[�}�`�F��]";
		mes "�n�n�n�A��k����B";
		mes "�k�̕��ɑ傫�����~������B";
		mes "���ꂪ���̃A���x���^�ň�ԗT����";
		mes "�傫�ȏ��ƁA�A���X�L�B�Ƃ̉��~���B";
		mes "�x�[�J�[����́A�����̌����傾��B";
		next;
		mes "[�}�`�F��]";
		mes "�O�o���Ă鎞�����邯�ǁA";
		mes "���̊Ԍ����΂����肾����";
		mes "����ɂ���񂶂�Ȃ����ȁB";
		close;
	}
	mes "[�}�`�F��]";
	mes "�A���X�L�B�Ƃ��P�Ȃ��K�z��������";
	mes "�����܂ő傫���͂Ȃ�Ȃ��������낤�B";
	mes "�����ƁA����̏��l�B�ƈꏏ��";
	mes "�撣��������A�����܂ő傫��";
	mes "�Ȃ����񂾁B";
	next;
	mes "[�}�`�F��]";
	mes "�Ƃ͌����A���܂�ɂ���ۂ��ǂ���";
	mes "�������ɂ͂ɂ������������������Ȃ���B";
	mes "�Ƃقفc�c";
	close;
}

//============================================================
// ��2��
//------------------------------------------------------------
geffen_in.gat,159,48,4	script	�₵�����ȏ���	711,{
	if(SIGN_QUE < 54) {
		mes "[�u�����_]";
		mes "�����̗[�т͉�������������H";
		mes "���[��c�c���̊ԋ����Ă�������̂�";
		mes "���悤������H";
		mes "�������������Ă�������̂ɁA";
		mes "�܂���x������Ă��Ȃ����c�c";
		close;
	}
	switch(SIGN_QUE) {
	case 54:
		mes "[�u�����_]";
		mes "�����p�ł����H";
		mes "���A���傤�Ǘ[�т̏�����";
		mes "�Z�����̂ł����B";
		mes "����ɁA�m��Ȃ��l�̉Ƃ�";
		mes "����ɏオ��̂͂悭�Ȃ��ł���B";
		next;
		input '@str$;
		if('@str$ != "�G���Q���E�n���[�h") {
			emotion 2;
			mes "[�u�����_]";
			mes "�c�c�����A�����������̂��p�ł����H";
			mes "�悵�A���������o�����B";
			mes "���āA���тɂ��悤������B";
			close;
		}
		mes "[�u�����_]";
		mes "��l��K�˂Ă��炵���̂ł��ˁB";
		mes "���B��Ƃ́A��l�̎d���̂��߁A";
		mes "�v�����e������Q�t�F����";
		mes "�����z���Ă��܂����B";
		next;
		mes "[�u�����_]";
		mes "���̊X��I�񂾂̂́A����������";
		mes "��ԋ߂��X����������������ł��B";
		mes "�Ȃ̂ɁA�����������A���Ă��Ȃ����A";
		mes "�A���̈ꌾ���c�c";
		next;
		mes "[�u�����_]";
		mes "�ނ́A�Ƒ��̂��Ƃ��Y���";
		mes "�d���΂�����c�c";
		mes "�܂��A�L���Ȓb��t�Ƃ������Ƃ�";
		mes "����̂ł��傤���ǁc�c";
		next;
		mes "[�u�����_]";
		mes "��l��T���̂Ȃ�A���̑O��";
		mes "��x���ɉ���Ă��������܂��񂩁B";
		mes "�p�p�ɂ����������̂������";
		mes "�����Ă��܂����̂Łc�c";
		set SIGN_QUE,55;
		close;
	case 55:
	case 56:
		mes "[�u�����_]";
		mes "���������`�B";
		mes "����A���������o�����B";
		mes "���̊ԍ���Ă�������A�����ƂĂ�";
		mes "�C�ɓ����Ă��܂��A�܂��H�ׂ�������";
		mes "������ł��B";
		close;
	case 57:
		mes "[�u�����_]";
		mes "��l�ɂ͉�܂����H";
		mes "���́A�a�C�Ƃ����Ă��܂���ł������H";
		mes "�����Ƃ��т͐H�ׂĂ����ł��傤���H";
		next;
		emotion 9;
		mes "[�u�����_]";
		mes "�����A�������牽���c�c";
		mes "�ł��A���C�Ȃ�ǂ������c�c";
		mes "�������A�A����҂Ƃ��܂��B";
		close;
	case 58:
	case 59:
	case 60:
	case 61:
		if(countitem(7278) < 1) {
			mes "[�u�����_]";
			mes "�A�����邾�Ȃ�āc�c";
			mes "�c�c�c�c�c�c";
			close2;
			emotion 9;
			end;
		}
		mes "[�u�����_]";
		mes "���肪�Ƃ��������܂��c�c";
		mes "�ނ����ς�炸�Ȃ̂ˁB";
		mes "�Ǝ����o���Ȃ��ĐS�z�����ǁA";
		mes "���͂���Ȕނ������Ă���̂ł��B";
		next;
		mes "[�u�����_]";
		mes "�����A�����ł��邱�Ƃ�";
		mes "����Ă݂悤�Ǝv���܂��B";
		mes "���肪�Ƃ��������܂����B";
		mes "�c�c���A�������b����������";
		mes "�����Ă��܂����B";
		mes "�����������肵�Ă��������܂��񂩁H";
		delitem 7278,1;
		set SIGN_QUE,SIGN_QUE+4;
		close;
	case 62:
	case 63:
	case 64:
	case 65:
	case 66:
	case 67:
	case 68:
	case 69:
		mes "[�u�����_]";
		mes "���́A���������̂��Ȃ�ł����A";
		mes "��l�̓z���O���������";
		mes "�A���K������ɂ������Ă����قǂ�";
		mes "�r�������Ă��܂��B";
		mes "�M���Ă����Ǝv���܂���B";
		close;
	default:
		mes "[�u�����_]";
		mes "���́A���ƈꏏ�Ɏ�l��҂��Ƃ�";
		mes "���܂��B�Ƒ��Ƃ��āA��l�̎d����";
		mes "�������Ă������ł�����B";
		mes "�ł��A������Ă����Ȃ�����";
		mes "����܂��B����Ȃ��̂ł���c�c";
		mes "���Ȃ����ǂ������B";
		close;
	}
}

geffen_in.gat,171,42,3	script	���킢���q��	703,{
	if(SIGN_QUE < 54) {
		emotion 28;
		mes "[���A]";
		mes "������A�p�p�ɉ�����Ȃ��B";
		mes "����邩�Ȃ��A������B";
		close;
	}
	switch(SIGN_QUE) {
	case 54:
		mes "[���A]";
		mes "�}�}�������������́A�����";
		mes "����Ă�񂾂���B";
		mes "���C�����Ȃ���B";
		next;
		emotion 18;
		mes "[���A]";
		mes "����A���̂ˁA�}�}�̗�����";
		mes "�Ƃ��Ă����������񂾁[�B";
		mes "�ւփb�B";
		close;
	case 55:
		mes "[���A]";
		mes "���̃p�p�́A���E�ň�Ԃ�";
		mes "�b�艮����Ȃ񂾂��āB";
		mes "���́A��q�Ɏd����C����";
		mes "���E�𗷂��Ȃ���A�߂��炵��";
		mes "�R�E�Z�L���������Ă�񂾂��āB";
		mes "�������ł���[�I";
		next;
		if(select("����A����́H","��q�H")==1) {
			mes "[���A]";
			mes "����H";
			mes "���̂ˁA�p�p�ɂ��Ă��ݏ����Ă�́B";
			mes "�}�}���ˁA�p�p��T���Ă����";
			mes "��" +(Sex? "�Z": "�o")+ "���񂪂�����ċ����Ă��ꂽ�́B";
			mes "������ˁA�p�p�ɂˁA���Ă���";
			mes "�킽���Ă��炤�񂾂��B���ւփb�B";
			close;
		}
		mes "[���A]";
		mes "��ƂˁA�z���O�������������Ƃ��A";
		mes "�A���K����������񂪂悭�V���";
		mes "�����́B";
		mes "�ł��ˁA�p�p�ƗV�Ԃق���������";
		mes "�������낢�́B�ł��ˁA�ł��ˁA";
		mes "�p�p�A���Ă��Ȃ��́c�c������B";
		next;
		if(select("�p�p�ɉ�����H","�p�p�����ĉ�������Ďv���Ă邳")==1) {
			mes "[���A]";
			mes "������B";
			mes "�ł��ˁA�p�p�͂��d���Ȃ́B";
			mes "�Z�����́B";
			close;
		}
		emotion 9;
		mes "[���A]";
		mes "���񂤂�A�����āA���A�̃p�p������B";
		mes "�ł��A�p�p�Z�����́B";
		next;
		mes "[���A]";
		mes "����łˁA������ˁA";
		mes "���Ă��ݏ������́B";
		mes "�p�p�ɂ��������񂾂��ǂˁA";
		mes "�ǂ��ɂ��邩�킩��Ȃ��́B";
		next;
		if(select("�c�c�c�c","�悵�A�͂��Ă�����")==2) {
			mes "[���A]";
			mes "��" +(Sex? "�Z": "�o")+ "�����A�N�H";
			mes "�m��Ȃ��l�ɂ��̂񂶂�";
			mes "�����Ȃ����ă}�}�������Ă��́B";
			close;
		}
		mes "[�u�����_]";
		mes "���A�A���̂�" +(Sex? "�Z": "�o")+ "�����ɗ���ł݂���H";
		mes "���̂�" +(Sex? "�Z": "�o")+ "�����A�p�p��";
		mes "�T���Ă�񂾂��āB";
		next;
		mes "[���A]";
		mes "�ق�ƁA�ق�Ƃ�!?";
		mes "��[��!!";
		next;
		mes "[���A]";
		mes "�����ƂˁA���Ⴀ�ˁB";
		mes "����A���˂������܂��B";
		mes "�����ƃp�p�ɂƂǂ��ĂˁB";
		mes "������������I";
		set SIGN_QUE,56;
		getitem 7276,1;
		close;
	case 56:
	case 57:
	case 58:
	case 59:
	case 60:
	case 61:
		if(rand(2)) {
			mes "[���A]";
			mes "���̂ˁA�p�p�͂ˁA���q����̂��̂�";
			mes "���킵�����Ƃ��Ȃ��񂾂�B";
			mes "�z���O�������������Ƃ��A";
			mes "�p�p�݂����ɂȂ肽������";
			mes "����΂��Ă�񂾂��āB";
			close;
		}
		mes "[���A]";
		mes "���̂ˁA���莆�A�����ƃp�p��";
		mes "�Ƃǂ��ĂˁB";
		close;
	case 62:
	case 63:
	case 64:
	case 65:
		mes "[���A]";
		mes "��[�A���莆�Ƃǂ��Ă����";
		mes "���肪�Ƃ��I";
		mes "����ɁA���̂�������̂�����ˁB";
		mes "��" +(Sex? "�Z": "�o")+ "�����A���肪�Ƃ��I";
		set SIGN_QUE,SIGN_QUE+4;
		getitem 529,10;
		close;
	default:
		mes "[���A]";
		mes "���̂ˁA�p�p�͂Ԃ���ڂ������΂�";
		mes "���킵���肵�Ȃ��񂾂�B";
		mes "�������񂾂�A�Ƃ��ׂȂ́B";
		close;
	}
}

mjo_dun02.gat,88,295,4	script	����R�₷�j	85,{
	if(SIGN_QUE > 1 && SIGN_QUE < 54) {
		if(countitem(1002) < 1) {
			emotion 32;
			mes "[�G���Q���E�n���[�h]";
			mes "�����A���܂��H";
			mes "�����͎��̍�ƕ����Ȃ񂾁B";
			mes "�o�čs���Ă���Ȃ����B";
			mes "���厖�ȂƂ���Ȃ񂾁B";
			close2;
			warp "mjo_dun02.gat",372,346;
			end;
		}
		mes "[�G���Q���E�n���[�h]";
		mes "������A��͂菭������Ȃ��ȁB";
		mes "�ǂ����悤���c�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���A���O�B�S�z�΂������Ă�ȁB";
		mes "���܂�A�}���ł�񂾁B";
		mes "1���炦�Ȃ����H";
		next;
		if(select("�����ł���","���ł�")==1) {
			mes "[�G���Q���E�n���[�h]";
			mes "���A������B���肪�Ƃ��B";
			mes "�����K���A���̉��͕Ԃ���B";
			delitem 1002,1;
			getexp 10,0;
			close;
		}
		mes "[�G���Q���E�n���[�h]";
		mes "�������B�������爫����";
		mes "�o�čs���Ă���Ȃ����B";
		mes "�����͎��̍�ƕ����Ȃ񂾁B";
		close2;
		emotion 32;
		end;
	}
	switch(SIGN_QUE) {
	case 0:
	case 1:
	case 54:
	case 55:
		mes "[�G���Q���E�n���[�h]";
		mes "�ז����Ȃ��ł���B";
		mes "���厖�ȂƂ���Ȃ񂾁B";
		close2;
		emotion 32;
		end;
	case 56:
		mes "[�G���Q���E�n���[�h]";
		mes "�Ƒ��ɍŌ�ɘA�����Ă���A";
		mes "�����Ԍo�����ȁc�c";
		mes "���낻��A�����Ȃ���";
		mes "�܂������낤�ȁc�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "����H�@���ɉ����H";
		mes "�p���Ȃ��Ȃ�A�ז����Ȃ��ŗ~�����ȁB";
		if(countitem(7276) < 1)
			close;
		next;
		switch(select("���́A���肢�������āc�c","���A�����̎莆�������Ă��܂���","���߂�Ȃ���")) {
		case 1:
			mes "[�G���Q���E�n���[�h]";
			mes "���͖Z�����񂾁B";
			mes "���l�̗��݂𕷂��]�T�͂Ȃ��ˁB";
			mes "�����������Ă���B";
			close;
		case 2:
			break;
		case 3:
			mes "[�G���Q���E�n���[�h]";
			mes "�킩��΂����B";
			mes "���Ⴀ�ȁB";
			close;
		}
		mes "[�G���Q���E�n���[�h]";
		mes "������H";
		mes "�ȂɁA�{�����H";
		mes "���������Ă���I";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�ق��[�c�c���񂤂�c�c";
		mes "�n�n�b�A������";
		mes "����A�n�n�n�b�B";
		mes "�ف[�c�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���C���o�Ă�����B���肪�Ƃ��B";
		mes "�Ƃ���ŁA���ꂾ���ׂ̈ɁA�킴�킴";
		mes "�K�˂Ă����񂶂�Ȃ����낤�H";
		mes "���݂ł�����̂��ȁH";
		mes "�ł��邱�ƂȂ畷���Ă�낤�B";
		next;
		menu "���́c�c",-;
		mes "[�G���Q���E�n���[�h]";
		mes "����H";
		mes "����́c�c";
		mes "����A�������c�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�O�ɁA���t�����畷�������Ƃ�����B";
		mes "���̐��ɂ́A��n���琶�܂��̂ł�";
		mes "�Ȃ��A�󂩂琶�ꗎ���Ă���z����";
		mes "���邻�����B����ȋ�̍z���̒��ɂ�";
		mes "�ƂĂ����������̂�����ƌ����Ă����B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���ł���Ԕ������A�܂̂悤�Ȑ΂�����";
		mes "�l�X�͂����_�̗܂ƌĂ񂾂ƌ����B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�ł�����́c�c";
		mes "���̖�l�́c�c����ɁA���̒f�ʂ́c�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "����́A�O������̗͂ɂ����";
		mes "���ꂽ�̂ł͂Ȃ��A��������";
		mes "�Ȃ�炩�̗͂�������Ċ��ꂽ�悤���B";
		mes "�ӂށc�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�܂�A���ɂ�����C������";
		mes "�~�����񂾂ˁH";
		mes "�������낤�B���̂悤�ȋ@��́A";
		mes "�ꐶ�Ɉ�x���邩�Ȃ������B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�����A����͐����ȍޗ��ł�";
		mes "�C���ł��Ȃ��B�K�v�Ȃ��̂́A�قƂ��";
		mes "�茳�ɂ��邪�A����ł�����Ȃ����̂�";
		mes "����������B������W�߂Ă���";
		mes "����Ȃ����B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���������B";
		mes "^FF0000�g�їp�n�z�F5��^000000�A";
		mes "^FF0000�I���f�I�R���̋���2��^000000�A";
		mes "������^FF0000���~^000000���B";
		mes "���~�͍����Ȃ��̂قǗǂ��B";
		mes "�������₷���Ȃ邩��ˁB";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�{���́A�G���y���E���̋��~��";
		mes "��ԗǂ��񂾂��A�����傤�ǎ茳��";
		mes "�Ȃ����ĂˁB����ɁA�����ȒP�Ɏ��";
		mes "������̂ł��Ȃ����B���A�������";
		mes "�����a�����Ă������B";
		mes "�C���̏������n�߂Ă����B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�����܂Ŗ߂�̂͑�ς��낤�B";
		mes "�ߓ�����A��Ƃ����B";
		delitem 7276,1;
		delitem 7177,7;
		set SIGN_QUE,57;
		close2;
		warp "mjo_dun02.gat",371,344;
		end;
	case 57:
		mes "[�G���Q���E�n���[�h]";
		mes "�������͋��~�ɍ��E�����B";
		mes "���ꂶ�Ⴀ�A���������ė�����";
		mes "�����Ă��炦�邩�ȁB";
		next;
		if(countitem(612) < 5 || countitem(615) < 2 || (countitem(986) < 1 && countitem(987) < 1 && countitem(988) < 1 && countitem(989) < 1)) {
			if(rand(6)) {
				mes "[�G���Q���E�n���[�h]";
				mes "�����Ɗo�����ˁH";
				mes "����قǒ��������̂ł��Ȃ����A";
				mes "���x�͖Y��Ȃ��悤�ɂˁB";
				close;
			}
			mes "[�G���Q���E�n���[�h]";
			mes "���񂾂��͎̂����Ă��Ă��ꂽ���ȁH";
			mes "���A�܂��H";
			next;
			mes "[�G���Q���E�n���[�h]";
			mes "���A�K�v�Ȃ��̂�Y�ꂽ�H";
			mes "���[��A����ȊȒP�Ȃ��Ƃ�";
			mes "�o�����Ȃ��̂��c�c�B����1��";
			mes "�����Ă����邩��A���x�͗��񂾂�B";
			next;
			mes "[�G���Q���E�n���[�h]";
			mes "���������B";
			mes "^FF0000�g�їp�n�z�F5��^000000�A";
			mes "^FF0000�I���f�I�R���̋���2��^000000�A";
			mes "������^FF0000���~^000000���B";
			mes "���~�͍����Ȃ��̂قǗǂ��B";
			mes "���������オ�邩��ˁB";
			close;
		}
		if(countitem(986)) {
			mes "[�G���Q���E�n���[�h]";
			mes "���~���B";
			mes "���Ȃ�S�ׂ����A�������낤�B";
			mes "���ꂶ�Ⴀ�A�C����Ƃɓ��邼�B";
			set '@anvil,0;
		}
		else if(countitem(987)) {
			mes "[�G���Q���E�n���[�h]";
			mes "�I���f�I�R���̋��~���B";
			mes "�����S�ׂ����A�������낤�B";
			mes "���ꂶ�Ⴀ�A�C����Ƃɓ��邩�B";
			set '@anvil,1;
		}
		else if(countitem(988)) {
			mes "[�G���Q���E�n���[�h]";
			mes "�����̋��~���B";
			mes "����A����Ȃ���邾�낤�B";
			mes "���ꂶ�Ⴀ�A�C����Ƃɓ��邩�B";
			set '@anvil,2;
		}
		else if(countitem(989)) {
			mes "[�G���Q���E�n���[�h]";
			mes "����̓G���y���E���̋��~����";
			mes "�Ȃ����I�@�n�n�b�A�悵�I";
			mes "����Ȃ����ۂǉ^�Ɍ�������Ȃ�����";
			mes "�C���͐������邾�낤�B";
			mes "���ꂶ�Ⴀ�A�C����Ƃɓ��邩�B";
			set '@anvil,3;
		}
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���Ȃ莞�Ԃ������邩��A���̊ԁA";
		mes "���̎莆���Ƒ��Ɏ����čs����";
		mes "����Ȃ����H";
		mes "���f�������Ĉ������ǁA";
		mes "�C���̑�����Ƃł��v����";
		mes "���܂�Ă���Ȃ����B";
		delitem 612,5;
		delitem 615,2;
		delitem 986+'@anvil,1;
		set SIGN_QUE,58+'@anvil;
		getitem 7278,1;
		close;
	case 58:
	case 59:
	case 60:
	case 61:
	case 62:
	case 63:
	case 64:
	case 65:
		mes "[�G���Q���E�n���[�h]";
		mes "��A�܂���ƒ����B";
		mes "�܂����Ȃ肩���邩��A���̊Ԃ�";
		mes "�莆�𗊂񂾂�B";
		close;
	case 66: //���~
		set '@result,63;
		break;
	case 67: //�I���f�I�R���̋��~
		set '@result,33;
		break;
	case 68: //�����̋��~
		set '@result,10;
		break;
	case 69: //�G���y���E���̋��~
		set '@result,0;
		break;
	case 70:
		if(countitem(612) < 5 || countitem(615) < 2 || (countitem(986) < 1 && countitem(987) < 1 && countitem(988) < 1 && countitem(989) < 1)) {
			if(rand(6)) {
				mes "[�G���Q���E�n���[�h]";
				mes "�����Ɗo�����ˁH";
				mes "����قǒ��������̂ł��Ȃ����A";
				mes "���x�͖Y��Ȃ��悤�ɂˁB";
				close;
			}
			mes "[�G���Q���E�n���[�h]";
			mes "���񂾂��͎̂����Ă��Ă��ꂽ���ȁH";
			mes "���A�܂��H";
			next;
			mes "[�G���Q���E�n���[�h]";
			mes "���A�K�v�Ȃ��̂�Y�ꂽ�H";
			mes "���[��A����ȊȒP�Ȃ��Ƃ�";
			mes "�o�����Ȃ��̂��c�c�B����1��";
			mes "�����Ă����邩��A���x�͗��񂾂�B";
			next;
			mes "[�G���Q���E�n���[�h]";
			mes "���������B";
			mes "^FF0000�g�їp�n�z�F5��^000000�A";
			mes "^FF0000�I���f�I�R���̋���2��^000000�A";
			mes "������^FF0000���~^000000���B";
			mes "�G���y���E���̋��~����Ԃ������ǁA";
			mes "���肪�������A�����ł�����B";
			close;
		}
		if(countitem(986) || countitem(987)) {
			mes "[�G���Q���E�n���[�h]";
			mes "���~��I���f�I�R���̋��~����";
			mes "�ǂ����Ă����������������Ă��܂���B";
			mes "�����̂����H";
			next;
			mes "[�G���Q���E�n���[�h]";
			mes "���[��c�c��͂�S�z���B";
			mes "�������ǁA�����̋��~�������Ă���";
			mes "����Ȃ����ȁB���񂾂�B";
			close;
		}
		else if(countitem(988)) {
			mes "[�G���Q���E�n���[�h]";
			mes "���肪�Ƃ��A�����̋��~���ˁB";
			set '@anvil,988;
		}
		else if(countitem(989)) {
			mes "[�G���Q���E�n���[�h]";
			mes "����̓G���y���E���̋��~����Ȃ����I";
			set '@anvil,989;
		}
		mes "�悵�A�����͏o���Ă�񂾁B";
		mes "�����Ɏ��|���낤�B";
		mes "�����X�^�[��������A��������";
		mes "���񂾂�B";
		next;
		mes "�S�V�S�V�A�J���J��";
		mes "�g���J���A�g���J���A�g���J��";
		mes "�U�U�A�U�b�A�U�A�S�V�S�V�c�c";
		next;
		misceffect 101;
		next;
		mes "�J���J���A�g���g���A�K���K��";
		mes "�X�`���A�X�`���A�`�����`����";
		next;
		misceffect 101;
		next;
		mes "�h���_���A�h���K��";
		mes "�|���|���A�g���g��";
		mes "�`���b�`���b�`���b";
		next;
		misceffect 101;
		next;
		mes "�E�B�B�B�B�B�B�B�B��";
		mes "�M���B�B�B�B�B�B�B��";
		next;
		misceffect 101;
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�ӂ��c�c";
		mes "�����������B";
		next;
		misceffect 101;
		next;
		mes "�J���J���A�J���J���J��";
		next;
		misceffect 101;
		next;
		misceffect 99;
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�z�b�A�I������c�c";
		mes "�H�Ɍ�������������B";
		mes "�ł��A���Ă���B���̌��z�I�Ȍ����B";
		mes "�����炾���ł��������������A";
		mes "��͂肱�̂ق������{�������B";
		mes "����A�����󂯂Ă悩������B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�����������߂ďC�������񂾁B";
		mes "��؂ɂ��Ă����B";
		delitem 612,5;
		delitem 615,2;
		delitem '@anvil,1;
		set SIGN_QUE,71;
		getitem 7178,1;
		misceffect 94,"";
		close;
	case 139:
		mes "[�G���Q���E�n���[�h]";
		mes "�͂́A�������͂��܂�������悤���ˁB";
		mes "�ڂ�����΂킩���B";
		mes "�Ƃ���ŁA�܂������p�����H";
		next;
		menu "�͂��A���肢�������ė��܂���",-;
		mes "[�G���Q���E�n���[�h]";
		mes "�����Ȃ̂��B";
		mes "���x�͂ǂ�Ȗ��ȕi��������";
		mes "�����̂��ȁH";
		next;
		menu "����ł��B",-;
		mes "[�G���Q���E�n���[�h]";
		mes "����́c�c�I";
		mes "�������Č��Ă��邾���ł��A";
		mes "�����͂��������B";
		mes "�悭����ȕi��";
		mes "���X�ƌ����Ă���ˁB";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "����ȕi�A�ꐶ��1��o����";
		mes "���b�L�[���ĂȂ���Ȃ̂ɁA2���";
		mes "�G��邱�Ƃ��ł���Ȃ�ĂˁB";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�����͂��Ȃ莞�Ԃ������肻�����c�c";
		mes "�ǂꂭ�炢���Ԃ������邩�A�\�z��";
		mes "�ł��Ȃ���B";
		delitem 7314,1;
		set SIGN_QUE,140;
		set SIGN_SUBQUE,gettime(3)/2+1;
		close;
	case 140:
		if((SIGN_SUBQUE*2+2)%24 != gettime(3) && (SIGN_SUBQUE*2+3)%24 != gettime(3)) {
			mes "[�G���Q���E�n���[�h]";
			mes "�܂��I����ĂȂ��񂾁B";
			mes "�S�z�Ȃ̂͂킩�邯�ǁA��������";
			mes "�����肻������B";
			close;
		}
		mes "[�G���Q���E�n���[�h]";
		mes "���A���傤�Ǘǂ������B";
		mes "���A�d�����I������Ƃ��낾��B";
		mes "���₢��A��ς��������ǁA";
		mes "����ȋ@��A�ꐶ�Ɉ�x���邩";
		mes "�Ȃ��������A�撣�点�Ă��������B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "�ق�A���ꂾ�B";
		mes "�������ŁA�Ȃ񂩎������܂�";
		mes "����傫���Ȃꂽ�C�������B";
		mes "�n�n�b";
		set SIGN_QUE,141;
		set SIGN_SUBQUE,0;
		getitem 2644,1;
		close;
	default:
		if(SIGN_QUE < 139) {
			mes "[�G���Q���E�n���[�h]";
			mes "�������͂��܂�����Ă邩���H";
			mes "�������K�v�ɂȂ�����A�����Ȃ�";
			mes "�����ł�B";
			close;
		}
		mes "[�G���Q���E�n���[�h]";
		mes "���������Ȃ����ǁA�Ƒ�������Ȃ�";
		mes "�����ƘA���͎�����ق����������B";
		mes "�������A�鏊�́A�Ƒ��̂��ƂȂ񂾁B";
		close2;
		emotion 9;
		end;
	}
	//66�`69�̑���
	if(rand(100) < '@result) {
		emotion 19;
		mes "[�G���Q���E�n���[�h]";
		mes "�����A��������c�c";
		mes "���́A�����ɂ����񂾂��c�c";
		next;
		mes "[�G���Q���E�n���[�h]";
		if(SIGN_QUE < 68)
			mes "��͂�A���̋��~�ł͓�������B";
		else {
			mes "��ƒ��ɁA�����X�^�[�ɏP���ĂˁB";
			mes "��Ƃɖ����ŁA�����X�^�[��";
			mes "����ꂽ�̂ɋC�����Ȃ������̂�";
			mes "����񂾂��ǁA���s���Ă��܂����񂾁B";
		}
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "���A����Ȃɗ������܂Ȃ��ł���B";
		mes "�X�^�[�W���G���̂�����͖������B";
		mes "�����A���̍ޗ����S�����߂�";
		mes "�Ȃ��Ă��܂����B�������A����1�x";
		mes "�ޗ����W�߂Ă��Ă��炦�邩���B";
		next;
		mes "[�G���Q���E�n���[�h]";
		mes "^FF0000�g�їp�n�z�F5��^000000�A";
		mes "^FF0000�I���f�I�R���̋���2��^000000�A";
		mes "������^FF0000���~^000000���B";
		if(SIGN_QUE < 68) {
			mes "�G���y���E���̋��~�Ƃ͌���Ȃ�����";
			mes "�ł���Ή����̋��~�������Ă���";
			mes "���炦�Ȃ����ȁB";
		}
		else
			mes "�������A�����̋��~�𗊂ނ�B";
		set SIGN_QUE,70;
		close;
	}
	mes "[�G���Q���E�n���[�h]";
	mes "��������B�莆�͓n���Ă��ꂽ�����H";
	mes "�d���ɔM�����Ă���ƁA�ǂ����Ă�";
	mes "�Ƒ�����񂵂ɂȂ��Ă��܂��Ăˁc�c";
	next;
	mes "[�G���Q���E�n���[�h]";
	mes "�N�͌���������A�����ƉƑ���";
	mes "�厖�ɂ��Ă����邱�Ƃ��B";
	mes "�j���낤�ƁA�����낤�ƁA�Ƒ��̒���";
	mes "�����Ɩ������Ă��񂪂���񂾁B";
	next;
	mes "[�G���Q���E�n���[�h]";
	mes "�悵�A�C���ł����B";
	mes "�ق�A���ꂾ�B";
	next;
	set SIGN_QUE,71;
	getitem 7178,1;
	misceffect 94,"";
	next;
	mes "[�G���Q���E�n���[�h]";
	mes "�H�Ɍ�������������B";
	mes "�ł��A���Ă���B���̌��z�I�Ȍ����B";
	mes "�����炾���ł��������������A";
	mes "��͂肱�̂ق������{�������B";
	mes "����A�����󂯂Ă悩������B";
	next;
	mes "[�G���Q���E�n���[�h]";
	mes "�����������߂ďC�������񂾁B";
	mes "��؂ɂ��Ă����B";
	close;
}

gef_tower.gat,118,36,4	script	�{���Ă���E�B�U�[�h	64,{
	if(SIGN_QUE != 72) {
		emotion 32;
		mes "[�h�[�^]";
		mes "�ԂԂA�ԂԂԂc�c";
		mes "�ԂԂc�c";
		mes "���̂��`�`�`�`�`�`�`!!!!";
		close;
	}
	emotion 32;
	mes "[�h�[�^]";
	mes "�ӂ�A���@���g���Ȃ��z���A";
	mes "�ǂ����Ă���ȏ��ɗ����H";
	next;
	input '@str$;
	if('@str$ != "���b�c" && '@str$ != "�X�^�[�W���G��") {
		mes "[�h�[�^]";
		mes "�͂��H";
		mes "�Ȃ�̂��Ƃ��킩��Ȃ��ȁB";
		mes "�ق�A�ӂ����ĂȂ��ŁA�Ƃ��ƂƋA��B";
		close;
	}
	mes "[�h�[�^]";
	mes "����H";
	if('@str$ == "�X�^�[�W���G��")
		mes "�X�^�[�W���G���H";
	mes "���b�c����̂��Ƃŗ����̂��B";
	mes "�c�c�c�c�c";
	next;
	emotion 9;
	next;
	emotion 9;
	next;
	emotion 7;
	mes "�����[�[�[�[�[��!!!!";
	next;
	emotion 32;
	mes "[�h�[�^]";
	mes "�����A�܂��v���o���Ă��܂�������";
	mes "�Ȃ����I�@�ԂԂc�c�c�c";
	mes "�T���Ă�z�Ȃ�A^FF0000�R���h�̕���";
	mes "�V��������^000000���������ꂽ�Ƃ���";
	mes "�������ɍs���Ă��܂�����I";
	set SIGN_QUE,73;
	close;
}

umbala.gat,163,256,3	script	���Z��	781,{
	if(UM_1QUE < 3) {
		mes "[�H�H�H�H]";
		mes "�E���o�E���o�H";
		mes "�E���o�A�E���o�`!!";
		mes "�E���o�o�o�A�E���o�`";
		mes "�o�o�o!!!!";
		close;
	}
	if(SIGN_QUE < 73) {
		emotion 2;
		mes "[���E�^��]";
		mes "�X�}�C���}�X�N�`�A�X�}�C���}�X�N�`";
		mes "�X�}�C���}�X�N�`�A���ʁA�ʂ߂�`";
		mes "�������D���D���A�����ɂ����`";
		close;
	}
	if(SIGN_QUE > 73) {
		mes "[���E�^��]";
		mes "���ʁA���ʁ`";
		mes "�X�}�C���}�X�N�`";
		mes "�X�}�C���A�X�}�C���`";
		close;
	}
	mes "[���E�^��]";
	mes "�ŋ߁A���ɗ����l�H";
	mes "����ƂˁA�m���Ă邯�ǁc�c";
	mes "�X�}�C���}�X�N�`�A�X�}�C���}�X�N�`�B";
	next;
	if(countitem(2278) < 1) {
		mes "[���E�^��]";
		mes "���̂ˁA���A�X�}�C���}�X�N��";
		mes "�D���Ȃ́B";
		mes "���ꂽ�狳���Ă�����B";
		close;
	}
	mes "[���E�^��]";
	mes "���A�X�}�C���}�X�N���`!!";
	mes "���ʁA���ʁA���ʁI";
	mes "�ˁA�ˁA���傤�����I";
	next;
	if(select("�͂��A������","�����Ȃ�")==2) {
		mes "[���E�^��]";
		mes "�u�E�`�A���������I";
		mes "�X�}�C���}�X�N�A";
		mes "���傤�������傤�����I";
		close;
	}
	mes "[���E�^��]";
	mes "����[���A���肪�Ƃ��A���肪�Ƃ��I";
	next;
	mes "[���E�^��]";
	mes "���̂ˁA���̊ԁA�ςȕ��𒅂��l��";
	mes "�������̑傫�Ȗ؂̒��ɓ����Ă����̂�";
	mes "�����́B�ł��ˁA�o�Ă���̂�";
	mes "���ĂȂ��́B";
	delitem 2278,1;
	set SIGN_QUE,74;
	close;
}

um_in.gat,152,125,5	script	�C������Ȓj	121,{
	if(SIGN_QUE < 74) {
		emotion 29;
		mes "[�T�C�I��]";
		mes "�N�N�N�A��������̂悤�ɂ��āc�c";
		mes "�������������΁c�c";
		mes "�N�N�N�c�c";
		next;
		emotion 6;
		mes "[�T�C�I��]";
		mes "����A�N�����O�H";
		mes "�ǂ�����Ă����ɓ����Ă����B";
		mes "�����o�Ă��B";
		close2;
		warp "umbala.gat",125,151;
		end;
	}
	switch(SIGN_QUE) {
	case 74:
		emotion 29;
		mes "[�T�C�I��]";
		mes "�N�N�N�A��������̂悤�ɂ��āc�c";
		mes "�������������΁c�c";
		mes "�N�N�N�c�c";
		next;
		emotion 6;
		mes "[�T�C�I��]";
		mes "����A�N�����O�H";
		mes "�ǂ�����Ă����ɓ����Ă����B";
		mes "�����A�Ƃ��ƂƏ������܂��B";
		next;
		switch(select("���b�c����̗p���Łc�c","�\���󂠂�܂���","���̂�����c�c","�c�c�c�c")) {
		case 1:
			mes "[�T�C�I��]";
			mes "���A���b�c�H";
			mes "��������A���b�c�̎g���Ƃ���";
			mes "�؋����������܂��B";
			close;
		case 2:
			emotion 32;
			mes "[�T�C�I��]";
			mes "����������Ȃ��āA�ԓx�Ŏ����񂩂��B";
			mes "�����͈�ʐl���C�y�ɗ���";
			mes "�ꏊ�ł͂Ȃ��B";
			mes "�����A�Ƃ��ƂƏ������܂��B";
			close;
		case 3:
			break;
		case 4:
			misceffect 124;
			mes "[�T�C�I��]";
			mes "���O�́A���l�̉Ƃɖ��f��";
			mes "�オ�肱��ŗ��āA���������̂��B";
			mes "�����͂��O�̉Ƃ�?!�@�킪�܂܂�";
			mes "����ŏ�Ȃ��z�߁I�@�o�čs���I";
			mes "�J�@�[�b!!!!";
			close2;
			misceffect 17,"";
			percentheal -30,0;
			end;
		}
		mes "[�T�C�I��]";
		mes "�ق��A����́c�c";
		next;
		emotion 23;
		next;
		mes "[�T�C�I��]";
		mes "�����A�����!!!";
		mes "�_�̗܂ł͂Ȃ����B";
		mes "���悢�抮���������B";
		next;
		mes "[�T�C�I��]";
		mes "�N�N�N�c�c�ƂȂ��";
		mes "�����񑩂����˂΂ȁB";
		mes "�_�̗܁c�c���ɃX�^�[�W���G����";
		mes "�Ă΂�Ă���B";
		next;
		mes "[�T�C�I��]";
		mes "�������������Ă��邩������񂪁A";
		mes "���̃X�^�[�W���G���̓����ɂ�";
		mes "�l�Ԃ̎��͂ł͌��邱�Ƃ̏o���Ȃ�";
		mes "���������݂���B�������Ƃ������Ƃ�";
		mes "�����Ă��邪�A���e��Ӗ��Ɋւ��Ă�";
		mes "�ʏ�̕��@�ł͉�Ǖs�\���B";
		next;
		mes "[�T�C�I��]";
		mes "�������A���̃X�^�[�W���G���A����";
		mes "����Ȏ��ɔ�������B";
		mes "���̎��Ƃ́A�Â��{�Ɏg���Ă���";
		mes "�悤�Ȏ����B";
		next;
		mes "[�T�C�I��]";
		mes "�������A�Â��������B";
		mes "���̃X�^�[�W���G���̓��e��";
		mes "�ǂ߂�悤�ɂ���ɂ́A";
		mes "10�������邩�ȁB";
		mes "�������A10�����W�߂Ă���";
		mes "�o�����Ă��邪�����B";
		set SIGN_QUE,75;
		close;
	case 75:
		mes "[�T�C�I��]";
		mes "�W�߂ė������H";
		mes "�����Ȃ����B";
		next;
		if(countitem(1097) < 1) {
			mes "[�T�C�I��]";
			mes "�����!!!!";
			mes "�Â����������ė����ƌ��������낤���I";
			next;
			mes "[�T�C�I��]";
			mes "�������Ǝ����Ă��񂩁I";
			mes "�J�@�[�b!!";
			next;
			misceffect 17,"";
			percentheal -30,0;
			next;
			warp "umbala.gat",125,151;
			end;
		}
		mes "[�T�C�I��]";
		mes "�悵�A����Ȃ�g���������B";
		mes "����^FF0000�Â��{�̃y�[�W^000000�Ȃ�";
		mes "�X�^�[�W���G�����������邾�낤�B";
		next;
		if(countitem(1097) < 7) {
			mes "[�T�C�I��]";
			mes "�c�c��H";
			mes "����������Ȃ��ȁB";
			mes "�����͂��邪�A�����������яオ��ɂ�";
			mes "�܂�����Ȃ��B�����ƏW�߂ė��Ȃ����B";
			close;
		}
		mes "[�T�C�I��]";
		mes "�悵�A������Ƒ҂āB";
		mes "�E���E���c�c�������āA";
		mes "�������ĂƁc�c";
		mes "�S�V�S�V�A�S�V�S�V�B";
		next;
		misceffect 72;
		next;
		mes "[�T�C�I��]";
		mes "�悵�A�\�z�ʂ肾�I";
		mes "�Â��{�̃y�[�W�ɔ������āA";
		mes "�X�^�[�W���G���ɕ�����";
		mes "�����яオ�������I";
		mes "�N�N�N�c�c";
		next;
		mes "[�T�C�I��]";
		mes "����Ń��b�c�Ƃ̖񑩂͎�����B";
		mes "�����ɁA����ȏ㎄�ɖ��f��";
		mes "������͎̂~�߂�Ɠ`���Ă��ꂽ�܂��B";
		mes "����ȏ���f��������悤�Ȃ�c�c";
		mes "�N�N�N�c�c";
		delitem 1097,7;
		set SIGN_QUE,76;
		getitem 7275,1;
		close;
	case 76:
		mes "[�T�C�I��]";
		mes "�������ƃ��b�c�ɓ`���邪�����B";
		mes "����ȏ���f��������ȂƂȁB";
		close;
	default:
		mes "[�T�C�I��]";
		mes "����ɑ��l�̉Ƃɓ����Ă���ȁB";
		mes "�J�@�[�b!!!!";
		close;
	}
}

alberta.gat,165,83,4	script	�C������Ȃ��ꂳ��	755,{
	if(SIGN_QUE < 77) {
		mes "[�t�����N]";
		mes "�J���~�邩���ȁc�c";
		mes "�����A������B�ŋ߁A�ڂ��ǂ����Ȃ��B";
		mes "���̂܂ܘV���āA�����ꎀ�Ȃ˂�";
		mes "�Ȃ�Ȃ��̂��c�c";
		close;
	}
	switch(SIGN_QUE) {
	case 77:
	case 78:
		if(SIGN_QUE < 78 || countitem(2203) < 1 || countitem(7275) < 1) {
			mes "[�t�����N]";
			mes "�ŋ߁A�ڂ��{���ɂ�����킢�B";
			mes "�V���ɂ͏��Ă񂩁B";
			mes "��A�Ȃ񂾁H";
			mes "���������Ƃ͎���ȁI";
			mes "�ق�ق�A�������Ɨ�������񂩂�!!";
			set SIGN_QUE,78;
			close;
		}
		mes "[�t�����N]";
		mes "�Ȃ񂶂Ⴂ�c�c��H";
		mes "������킵�ɁH";
		mes "�ӂ͂́A�ŋ߂̎�҂ɂ��Ă�";
		mes "�C�������Ă邶��Ȃ����B";
		next;
		mes "[�t�����N]";
		mes "����A�҂���������B";
		mes "��������A���̊ዾ�̗��������";
		mes "����񂩂ȁH";
		while(1) {
			next;
			switch(select("�Q�t�F���̉B���ꂽ�͂��āH","�X�^�[�W���G���ɂ���","�Ñ㌾�ꕶ�̉�ǂ�")) {
			case 1:
				mes "[�t�����N]";
				mes "�Q�t�F���ɑ��݂��鋭��ȗ͂��B";
				mes "�킵���ڂ����͒m��Ȃ����A";
				mes "�Q�t�F���^���[�͊m���ɒP����";
				mes "���z���ł͂Ȃ��B";
				mes "����͗\�z���Ⴊ�A�����𕕂��邽�߂�";
				mes "���ꂽ�̂ł͂Ȃ����낤���B";
				next;
				mes "[�t�����N]";
				mes "�^���[�O�̕������A�����̖�����";
				mes "�S���Ă���Ɗ�����񂶂Ⴊ�B";
				mes "�����A���܂苻�����Ȃ��ĂȁB";
				mes "�ڂ��������������Ƃ͂Ȃ��񂶂�B";
				next;
				mes "[�t�����N]";
				mes "�������A���̃Q�t�F���^���[��";
				mes "���݂����ł��A���̏ꏊ�ɂȂɂ�";
				mes "����̂͊m������낤�āB";
				break;
			case 2:
				mes "[�t�����N]";
				mes "�X�^�[�W���G���Ƃȁc�c";
				mes "�����A�_�̗܂Ƃ��Ă΂�邻�ꂶ��B";
				mes "�_�̗܂͒P�Ȃ��΂ɂ��炸�B";
				next;
				mes "[�t�����N]";
				mes "�������A�{���ɐ_���������܂Ƃ���";
				mes "�킯�ł͂Ȃ��B���̂悤�Ȉӎu���߂�";
				mes "���݂��Ɠ`�����Ă��邪�A�N�������";
				mes "�������Ƃ��Ȃ��B���������A";
				mes "�X�^�[�W���G���������݂��邩�ǂ���";
				mes "���������ȁB";
				break;
			case 3:
				mes "[�t�����N]";
				mes "����A����́H";
				mes "���̌Ñ㌾�����ǂ��Ă����";
				mes "�������Ƃ��B�قق��A����́B";
				mes "�ق��ق��A�v���Ԃ�ɖʔ�������";
				mes "���肶��킢�B�܂��A�킵�ȊO��";
				mes "����̉�ǂ͖�������낤�āB";
				next;
				mes "[�t�����N]";
				mes "����͂܂������A�Ñ�̐_��";
				mes "�g�����Ƃ����㋉���ꂶ��B";
				mes "�ǂނ����ł����ɍ���Ⴊ�A";
				mes "���̂��Ƃ̉�ǂɂ����Ԃ�";
				mes "�����肻������B";
				next;
				mes "[�t�����N]";
				mes "�悵�I";
				mes "���������A���O�����ꂽ���̊ዾ��";
				mes "�ǂ�ł݂�Ƃ��悤�B";
				mes "�܂���ŗ��邪�����B";
				delitem 2203,1;
				delitem 7275,1;
				set SIGN_QUE,79;
				close;
			}
		}
	case 79:
		if(rand(50)) {
			mes "[�t�����N]";
			mes "��c�c�������A���O���B";
			mes "���̌Ñ㌾��A���������Ȃ��̂�������";
			mes "��ǂɂ͂܂����Ԃ������肻������B";
			mes "�����������Ԃ�����񂩁B";
			close;
		}
		mes "[�t�����N]";
		mes "�����A���傤�ǉ�ǂ��I��������B";
		mes "���Ȃ����P�ꂪ�����ĂȁA";
		mes "����ȂɎ��Ԃ��������Ă��܂����B";
		mes "�������A���̓��e�͏ے��I�����āA";
		mes "�ǂ������Ӗ��������ł��Ȃ�����";
		mes "�m��񂼁B";
		next;
		mes "[�t�����N]";
		mes "�����A�|�󕶂͂��ꂶ��B";
		mes "�v���Ԃ�Ɍ����Ñ㌾�ꂾ������";
		mes "�y���܂��Ă���������B";
		mes "�z�b�z�b�B";
		set SIGN_QUE,80;
		getitem 7274,1;
		close;
	default:
		mes "[�t�����N]";
		mes "���̐��ɂ́A�܂���������Ă��Ȃ�";
		mes "��Ղ�s�v�c�ȗ͂������Ă���B";
		mes "�����āA����炪�������A";
		mes "�����������̂�ǂ����߂�l��";
		mes "������񂶂�B";
		close;
	}
}

gef_fild07.gat,182,241,0	script	#himinnwarp	111,1,1,{
	if(SIGN_QUE != 80 || countitem(907) < 4 || countitem(953) < 12 || countitem(7013) < 365)
		end;
	mes "^6B8E23���Ȃ��̉��ɂ���";
	mes "�X�^�[�W���G���������ɋP���n�߂��B";
	mes "�������傾�낤���H";
	mes "�ߕt���Ă݂悤�B^000000";
	close;
OnTouch:
	if(SIGN_QUE == 203) {
		mes "�����N����Ȃ��c�c";
		close;
	}
	if(SIGN_QUE > 80) {
		warp "himinn.gat",49,10;
		end;
	}
	if(SIGN_QUE != 80 || countitem(907) < 4 || countitem(953) < 12 || countitem(7013) < 365)
		end;
	misceffect 58,"";
	mes "�ˑR�A���Ȃ��̉��ɂ���";
	mes "�X�^�[�W���G���ƌÖ؂̘I�A��̐S��";
	mes "�T���S�������P���o�����I";
	next;
	misceffect 9,"";
	mes "�����āA���Ȃ��̑̂�";
	mes "�_��I�Ȍ��ɕ�܂ꂽ�B";
	next;
	misceffect 99,"";
	mes "�u�ԁAῂ�������ʂɍL����";
	mes "���Ȃ��͋C���������c�c";
	next;
	delitem 907,4;
	delitem 953,12;
	delitem 7013,365;
	set SIGN_QUE,81;
	warp "himinn.gat",49,10;
	end;
}

himinn.gat,48,86,5	script	���@���L���[	811,{
	if(SIGN_QUE < 81) {

	}
	switch(SIGN_QUE) {
	case 81:
		mes "[���@���L���[]";
		mes "�悤�����A���n�ցB";
		mes "���Ȃ������A�����̗E�C����������";
		mes "�������������󂯂�ҁc�c";
		mes "���̎����̌��A�X�^�[�W���G����";
		mes "���ҁc�c";
		next;
		mes "[���@���L���[]";
		mes "�������A�E�C�������ɂ́A�܂���������";
		mes "��ւ��҂��Ă��܂��B";
		mes "�M���́A���ꂩ��X�ɉߍ��Ȏ�����";
		mes "�ς��Ȃ���΂Ȃ�܂���B";
		next;
		mes "[���@���L���[]";
		mes "���̌���ɑI�΂�邽�߁A���Ȃ���";
		mes "�܂������̗E�C�������˂΂Ȃ�܂���B";
		mes "���܂ŁA�������̎҂��������A������";
		mes "���̂��߂ɓ|��Ă䂫�܂������c�c";
		next;
		mes "[���@���L���[]";
		mes "�ނ炪�F�A���̌���ɑI�΂�A";
		mes "�j�����󂯂Ȃ��琶�������Ƃ��c�c";
		mes "^FF0000�d�X���������͂����鎀��";
		mes "�������A�j���������󂯂邱�Ƃ�";
		mes "�ł��Ȃ��̂ł��B^000000";
		next;
		mes "[���@���L���[]";
		mes "^FF0000������B��������҂̏ꏊ^000000��";
		mes "�K��Ȃ����B";
		mes "�ނ�́A�����B�ɐ����Ȃ���������";
		mes "�������ĕ���ł���M�������āA";
		mes "�i�݉��ނł��傤�B";
		next;
		mes "[���@���L���[]";
		mes "����ɑł������Ƃ��ł���΁A";
		mes "����Ȃ鎎���ւ̔����J���͂��ł��B";
		mes "�����ŏؖ����Ă��������B";
		mes "�M���̗͂��A�M���̗E�C���B";
		next;
		mes "[���@���L���[]";
		mes "�P�������ɂ߂�̂́A";
		mes "�M�����g�ł��B";
		set SIGN_QUE,82;
		percentheal 100,100;
		if(checkre()) {
			if(BaseLevel > 90) getexp 35000,0;
			else if(BaseLevel > 85) getexp 21000,0;
			else if(BaseLevel > 80) getexp 16000,0;
			else if(BaseLevel > 75) getexp 12000,0;
			else if(BaseLevel > 70) getexp 7000,0;
			else if(BaseLevel > 65) getexp 3500,0;
			else if(BaseLevel > 60) getexp 2000,0;
			else if(BaseLevel > 55) getexp 1200,0;
			else getexp 900,0;
		}
		else {
			if(BaseLevel > 90) getexp 350000,0;
			else if(BaseLevel > 85) getexp 210000,0;
			else if(BaseLevel > 80) getexp 160000,0;
			else if(BaseLevel > 75) getexp 120000,0;
			else if(BaseLevel > 70) getexp 70000,0;
			else if(BaseLevel > 65) getexp 35000,0;
			else if(BaseLevel > 60) getexp 20000,0;
			else if(BaseLevel > 55) getexp 12000,0;
			else getexp 9000,0;
		}
		close2;
		warp "geffen.gat",120,100;
		end;
	case 95:
		mes "[���@���L���[]";
		mes "�����ł��邱�Ƃ́A�_�X�̏j����";
		mes "�����M���Ƌ��ɂ���悤�A�F�邾���B";
		next;
		mes "[���@���L���[]";
		mes "�M���������̐M�O�������A�ڕW��";
		mes "�������ׂɁA���͂������A�_��";
		mes "�M���Ɋ����邱�Ƃ͏o���܂���B";
		next;
		mes "[���@���L���[]";
		mes "�_���]��ł���͖̂ӖړI��";
		mes "�Ǐ]�ł͂Ȃ��A�����ōl���A�M���鎖�B";
		next;
		mes "[���@���L���[]";
		mes "�ǂ����A���������Ă��������B";
		mes "������肤���ƁA���ꂪ�����B��";
		mes "�ł��鎖�c�c";
		set SIGN_QUE,96;
		close;
	case 129:
	case 130:
		mes "[���@���L���[]";
		mes "�M���͎����ɗ����������A";
		mes "�������̎����ɑł������܂����B";
		mes "�_�X�̐Ղ�ǂ��Ȃ���A�łɒ���";
		mes "���҂̐��E�ŁA���̌����������Ɩ���";
		mes "�ِ��E�̐N�����玩���̐��E��";
		mes "��蔲���܂����B";
		next;
		mes "[���@���L���[]";
		mes "�_�́A�M���̈ӎu�ƗE�C�������A";
		mes "���ʁA���@���n���֓��邱�Ƃ�";
		mes "������܂����B�������A�M���͂܂�";
		mes "�~�b�h�K���h�ɕK�v�ȑ��݁B";
		next;
		mes "[���@���L���[]";
		mes "����āA�M����The Sign�������܂��B";
		mes "����́A���Ȃ����I�΂ꂽ�E�҂ł���A";
		mes "���̗E�C�����������Ƃ̏؂ł��B";
		next;
		mes "[���@���L���[]";
		mes "�M�����A�~�b�h�K���h��������A";
		mes "The Sign�ɂ��A���@���n����";
		mes "���邱�Ƃ��ł���ł��傤�B";
		set SIGN_QUE,137;
		getitem 7314,1;
		close;
	case 200:
	case 201:
		mes "[���@���L���[]";
		mes "�M���̗E�C�������Ȃ����B";
		mes "���ꂪ�B�������΁A�M����";
		mes "�I�΂ꂵ�҂ƂȂ�ł��傤�B";
		close;
	case 202:
		mes "[���@���L���[]";
		mes "�_�X�͋M���̈ӎu�A�I���A������";
		mes "�E�C�������A���]���܂����B";
		mes "�M���ɁA�䓙�����n���@���n����";
		mes "���鎑�i�͂���܂���B";
		next;
		mes "[���@���L���[]";
		mes "����ȏ�A������K��邱�Ƃ�";
		mes "�����܂���B";
		next;
		mes "[���@���L���[]";
		mes "����ł́c�c";
		set SIGN_QUE,203;
		close;
	default:
		if(SIGN_QUE < 95) {
			mes "[���@���L���[]";
			mes "���̌�͂������ł����H";
			mes "���҂̕�炷�ꏊ�𗷂���̂́A";
			mes "���҂ɂƂ��đ�ςł��傤�B";
			close;
		}
		if(SIGN_QUE < 150) {
			mes "[���@���L���[]";
			mes "�_�X�����Ȃ���������Ă���܂��B";
			mes "�M���̗E�C�������Ă��������B";
			mes "���ꂪ�B�������΁A�M����";
			mes "�I�΂ꂵ�҂ƂȂ�ł��傤�B";
			close;
		}
		mes "[���@���L���[]";
		mes "�����͉^���ɓ����ꂽ�҂̂݁A";
		mes "���邱�Ƃ��������ꏊ�B";
		mes "�����Ȃ���@��";
		mes "���������킩��܂��񂪁A";
		mes "�����ɗ������邪�ǂ��ł��傤�B";
		close2;
		warp "gef_fild07.gat",180,242;
		end;
	}
}

//============================================================
// ��3��
//------------------------------------------------------------
niflheim.gat,313,70,4	script	���Â��ȏ���	90,{
	if(SIGN_QUE < 82) {
		mes "[�Z����]";
		mes "���Ȃ��́A�����T���Ă���";
		mes "�l����Ȃ��c�c";
		mes "���߂�Ȃ����c�c";
		close;
	}
	switch(SIGN_QUE) {
	case 82:
		mes "[�Z����]";
		mes "�������s������A�ǂ������̘b��";
		mes "�����Ă��������B���́A���Ȃ���";
		mes "�悤�Ȍ���������ƒT���Ă��܂����B";
		mes "���Ȃ��̂悤�ȁA�����̗E�C��";
		mes "�������߂ɗ����d�˂Ă�������c�c";
		next;
		mes "[�Z����]";
		mes "���̎��ƌ������́A�����l�܂肻����";
		mes "�Èł̒��A���Ȃ��̎p�͋����M�O��";
		mes "���ӂꖾ�邭�P���Ă��܂��B";
		mes "�ǂ����A���̘b�𕷂��Ă��������B";
		next;
		if(select("���ɂ͂��ׂ����Ƃ�����܂�","�����A�����܂��傤")==1) {
			mes "[�Z����]";
			mes "�����A����ł������c�c";
			mes "��������Ɏv���A�ق�̂킸���ł�";
			mes "���Ԃ�����������΂Ɓc�c";
			mes "�ł��A�h���Ɍ��������Ƃ���";
			mes "���̌ł��ӎu���A���̂悤�Ȏ҂ׂ̈�";
			mes "�ς킹�邱�Ƃ͂ł��܂���ˁc�c";
			next;
			mes "[�Z����]";
			mes "�ǂ����c�c";
			mes "�����A���Ԃ��o���܂�����c�c";
			mes "���̎��ɂł����̘b�𕷂��Ă��������B";
			mes "���肢���܂��c�c";
			close;
		}
		mes "[�Z����]";
		mes "�����A���肪�Ƃ��������܂��B";
		next;
		mes "[�Z����]";
		mes "���Ƃ������݂́A���̏ꏊ��";
		mes "�Ȃ��߂Ȃ��ł��܂��B����Ȏ��̖]�݂�";
		mes "���Ȃ��ƈꏏ�Ƀ��@���L���[�̎�����";
		mes "�󂯁A��������o�邱�Ƃł��c�c";
		next;
		if(select("�������ǁc�c","������܂����A��`���܂��傤")==1) {
			mes "[�Z����]";
			mes "�����A����ł������c�c";
			mes "��������Ɏv���A�ق�̂킸���ł�";
			mes "���Ԃ�����������΂Ɓc�c";
			mes "�ł��A�h���Ɍ��������Ƃ���";
			mes "���̌ł��ӎu���A���̂悤�Ȏ҂ׂ̈�";
			mes "�ς킹�邱�Ƃ͂ł��܂���ˁc�c";
			next;
			mes "[�Z����]";
			mes "�ǂ����c�c";
			mes "�����A���Ԃ��o���܂�����c�c";
			mes "���̎��ɂł����̘b�𕷂��Ă��������B";
			mes "���肢���܂��c�c";
			close;
		}
		mes "[�Z����]";
		mes "�����A���肪�Ƃ��������܂��B";
		mes "�����A�����ɂ͂��܂�ɂ��A����";
		mes "�����悤�ȕ��������c�c���̕���";
		mes "�����Ă��������Ȃ��ł��傤���H";
		next;
		if(select("������܂���","�ǂ����āH")==1) {
			mes "[�Z����]";
			mes "�����A���肪�Ƃ��������܂��B";
			mes "�����Ɣނ�́A�����Ă������";
			mes "�[�����ӂ̋C�����Ƌ��ɖ����";
			mes "�����Ƃ��ł���ł��傤�B";
			next;
			mes "[�Z����]";
			mes "�{���Ɋ��ӂ��܂��c�c";
			mes "���Ȃ��͂Ȃ�ƐS�D�����̂ł��傤�B�c�c";
			mes "�ǂ����A�ނ�ɂ������t��������";
			mes "�����Ă��������B";
			mes "���ɂ��Ă����������悤�ɁA�ǂ����B";
			set SIGN_QUE,83;
			close;
		}
		mes "[�Z����]";
		mes "�����A���߂�Ȃ����c�c";
		mes "������`���Ă������邾���ł�";
		mes "����ł���̂ɁA����ȏ��";
		mes "���肢����̂́A�~�[���Ƃ���";
		mes "���̂ł��ˁc�c";
		mes "����ł��A���ӂ��܂��c�c";
		set SIGN_QUE,84;
		close;
	case 83:
		if(SIGN_SUBQUE < 8) {
			mes "[�Z����]";
			mes "�ǂ����A�ނ�ɂ������t��������";
			mes "�����Ă��������B";
			mes "���ɂ��Ă����������悤�ɁA�ǂ����B";
			close;
		}
		mes "[�Z����]";
		mes "��`���Ă��������āA�{����";
		mes "���肪�Ƃ��������܂��B";
		mes "����ɁA���̎w�ւ������グ�܂��B";
		next;
		mes "[�Z����]";
		mes "����́A���Ɏc���ꂽ�Ō�̕󕨁c�c";
		mes "���Ȃ��ɂƂ��Ă͉��l�̂Ȃ����̂���";
		mes "����܂��񂪁A�ǂ����A�󂯎����";
		mes "���������B";
		next;
		mes "[�Z����]";
		mes "���̎w�ւ́A���Ȃ��̖ړI��";
		mes "�B�������܂ł́A���̎w��";
		mes "�͂߂��ɑ�؂Ɏ����Ă���";
		mes "���������B�����̖��ɗ�����";
		mes "����܂���c�c";
		set SIGN_QUE,85;
		set SIGN_SUBQUE,0;
		getitem 2642,1;
		close;
	case 84:
		mes "[�Z����]";
		mes "�����ɂ́A���̕��X�ƈႤ���͋C��";
		mes "�������܂��B���̕��Ƙb���Ă݂�";
		mes "���������B";
		set SIGN_QUE,87;
		close;
	case 85:
		mes "[�Z����]";
		mes "���ɁA��V���l�����܂��B";
		mes "�ނ̉̐��͊Ô��Ŏ₵���̂ł��B";
		mes "�ނ́A���Ȃ��̂悤�ȕʂ̏ꏊ���痈��";
		mes "�l�̎���w���܂��B";
		next;
		mes "[�Z����]";
		mes "�����ƁA�ނ͂��Ȃ��̖��ɗ����Ƃ�";
		mes "�m���Ă��܂��B";
		set SIGN_QUE,86;
		close;
	case 86:
	case 87:
	case 88:
	case 89:
	case 90:
	case 91:
		mes "[�Z����]";
		mes "�����ɐ���������������Ⴂ�܂���";
		mes "�u�͖��������������܂������H";
		close;
	case 92:
		mes "[�Z����]";
		mes "�����ɐ���������������Ⴂ�܂���";
		mes "�u�͖��������������܂������H";
		next;
		mes "[�Z����]";
		if(countitem(2642)) {
			mes "��ɂ̒��ł��߂��Ă�������";
			mes "�����Ă��������Ċ��ӂ��Ă��܂��B";
		}
		mes "�Ƃ���Łc�c�Ȃɂ����ɗp��";
		mes "����悤�ł��ˁB";
		next;
		if(select("������","���҂̎�ɂ��Ēm�肽��")==1) {
			mes "[�Z����]";
			mes "�Ȃɂ������������Ƃł��o������";
			mes "���񂢂炵�Ă��������B";
			mes "���Ȃ��̂����ɗ��������̂ł��B";
			close;
		}
		mes "[�Z����]";
		mes "���҂̎�́A�j�u���w�C����";
		mes "���҂̍Ԃ����߂�̑�ȕ��ł��B";
		next;
		mes "[�Z����]";
		mes "�ޏ��́A���L�Ƌ��l�A���O���{�_�̊Ԃ�";
		mes "�Y�܂ꂽ�����q�ŁA�I�[�f�B���̖���";
		mes "�����Ŏ��҂����߂�悤�ɂȂ�܂����B";
		next;
		mes "[�Z����]";
		mes "���X�A�ޏ��͎��҂̍Ԃ���o�Ă���";
		mes "�j�u���w�C����������Ă��܂��B";
		mes "�����m���Ă���̂́A���ꂭ�炢";
		mes "�ł����c�c";
		next;
		menu "��ɂ��Ēm��܂���",-;
		mes "[�Z����]";
		mes "����́A��̐��E�̏ے���";
		mes "�Ă΂�Ă��āA���҂̎傪�g����";
		mes "�����������Ă��邻���ł��B";
		mes "�I�[�f�B������󂯂��A���҂����߂�";
		mes "�ے��ł�����܂�����B";
		next;
		mes "[�Z����]";
		mes "�������A���̈�͎��҂����߂�ے�";
		mes "�ȊO�ɂ��A����Ӗ��������Ă���Ƃ�";
		mes "�\������܂��B���ꂪ���Ȃ̂���";
		mes "������܂��񂯂ǁc�c";
		next;
		menu "�A���O���{�_�ɂ��ẮH",-;
		mes "[�Z����]";
		mes "�A���O���{�_�͎��҂̎�̕�ł��B";
		mes "�ޏ����_�X�ɂ��߂��ꂽ��A";
		mes "�ޏ��Ɣޏ����Y��3�l�̎q����";
		mes "�_�ɂ��f�v����܂����B";
		next;
		mes "[�Z����]";
		mes "���������̌�A�ޏ����ǂ��Ȃ�����";
		mes "�N���m��܂���c�c";
		next;
		menu "�����ɂ��ẮH",-;
		mes "[�Z����]";
		mes "�����́A�����ƂĂ�";
		mes "����ł���������悤�ł��B";
		next;
		mes "[�Z����]";
		mes "�����A�����ɓK���ł����ɂ��邩��";
		mes "���҂Ƃ��āA�����ɋ��鎑�i���Ȃ���";
		mes "�v���Ă���̂ł��傤���c�c";
		next;
		emotion 9;
		mes "[�Z����]";
		mes "�Ȃ̂ŁA��������";
		mes "�������Ă���悤�Ȃ̂ł��B";
		mes "�ł��A�d���Ȃ��ł��B";
		mes "�����ł��A���͂�����";
		mes "�����킵���Ȃ��Ǝv���Ă��܂�����B";
		set SIGN_QUE,93;
		close;
	case 93:
		mes "[�Z����]";
		mes "���A���݂܂���B";
		mes "�b�����ł��܂��܂����ˁB";
		mes "�c�O�Ȃ���A����ȏ���ɗ���������";
		mes "���b�͒m��Ȃ���ł��B";
		next;
		mes "[�Z����]";
		mes "�����������̂́A���҂̎傪";
		mes "�ޏ��̕��T���Ă���Ƃ����̂Ȃ�";
		mes "�A���O���{�_�́A�܂������";
		mes "���Ȃ��̂ł��傤�B";
		next;
		emotion 9;
		mes "[�Z����]";
		mes "�������́A�Ȃ�炩�̗��R��";
		mes "�����j�u���w�C���ɗ��ꂸ�ɂ��邩�c�c";
		mes "�ǂ���ɂ���A���҂̎�ɂƂ���";
		mes "�]�܂������Ƃł͂���܂���ˁc�c";
		set SIGN_QUE,94;
		close;
	case 94:
		mes "[�Z����]";
		mes "�����m���Ă��邱�Ƃ́A�����S��";
		mes "���b�����܂����B���߂�Ȃ����c�c";
		mes "���܂肨���ɗ��ĂȂ������悤�ł��ˁB";
		next;
		mes "[�Z����]";
		mes "���́A�A���O���{�_�Ɋւ��Ă�";
		mes "�ޏ���߂炦���_�ɋ߂����݂���";
		mes "�������Ƃ��ł���̂ł�";
		mes "�Ȃ��ł��傤���B";
		next;
		mes "[�Z����]";
		mes "���@���L���[�Ƃ�";
		mes "�A�X�K���h�̕��Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "���́A�����o���܂�����������܂���";
		mes "��̐��E�̏ے����~�������R��";
		mes "�����Ă��炦�Ȃ��̂ł��傤���H";
		next;
		mes "[�Z����]";
		mes "��̐��E�̏ے��́A�ƂĂ�";
		mes "�댯�ȕi�ł��B";
		mes "����𓾂�Ƃ��āA���������";
		mes "�g���̂ł��傤�B";
		next;
		mes "[�Z����]";
		mes "�������ꂪ�A�����Ӑ}���������l�̎��";
		mes "�n������c�c";
		next;
		if(select("�n������H","�����łȂ�Ƃ����܂�")==2) {
			mes "[�Z����]";
			mes "���A���߂�Ȃ����B";
			mes "�����ł���΂邱�Ƃł�";
			mes "����܂���ł����ˁc�c";
			set SIGN_QUE,95;
			close;
		}
		mes "[�Z����]";
		mes "�j�u���w�C���ł́A���̋�ɂ�";
		mes "�ꂵ�񂾂������A�ǂ��Ȃ�����";
		mes "�l��������������܂��B";
		next;
		mes "[�Z����]";
		mes "����ȕ�����̐��E�̏ے���";
		mes "��ɓ��ꂽ�牽���N���邩";
		mes "�킩��܂���c�c";
		next;
		if(select("����ł́A�ǂ�����΁c�c","�����͊��ӂ��܂����c�c")==2) {
			mes "[�Z����]";
			mes "�����ł����c�c";
			set SIGN_QUE,95;
			close;
		}
		mes "[�Z����]";
		mes "��̐��E�̏ے�����ɓ��ꂽ��";
		mes "�܂������Ɏ��ɉ�ɗ��Ă��������B";
		next;
		mes "[�Z����]";
		mes "�����ł��鐸��t�̂��Ƃ�";
		mes "���Ă������������Ǝv���܂��B";
		next;
		menu "�l���Ă݂܂�",-;
		mes "[�Z����]";
		mes "����ł́A���҂����Ă܂��B";
		set SIGN_QUE,95;
		close;
	case 118:
		mes "[�Z����]";
		mes "���ꂪ�A��̐��E�̏ے��c�c";
		mes "�w���l���炱��������������Ȃ�āA";
		mes "�{���ɐ������ł��B";
		next;
		mes "[�Z����]";
		mes "�ł��A�����1�񂵂�";
		mes "�g���Ȃ��̂ł��ˁc�c";
		next;
		mes "[�Z����]";
		mes "����ł́A���ꂩ�炠�Ȃ���";
		mes "�������ׂ������b�����܂��傤�B";
		next;
		menu "�������Ă�������",-;
		mes "[�Z����]";
		mes "���Ȃ��́A�I�΂ꂵ�҂ƂȂ邽��";
		mes "�E�C�������ׂ��A���@���L���[��";
		mes "���t�ɂ��A�����ւ�������Ⴂ";
		mes "�܂����B";
		next;
		mes "[�Z����]";
		mes "�����āA�����̈˗����󂯂�";
		mes "���̈�𓾂��c�c";
		mes "���̍l���������܂��B";
		next;
		mes "[�Z����]";
		mes "���́A���b�c����̈Ӑ}���܂�";
		mes "���������͂Ȃ��ł��傤���H";
		mes "���̂悤�ȋ���ȗ͂�n�����Ƃ��āA";
		mes "�������邾���Ŗ�������ł��傤���H";
		next;
		mes "[�Z����]";
		mes "�ނ́A���Ȃ��𗘗p���Ă���̂ł�";
		mes "�Ȃ��ł����H";
		next;
		mes "[�Z����]";
		mes "�����������ł��B";
		mes "�ޏ��́A�Ȃ����ꂪ�K�v�Ȃ̂�";
		mes "�������Ȃ������̂ł��傤�B";
		next;
		mes "[�Z����]";
		mes "���̈�́A���̎��҂̐��E��";
		mes "�Z�l�ɂƂ��Đ�ΓI�ȗ͂ł��B";
		mes "�����͉��������ŁA�����";
		mes "��ɓ���ė~�����Ɨ��񂾂̂���";
		mes "�m��܂���B";
		next;
		if(select("�ł́A�ǂ�����΂����H","�M�����܂���")==2) {
			mes "[�Z����]";
			mes "�����ł��ˁc�c";
			mes "����́A���̗\�z�ɉ߂��܂��񂵁c�c";
			next;
			mes "[�Z����]";
			mes "�ł����́A���Ȃ����S�z�Ȃ�ł��B";
			mes "�ǂ����A���������������B";
			close;
		}
		mes "[�Z����]";
		mes "������A�����Ɏ����Ă����Ă�";
		mes "�Ȃ�܂���B�B";
		mes "�ޏ����A��������ɗ��p���邩";
		mes "�킩��Ȃ��Ȃ�A��΂ɓn���Ă�";
		mes "�����܂���B";
		next;
		mes "[�Z����]";
		mes "���̘b�����āA�P�Ȃ�\����";
		mes "����܂��񂵁c�c";
		set SIGN_QUE,131;
		close;
	case 129:
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		if(countitem(2643) < 1) {
			emotion 28;
			close;
		}
		if(select("�w�ցA�Ԃ��ɗ�����","�c�c")==2) {
			emotion 28;
			close;
		}
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes strcharinfo(0)+ "����c�c";
		mes "�Y��c�c�Ȃ������c�c";
		mes "���Ȃ������́c�c";
		next;
		mes "[�Z����]";
		mes "���ɑ΂��鎷�����c�c";
		mes "���̎v���o���c�c";
		mes "�S���Y�ꂽ���ǁc�c";
		next;
		mes "[�Z����]";
		mes "���Ȃ������́c�c";
		mes "�Y��Ȃ��c�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "���Ɂc�c�c�������́c�c";
		mes "���Ȃ��Ɓc�c���Ȃ��̎v���o���c�c";
		mes "�l�܂��Ă���w�ցc�c";
		mes "�厖�Ɂc�c���Ăˁc�c";
		mes "�c�c���肪�Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "�{���ɂ��肪�Ƃ��c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		mes "�c�c";
		next;
		mes "�ޏ��̖ڂ́A�����h����";
		mes "�����󋕂Ȉł����߂Ă���c�c";
		next;
		mes "�������A�ޏ��͈ȑO�̂悤��";
		mes "�₵���ɁA�߂����Ɍ����Ȃ��B";
		mes "�ޏ��̖j���A��؂ׂ̍�����";
		mes "���ꂽ�c�c";
		next;
		mes "�ޏ��̐O�́A�������͂ɂ��ނ悤��";
		mes "���΂�ł���B";
		mes "���Ȃ��Ƃ̎v���o��";
		mes "��ɋP���w�ւƈꏏ�ɂ������c�c";
		delitem 2643,1;
		if(checkre())
			getexp 50000,0;
		else
			getexp 500000,0;
		close;
	case 130:
		emotion 28;
		mes "[�Z����]";
		mes "�c�c�c�c";
		next;
		emotion 9;
		mes "[�Z����]";
		mes "�c�c�c�c";
		next;
		emotion 9;
		mes "[�Z����]";
		mes "�c�c�c�c";
		next;
		emotion 28;
		mes "[�Z����]";
		mes "�c�c�c�c";
		close;
	case 131:
		mes "[�Z����]";
		mes "�c�c�c�c";
		next;
		menu "���́A�\���āH",-;
		mes "[�Z����]";
		mes "�����͍ŋ߁A�������^����������";
		mes "�ʉ߂����҂�I��ŉ���Ă��܂��B";
		next;
		mes "[�Z����]";
		mes "�\�ł́A�ޏ��͋���ȗ͂�";
		mes "��ɓ���邽�߁A���鏀����";
		mes "���Ă���炵���̂ł��B";
		mes "�����A���E�̉��_�[�N���[�h��";
		mes "�������邽�߂̏������c�c";
		next;
		menu "�ڂ����������Ă�������",-;
		mes "[�Z����]";
		mes "�_�[�N���[�h�͈يE�̖����B";
		mes "���̗͂́A�ƂĂ�����ŁA";
		mes "�ƂĂ����낵�����̂ł��B";
		next;
		mes "[�Z����]";
		mes "�������A�ނ��يE���z���ė��邽�߂ɂ�";
		mes "���̋���ȗ͂̂قƂ�ǂ�";
		mes "�g��Ȃ���΂Ȃ�Ȃ���A";
		mes "��������̖����h��~�b�h�K���h�́A";
		mes "�ނɂƂ��čň��̊��ł��B";
		next;
		mes "[�Z����]";
		mes "�Ȃ̂ŁA�z���ė����Ƃ��Ă��A";
		mes "�_�[�N���[�h�͂��̗͂̔�����";
		mes "�������邱�Ƃ��o���܂���B";
		mes "����ł��A�ނ͂����ƃ~�b�h�K���h��";
		mes "�_���Ă���̂ł��B";
		next;
		mes "[�Z����]";
		mes "����ȃ_�[�N���[�h�ɂƂ��āA";
		mes "�j�u���w�C���͍œK�̏ꏊ�ł��B";
		mes "�����͎��҂̐��E�Ȃ̂ŁA";
		mes "�ނ̐��E�ɋ߂����̂�����܂��B";
		next;
		mes "[�Z����]";
		mes "�܂�A�_�[�N���[�h�{���̗͂�";
		mes "�������₷�����Ȃ̂ł��B";
		next;
		mes "[�Z����]";
		mes "�����A�ނ������j�u���w�C����";
		mes "�����Ă��܂�����c�c�ނ͂�����";
		mes "�~�b�h�K���h��ڎw���ł��傤�B";
		mes "�����Ĕނ̗͂ɂ���āA�~�b�h�K���h��";
		mes "���̐��E�ɂȂ��Ă��܂��c�c";
		next;
		menu "�w���́H",-;
		mes "[�Z����]";
		mes "�w���l���A�������Ă���Ǝv���̂ł��B";
		mes "�ł��A�_�[�N���[�h���~�b�h�K���h��";
		mes "�����̖���D�����Ƃ��Ă��A�����";
		mes "�j�u���w�C���̏Z�l�A���Ȃ킿�A";
		mes "�w���l�̖��������邱�ƂɂȂ�܂��B";
		next;
		mes "[�Z����]";
		mes "������A�������Ă���̂ł�";
		mes "�Ȃ��ł��傤���B";
		next;
		mes "[�Z����]";
		mes "����ɁA�_�[�N���[�h���_���Ă���̂�";
		mes "�~�b�h�K���h�B";
		mes "�j�u���w�C���ł͂���܂���c�c";
		next;
		menu "�ǂ�����΂����H",-;
		mes "[�Z����]";
		mes "�����̌v����~�߂Ȃ���΂Ȃ�܂���B";
		mes "�ޏ����_�[�N���[�h������������";
		mes "�~�b�h�K���h�͖ŖS���Ă��܂��܂��B";
		next;
		mes "[�Z����]";
		mes "�ޏ��̑_���́A�_�[�N���[�h��";
		mes "������ɏ������A����ɉ����肢��";
		mes "���Ȃ��Ă��炤���Ƃł��B";
		mes "�����Ă��̂��߂ɂ́A";
		mes "�����p�̖����w���K�v�ł��B";
		next;
		mes "[�Z����]";
		mes "����́A�����ƃj�u���w�C����";
		mes "�ǂ����ɂ���܂��B";
		next;
		menu "�ǂ��H",-;
		mes "[�Z����]";
		mes "���́A���O�̓E�B�U�[�h�ł����B";
		mes "�Ȃ̂ŁA�����w�ɂ��ďڂ���";
		mes "�m���Ă��܂��B";
		next;
		mes "[�Z����]";
		mes "�M�����k�J�́A�_�[�N���[�h��";
		mes "�����ł���قǋ���Ȗ����w��";
		mes "�`�����Ԃ�����܂���B";
		mes "�j�u���w�C���̊X�ł́A�l�ڂ�";
		mes "�������܂��B";
		next;
		mes "[�Z����]";
		mes "���l�̖ڂ�����A����Ȗ����w��";
		mes "�����ł���ꏊ�c�c�S�����肪";
		mes "����܂��B";
		mes "�����ցA�ꏏ�ɍs���Ă��������B";
		set SIGN_QUE,132;
		close;
	case 132:
		if(getnpctimer(1,"SignTimer#serin")) {
			mes "[�Z����]";
			mes "���������������鎞�Ԃ����������B";
			close;
		}
		mes "[�Z����]";
		mes "����ł͏o�����܂��傤���H";
		next;
		if(select("�͂�","����������Ƒ҂���")==2)
			close;
		mes "[�Z����]";
		mes "�ł́A�s���܂��傤�B";
		close2;
		initnpctimer "SignTimer#serin";
		warp "que_sign01.gat",199,36;
		end;
	case 133:
	case 134:
	case 199:
		mes "�Z�����̍��Ղ��c���Ă���B";
		if(getnpctimer(1,"SignTimer#serin")) {
			close;
		}
		next;
		if(select("���Ղ�ǂ�","��������")==2)
			close;
		close2;
		set SIGN_QUE,199;
		initnpctimer "SignTimer#serin";
		warp "que_sign01.gat",199,36;
		end;
	case 135:
	case 136:
		emotion 9;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c�c";
		mes "�N�c�c";
		mes "�c�c�c�c�c";
		close;
	default:
		if(SIGN_QUE < 118) {
			mes "[�Z����]";
			mes "�������ɓ��ꂽ��A�K�����ɉ��";
			mes "���Ă��������B�S�ǂ��Ȃ��҂ɂ��ꂪ";
			mes "�n���Ă��܂��ẮA��ςȂ��Ƃ�";
			mes "�Ȃ�܂��B";
			next;
			mes "[�Z����]";
			mes "�ǂ����A���肢���܂��c�c";
			close;
		}
		if(SIGN_QUE < 129) {
			mes "�Z�����̎c���ꂽ�הO��";
			mes "�ޏ��̌`���`�����Ă���B";
			close;
		}
		if(SIGN_QUE > 199) {
			mes "�ޏ��̍��Ղ������c���Ă���B";
			mes "�c�c�c�c�c";
			mes "�ޏ��͂ǂ��Ȃ������낤�c�c";
			mes "�c�c�c�c�c";
			if(countitem(2642)) {
				next;
				mes "���Ȃ��������Ă���";
				mes "�Z�����̎w�ւ��A";
				mes "���Ƌ��ɏ������c�c";
				delitem 2642,1;
			}
			close;
		}
		if(countitem(2642) < 1) {
			emotion 9;
			mes "[�Z����]";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c";
			close;
		}
		emotion 28;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		delitem 2642,1;
		next;
		mes "�Z�����͎����̎w�ւ�����";
		mes "�������c�c";
		close;
	}
}

niflheim.gat,350,258,1	script	#���ꂽ��	844,3,3,{
OnTouch:
	if((SIGN_QUE != 83 && SIGN_QUE != 90) || SIGN_SUBQUE != 0)
		end;
	killmonster "niflheim.gat","nif_soul";
	mes "[�A�b�V���u���[�X]";
	mes "����ɂ͋����􂢂�������!!!!";
	mes "�킵�͂���̑��݂����ۂ���!!!!";
	mes "�����ނ��ʂ̂Ȃ�A����^���悤!!";
	mes "�킵�̑厖�Ȗ{������";
	mes "�G���񂶂�Ȃ�!!!!";
	next;
	switch(select("1�Ԗڂ̖{������Ă݂�","2�Ԗڂ̖{������Ă݂�","3�Ԗڂ̖{������Ă݂�","���ƂȂ����ނ�")) {
	case 1:
		monster "niflheim.gat",349,259,"���C�h���[�h",1478,1,"nif_soul";
		mes "[�A�b�V���u���[�X]";
		mes "���͂͂͂�!!";
		mes "�ނ�݂ɂ킵�̖{��G��邩�炾!!";
		mes "���ݐ؂��A�����􂩂�邪�悢!!";
		mes "�i���̎􂢂Ɏ�����̂�!!";
		close;
	case 2:
		mes "[�A�b�V���u���[�X]";
		mes "�킵�̖{�����ɐG���Ƃ́c�c";
		mes "���X�ɏ�����!!�킵�̋x����";
		mes "�ז�������񂶂�Ȃ�!!";
		close2;
		warp "niflheim.gat",34,162;
		end;
	case 3:
		mes "[�A�b�V���u���[�X]";
		mes "�ʂ����c�c����B";
		mes "���\�A�x��������悤���ȁB";
		mes "�c�c�c�c!!!!";
		mes "�Ȃ�΁c�c��x������";
		mes "�����Ă݂邪�悢�c�c!!";
		next;
		if(select("�N���[�o","�N�����g","�N���C�g�X")==2)
			set '@nif_soul,'@nif_soul+1;
		if(select("�x���g","�x���^�X","�x���^")==3)
			set '@nif_soul,'@nif_soul+1;
		if(select("�l�N�^�C","�l�b�N���X","�l��","^FFFFFF�j�b�N�g^000000")==4)
			set '@nif_soul,'@nif_soul+1;
		if('@nif_soul < 3) {
			monster "niflheim.gat",345,259,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",347,261,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",344,253,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",346,251,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",349,249,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",350,260,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			monster "niflheim.gat",353,256,"�I�[�N�X�P���g��",1462,1,"nif_soul";
			mes "[�A�b�V���u���[�X]";
			mes "���͂͂͂�!!!!";
			mes "����A�������Ԉ���Ă��邼!!";
			mes "����ɕK�v�Ȃ͎̂��̂悤���ȁB";
			mes "�ꐶ�A���ꑱ���邪�悢�c�c!!";
			close;
		}
		if(rand(5) == 0) {
			mes "[�A�b�V���u���[�X]";
			mes "�����͊m���ɐ������c�c�����A";
			mes "����̎􂢂͉����Ȃ��̂��c�c";
			mes "���͂͂͂́c�c!!!!";
			close;
		}
		mes "[�A�b�V���u���[�X]";
		mes "�ʂ���������!!";
		mes "�S�Ă̎􂢂������Ă���!!";
		mes "�����������c�c!!!!";
		next;
		mes "[�A�b�V���u���[�X]";
		mes "�ʂ���������!!";
		mes "�S�Ă̎􂢂������Ă���!!";
		mes "�������邩��Ƃ��ƂƗ�������!!";
		mes "�����������c�c!!!!";
		if(SIGN_QUE == 83)
			set SIGN_SUBQUE,1;
		if(SIGN_QUE == 90)
			set SIGN_QUE,91;
		getitem 7304,1;
		close;
	case 4:
		mes "[�A�b�V���u���[�X]";
		mes "�Ԃ͂͂�!!";
		mes "�悭�l�����悤���ȁc�c";
		mes "���傪�����ɐ����ċA��邱�Ƃ�";
		mes "�킵���F���Ă�낤�B";
		close;
	}
}

nif_in.gat,156,93,0	script	#����	844,2,2,{
OnTouch:
	if(SIGN_QUE != 83) {
		emotion 28;
		mes "[�A���L�i]";
		mes "���������A����`��B";
		mes "���ƂɋA�肽����c�c";
		mes "���������c�c";
		close;
	}
	switch(SIGN_SUBQUE) {
	case 0:
	case 2:
		emotion 28;
		mes "[�A���L�i]";
		mes "����`��B";
		mes "���ƂɋA�肽����c�c";
		close;
	case 1:
		mes "[�A���L�i]";
		mes "��" +(Sex? "�Z": "�o")+ "�����c�c";
		mes "�����͂ǂ��c�c�H";
		mes "���A�ڂ��o�߂��炱���ɂ����́c�c";
		mes "�}�}�c�c�˂��A�}�}�����Ȃ������H";
		mes "�c�c����`��B���ƂɋA�肽����`�B";
		next;
		if(select("�ǂ�����΋A���́H","�A��Ȃ�������߂Ȃ���")==2) {
			mes "[�A���L�i]";
			mes "���������A����`��B";
			mes "���ƂɋA�肽����c�c";
			mes "���������c�c";
			close2;
			emotion 28;
			end;
		}
		mes "[�A���L�i]";
		mes "�킩��Ȃ��c�c";
		mes "���X�K�˂Ă����V���l�̂���������";
		mes "�A�肽���Ȃ疂���ɉ�Ȃ�������";
		mes "�����Ă����ǁA�O��1�l�ŕ����̂́A";
		mes "�ƂĂ��|���́c�c";
		set SIGN_SUBQUE,2;
		close;
	case 3:
	case 4:
		if(countitem(7309) < 1) {
			emotion 28;
			mes "[�A���L�i]";
			mes "����`��B";
			mes "���ƂɋA�肽����c�c";
			mes "�ł��A�����͕|����`�A���������B";
			close;
		}
		mes "[�A���L�i]";
		mes "������g���΋A���́H";
		mes "���肪�Ƃ�!!";
		delitem 7309,countitem(7309);
		set SIGN_SUBQUE,5;
		close;
	case 5:
		emotion 28;
		mes "[�A���L�i]";
		mes "�������c�c";
		mes "�����N���Ȃ��`�B";
		mes "���������A����`��B";
		mes "���ƂɋA�肽����c�c";
		set SIGN_SUBQUE,6;
		close;
	default:
		emotion 28;
		mes "[�A���L�i]";
		mes "�R���c�c";
		mes "�����N���Ȃ��`�B";
		mes "���������A����`��B";
		mes "���ƂɋA�肽����c�c";
		close;
	}
}

nif_in.gat,188,168,0	script	#����	844,2,2,{
OnTouch:
	switch(SIGN_QUE) {
	default:
		if(SIGN_QUE < 88) {
			mes "[�L���P��]";
			mes "�����̊��ʂ�Ȃ��҂�";
			mes "�`���ɂ��̐g�𓊂��邱�Ƃ�";
			mes "����܂��c�c";
			close;
		}
		end;
	case 83:	//�T�u�N�G�X�g��
		break;
	case 88:
		if(countitem(2642) < 1) {
			mes "[�L���P��]";
			mes "�����H";
			mes "�Ȃ��������Ȃ��������Ȃ����";
			mes "�����Ȃ��̂ł��傤�B";
			next;
			if(select("���A���߂�Ȃ���","��������A��������`�����܂�����")==1) {
				emotion 32;
				mes "[�L���P��]";
				mes "�c�c";
				close;
			}
			mes "[�L���P��]";
			mes "�����A�����܂Ō����̂Ȃ�c�c";
			mes "���͈ȑO�A�����̎�������";
			mes "�N�������ݏo���Ă��܂����̂ł��B";
			mes "���̎����������Ԃ���";
			mes "���炦�Ȃ��ł��傤���B";
			next;
			mes "[�L���P��]";
			mes "�ǂ��̒N�����񂾂��́A";
			mes "�킩��܂���c�c�B";
			mes "����ƁA���ɗ��鎞�́A";
			mes "2�K�̏ё���̉E�ɂ���";
			mes "���肩�痈�Ă��������B";
			set SIGN_QUE,90;
			close;
		}
		mes "[�L���P��]";
		mes "��͂�A�P���ȗ��R�ł�����";
		mes "�K�ꂽ�̂ł͂Ȃ������̂ł��ˁB";
		mes "�������ǂ�ȏꏊ���́A";
		mes "�����킩�����Ǝv���܂��B";
		next;
		mes "[�L���P��]";
		mes "�����́A���Ȃ��Ɠ����悤�ɁA";
		mes "�E�C���ؖ����A";
		mes "�I�΂ꂵ�҂ɂȂ낤�Ƃ���";
		mes "���s�����ҒB������ꏊ�B";
		mes "��ɂƌ������̕��B";
		next;
		mes "[�L���P��]";
		mes "�����āA���̊X�ɂ́A�S�Ă̎��҂�";
		mes "�������鎀�҂̎傪���܂��B";
		next;
		mes "[�L���P��]";
		mes "�ޏ��͊Z�őS�g���B���A���܂�A";
		mes "�����̂��߂Ɏp�������̂ł��B";
		mes "���̋����͑��ɗނ����܂���B";
		next;
		mes "[�L���P��]";
		mes "���Ȃ��́c�c";
		next;
		mes "[�L���P��]";
		mes "�c�c�ޏ������𓾂Ȃ����";
		mes "�Ȃ�܂���B";
		next;
		menu "��Ƃ͂Ȃ�ł����H",-;
		mes "[�L���P��]";
		mes "����́c�c";
		mes "�����鎀�҂̎�ł���ے��B";
		next;
		menu "�ǂ����Ă��ꂪ�K�v�Ȃ́H",-;
		mes "[�L���P��]";
		mes "����́A�܂�������킯�ɂ�";
		mes "�����܂���B���̈�������A���Ă���";
		mes "���ɋ����܂��傤�c�c";
		next;
		mes "[�L���P��]";
		mes "��̂��Ƃ́A��΂ɔ閧�ɂ���";
		mes "���������B";
		mes "���̈�͒N�ɂ��n���Ă�";
		mes "�Ȃ�Ȃ����̂ł�����B";
		next;
		if(select("�ǂ����āH","��𓾂���@�́H")==1) {
			mes "[�L���P��]";
			mes "����́A�܂�������킯�ɂ�";
			mes "�����܂���B";
			next;
			menu "��𓾂���@�́H",-;
		}
		mes "[�L���P��]";
		mes "��ԊȒP�Ȃ̂́A�͂Ŏ��҂̎傩��";
		mes "���̈��D�����Ƃł��B";
		mes "�������́A���镨��񋟂��A";
		mes "�����������邱�Ƃł��B";
		next;
		if(select("������܂���","�Ȃɂ�񋟂���΂����H")==1) {
			set SIGN_QUE,89;
			close;
		}
		mes "[�L���P��]";
		mes "�ޏ��ɂ́A�_�X�ɂ��ċւ��ꂽ";
		mes "�ꂪ����Ƃ����܂��B";
		next;
		mes "[�L���P��]";
		mes "�����Ď��҂̎�́c�c";
		mes "��A�A���O���{�_��";
		mes "�T�������Ă��܂��B";
		next;
		mes "[�L���P��]";
		mes "�c�c���ɗ��鎞�́A2�K�̏ё����";
		mes "�E�ɂ�����肩�痈�Ă��������B";
		set SIGN_QUE,92;
		close;
	case 89:
		mes "[�L���P��]";
		mes "�c�c�c�c";
		next;
		menu "�Ȃɂ�񋟂���΂����H",-;
		mes "[�L���P��]";
		mes "�ޏ��ɂ́A�_�X�ɂ��ċւ��ꂽ";
		mes "�ꂪ����Ƃ����܂��B";
		mes "�����Ď��҂̎�́c�c";
		mes "��A�A���O���{�_��";
		mes "�T�������Ă��܂��B";
		next;
		mes "[�L���P��]";
		mes "�c�c���ɗ��鎞�́A";
		mes "2�K�̏ё���̉E�ɂ���";
		mes "���肩�痈�Ă��������B";
		set SIGN_QUE,92;
		close;
	}
	switch(SIGN_SUBQUE) {
	default:
		mes "[�L���P��]";
		mes "�������R���Ȃ��̂ł����";
		mes "�����Ă�����́A���̐��E��";
		mes "�A��ׂ��ł��B";
		close;
	case 2:
		if(countitem(7304) < 1) {
			mes "[�L���P��]";
			mes "���Ȃ��A�����Ă��邶��";
			mes "����܂��񂩁B";
			mes "�����܂ŗ���̂�";
			mes "��ς������ł��傤�c�c";
			mes "���R�͂ǂ�����A�����͐����Ă������";
			mes "����Ƃ���ł͂���܂���B";
			next;
			mes "[�L���P��]";
			mes "���̗͂ŊO�֏o���Ă����܂�����A";
			mes "������x�Ɨ��Ă͂����܂���B";
			close2;
			warp "umbala.gat",132,203;
			end;
		}
		mes "[�L���P��]";
		mes "�ǂ����Ă��Ȃ���";
		mes "���̖���������������";
		mes "�����Ă���̂ł����H";
		next;
		menu "���ꂽ������Ⴂ�܂���",-;
		mes "[�L���P��]";
		mes "�����c�c";
		mes "���̍��͎��̎������𓐂�";
		mes "����Ɏ������g���Ă����悤�ł��ˁB";
		mes "�ł��A���������߂��Ă���";
		mes "�悩�����ł��B";
		next;
		mes "[�L���P��]";
		mes "���āA���Ȃ��͂ǂ�ȗ��R��";
		mes "����K�˂Ă����̂ł����H";
		next;
		if(select("�A�肽����ł�","�A���L�i���A���Ă��������ł�")==1) {
			mes "[�L���P��]";
			mes "�����ł����B";
			mes "�ł͎��̗͂�";
			mes "����A���Ă����܂��傤�B";
			close2;
			warp "umbala.gat",132,203;
			end;
		}
		mes "[�L���P��]";
		mes "�A���Ă��������̂ł����H";
		mes "����Ȃ�A����������Ă�����";
		mes "�ǂ��ł��B";
		mes "����́A�����Ă���҂�";
		mes "���̌̋��֋A���͂������Ă��܂��B";
		delitem 7304,1;
		set SIGN_SUBQUE,3;
		getitem 7309,1;
		close;
	case 3:
		if(countitem(7309)) {
			mes "[�L���P��]";
			mes "�����s���Ă��������B";
			close;
		}
		mes "[�L���P��]";
		mes "�H���������Ă��܂����̂ł����H";
		mes "�d������܂���ˁA���̍Ō��";
		mes "�H�����g�����������B";
		mes "�������̎q�������Ă�����̂ł��I";
		set SIGN_SUBQUE,4;
		getitem 7309,1;
		close;
	case 6:
		mes "[�L���P��]";
		mes "���̕i�́A�����Ă���l��";
		mes "���̌̋��ɋA�����̂���";
		mes "�����܂���ł������H";
		set SIGN_SUBQUE,7;
		close;
	case 7:
		mes "[�L���P��]";
		mes "���̏����́A���������񂾂ƒm�炸�A";
		mes "�F�߂��A���ւ̖����Ǝ������A";
		mes "�ޏ������̏ꏊ�ɕ߂炦��";
		mes "����̂ł��c�c�B";
		set SIGN_SUBQUE,8;
		close;
	case 8:
		mes "[�L���P��]";
		mes "�����̊��ʂ�Ȃ��҂�";
		mes "�`���ɂ��̐g�𓊂��邱�Ƃ�";
		mes "����܂��c�c";
		close;
	}
}

nif_in.gat,105,81,0	script	#�N����	844,2,2,{
OnTouch:
	switch(SIGN_QUE) {
	default:
		end;
	case 75:
	case 76:
	case 77:
	case 78:
	case 79:
	case 80:
	case 81:
		mes "[�N����]";
		mes "�z���X�����̎R�ɂ����肵��";
		mes "�󂪎��̗[���ɐ��܂鍠";
		mes "�����������Ɏ����ς˂��";
		mes "��Ȃ�҂������錮�𓾂悤��";
		close;
	case 86:
		mes "[�N����]";
		mes "�z���X�����̎R�ɂ����肵��";
		mes "�󂪎��̗[���ɐ��܂鍠";
		mes "�����������Ɏ����ς˂��";
		mes "��Ȃ�҂������錮�𓾂悤��";
		next;
		mes "[�N����]";
		mes "���Ȃ��̓Z�������ǂ��v���H";
		next;
		menu "�ޏ��͗ǂ��l",-,"�ޏ��͈����l",-,"�܂����Ƃ������Ȃ�",-;
		mes "[�N����]";
		mes "���̂悤�Ɏv�����R�́H";
		next;
		if(select("��������������","�q�ϓI�ɔ��f����")==1) {
			if(SIGN_SUBQUE > 1)
				set SIGN_SUBQUE,0;
			else
				set SIGN_SUBQUE,SIGN_SUBQUE+1;
		}
		mes "[�N����]";
		mes "�N�̍l���͗ǂ����������B";
		mes "�ł́A�N�̖]�݂́H";
		next;
		if(select("�j�u���w�C���͂ǂ�ȏ��ł����H","�I�΂ꂵ�҂ɂȂ�ɂ͂ǂ�����΁H")==1) {
			mes "[�N����]";
			mes "�j�u���w�C���́A�N���m���Ă���ʂ�";
			mes "���҂̊X�B�������ꂾ���̑��݁B";
			mes "���@���n���𖲌��Ȃ��玀��";
			mes "�������̉p�Y�B�́A��ɂƂ�������";
			mes "��ꂳ�B";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�I�΂��ׂɁA�������ׂ����Ƃ�";
		mes "���ł����H";
		next;
		mes "[�N����]";
		mes "�I�΂ꂵ�҂ɂȂ邽�߂ɂ́A";
		mes "�N�̗E�C�������˂΂Ȃ�Ȃ��B";
		mes "�ǂ��������͌N����B";
		mes "���̌���́A���������邾���c�c";
		next;
		mes "[�N����]";
		mes "�����ƒm�肽�����";
		mes "^FF0000�I�[^000000��K�˂Ȃ����B";
		set SIGN_QUE,87;
		close;
	case 87:
		mes "[�N����]";
		mes "�����ƒm�肽�����";
		mes "^FF0000�I�[^000000��K�˂Ȃ����B";
		close;
	}
}

niflheim.gat,146,241,0	script	�A�C�Ȓj	735,{
	if(SIGN_QUE < 80) {
		mes "[�H�H]";
		mes "�ז������!!";
		close;
	}
	switch(SIGN_QUE) {
	case 80:
	case 81:
	case 82:
	case 83:
	case 84:
	case 85:
	case 86:
		mes "[�H�H]";
		mes "�l�̊O���́A���F��ꖇ�B";
		mes "���ʂ����Ȃ���΁A���̐l�̖{����";
		mes "������Ȃ��B";
		close;
	case 87:
		if(countitem(2642) < 1) {
			mes "[�I�[]";
			mes "�R�����󂯂邽�߂�";
			mes "���̎��̊X��q�˂ė������B";
			next;
			mes "[�I�[]";
			mes "�����A���O�̂悤�ɑI�΂ꂵ�҂�";
			mes "�Ȃ�ׂ��A�����ɖK�ꂽ��l�B";
			mes "�������A���s�����B���̑㏞�Ƃ��āA";
			mes "���̂������A���҂̊X��f�r��";
			mes "���ƂȂ����B";
			next;
			mes "[�I�[]";
			mes "�x�����悤�c�c�T�d�ɂȂ邪�����B";
			mes "���̎����̑㏞�́A���܂�ɑ傫���B";
			next;
			mes "[�I�[]";
			mes "�×~�ȍl�����u�E�C�v�ȂǂƂ������t��";
			mes "�ꊇ��ɂ��Ă��܂��ẮA";
			mes "�����Ȃ��Ȃ��Ă��܂���������c�c";
			next;
			mes "[�I�[]";
			mes "�����A���܂�B�C���Q�������H";
			mes "�����Y���ȁB���̌���͂���";
			mes "���O�����Ă���B�I�΂ꂵ�҂ƂȂ�";
			mes "���i�����邩���ׂ邽�߂ɂȁB";
			next;
			mes "[�I�[]";
			mes "�b�������Ȃ����ȁB";
			mes "������K�˂�Ƃ����B";
			mes "�ޏ��Ȃ�A���O����������΂�����";
			mes "�ǂ��m���Ă���B";
			set SIGN_QUE,88;
			close;
		}
		mes "[�I�[]";
		mes "����T���Ă���H";
		mes "���������A�N������";
		mes "�悱�����̂��낤�B";
		mes "�������Ɩ{�؂ɓ��낤���B";
		next;
		mes "[�I�[]";
		mes "���O�A���́A�I�΂ꂵ�҂�";
		mes "�Ȃ肽���B";
		next;
		if(select("�����̗E�C���ؖ�������","�����̖��_�̂���","��������̐l�̖��ɗ�������")==1) {
			if(SIGN_SUBQUE > 2)
				set SIGN_SUBQUE,0;
			else
				set SIGN_SUBQUE,SIGN_SUBQUE+1;
		}
		mes "[�I�[]";
		mes "�����ǂ����Ă����ɋ��邩�A";
		mes "�N�����ɕ��������H";
		next;
		if(select("�͂�","������")==1) {
			mes "[�I�[]";
			mes "�������B";
			mes "����Ȃ疂����K�˂邪�����B";
			next;
			mes "[�I�[]";
			mes "�����A�C�����邪�����B";
			mes "�ޏ��͖����Ȃ̂�����ȁc�c";
			set SIGN_QUE,88;
			close;
		}
		mes "[�I�[]";
		mes "�����A���O�̂悤�ɑI�΂ꂵ�҂�";
		mes "�Ȃ�ׂ��A�����ɖK�ꂽ��l�B";
		mes "�������A���s�����B���̑㏞�Ƃ��āA";
		mes "���̂������A���҂̊X��f�r��";
		mes "���ƂȂ����B";
		next;
		mes "[�I�[]";
		mes "�x�����悤�c�c�T�d�ɂȂ邪�����B";
		mes "���̎����̑㏞�́A���܂�ɑ傫���B";
		next;
		mes "[�I�[]";
		mes "�×~�ȍl�����u�E�C�v�ȂǂƂ������t��";
		mes "�ꊇ��ɂ��Ă��܂��ẮA";
		mes "�����Ȃ��Ȃ��Ă��܂���������c�c";
		next;
		mes "[�I�[]";
		mes "�����A���܂�B�C���Q�������H";
		mes "�����Y���ȁB���̌���͂���";
		mes "���O�����Ă���B�I�΂ꂵ�҂ƂȂ�";
		mes "���i�����邩���ׂ邽�߂ɂȁB";
		next;
		mes "[�I�[]";
		mes "�b�������Ȃ����ȁB";
		mes "������K�˂�Ƃ����B";
		mes "�ޏ��Ȃ�A���O����������΂�����";
		mes "�ǂ��m���Ă���B";
		next;
		mes "[�I�[]";
		mes "�����A�C�����邪�����B";
		mes "�ޏ��͖����Ȃ̂�����ȁc�c";
		next;
		mes "[�I�[]";
		mes "��H�@�����A����̓Z�����̌��t���B";
		mes "�ޏ��͗D�����B";
		mes "�j�u���w�C���ɂ�";
		mes "�����킵���Ȃ����݂��B";
		next;
		mes "[�I�[]";
		mes "�Z�����͐����Ă������A";
		mes "���h�ȃE�B�U�[�h�������������B";
		set SIGN_QUE,88;
		close;
	case 117:
		mes "[�I�[]";
		mes "�悭�����ȁB";
		mes "�w����T���Ă��邻������Ȃ����B";
		next;
		mes "[�I�[]";
		mes "�����B���K�v���Ȃ��ȁB";
		mes "���̖{���̖��O�̓K���O�����e�B�B";
		mes "���҂̎�ł���w���l�̖l�B";
		next;
		mes "[�I�[]";
		mes "����ł̓w���l�̂��Ƃ֑��낤�B";
		mes "�����͂������H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�I�[]";
			mes "�������o������A�Ă�";
			mes "�K�˂Ă��邪�����B";
			mes "�������A�}���������B";
			mes "�w���l�����҂����˂��B";
			close;
		}
		mes "[�I�[]";
		mes "�w���l�̑O�ł͗�V����邱�Ƃ��B";
		mes "��V����邱�Ƃ��o���˂΁A";
		mes "�S���ƂȂ�ƐS����B";
		close2;
		warp "que_sign01.gat",45,20;
		end;
	case 118:
		mes "[�I�[]";
		mes "�ق��A��̐��E�̏ے����B";
		mes "1��Ƃ͌����A�悭�w���l��";
		mes "���������̂��B";
		next;
		mes "[�I�[]";
		mes "������x�����B";
		mes "�u�ޏ��v�ɂ͋C�����邪�����B";
		mes "�ޏ��͊��ɁA���܂����w���l����";
		mes "�ے������������̂�m���Ă���B";
		next;
		mes "[�I�[]";
		mes "�������A���̖{�������ɂ߂邪�����c�c";
		close;
	default:
		if(SIGN_QUE < 117) {
			mes "[�I�[]";
			mes "���O�A�Ȃɂ���T���Ă���悤���ȁB";
			mes "������A�����Ƃ��댯�ȕ����B";
			mes "�C�������B";
			next;
			mes "[�I�[]";
			mes "�����Ċ댯�ȑ��݂��A���O��";
			mes "�_���Ă��邱�Ƃ��낤�c�c";
			close;
		}
		if(SIGN_QUE < 129) {
			mes "[�I�[]";
			mes "�}���Ȃ���΁A�~�b�h�K���h��";
			mes "�j�u���w�C�����A�łڂ����";
			mes "���܂����낤�c�c";
			next;
			mes "[�I�[]";
			mes "�w���l�́A������������";
			mes "���l���Ȃ̂��c�c";
			close;
		}
		if(SIGN_QUE > 200) {
			mes "[�I�[]";
			mes "�ޏ����~�߂邱�Ƃ͏o���Ȃ�����";
			mes "�悤���ȁB���܂��Ȃ�ł��邾�낤��";
			mes "�����͊��҂��Ă����̂����c�c";
			next;
			mes "[�I�[]";
			mes "�c�c���҂͂��ꂾ�����ȁB";
			mes "�����A�A�邪�悢�B";
			close;
		}
		mes "[�I�[]";
		mes "�悭���ޏ����~�߂Ă��ꂽ�B";
		mes "���ӂ��悤�B";
		next;
		mes "[�I�[]";
		mes "�S�ďI������Ȃ�A������x";
		mes "�K�˂�悤�ɂƂ́A�w���l��";
		mes "�����t���B�Q���邩�H";
		next;
		if(select("�܂����","�s���܂�")==1) {
			mes "[�I�[]";
			mes "�������B";
			close;
		}
		mes "[�I�[]";
		mes "�ł͑��낤�B";
		mes "�������A�w���l�̑O�ł�";
		mes "������̂����B";
		close2;
		warp "que_sign01.gat",45,20;
		end;
	}
}

nif_in.gat,140,177,0	script	#�X�C�b�`	111,{
	if(countitem(7313) == 1) {
		warp "que_sign01.gat",115,135;
		end;
	}
	if(SIGN_QUE > 89) {
		if(SIGN_QUE == 126)
			set SIGN_QUE,198;
		warp "que_sign01.gat",115,135;
		end;
	}
}

que_sign01.gat,122,141,4	script	����	792,{
	if(countitem(7313) == 1 && (SIGN_QUE < 124 || SIGN_QUE > 126)) {
		mes "[�L���P��]";
		mes "�s���܂����H";
		next;
		if(select("�s���܂�","�܂��c�c")==2) {
			mes "[�L���P��]";
			mes "�}���Łc�c";
			close;
		}
		set @menu,select("�Z�����̋߂���","�Z������T����");
		mes "[�L���P��]";
		mes "���݂܂��c�c";
		close2;
		if(@menu == 1) warp "que_sign01.gat",195,189;
		else warp "que_sign02.gat",35,313;
		end;
	}
	switch(SIGN_QUE) {
	case 90:
		if(countitem(2642) < 1) {
			mes "[�L���P��]";
			mes "�܂��A���ׂ����Ƃ����Ȃ����B";
			close;
		}
		mes "[�L���P��]";
		mes "�������͂��������܂��B";
		mes "����������Ԃ��ė��Ă��������B";
		set SIGN_SUBQUE,0;
		close;
	case 91:
		if(countitem(7304) < 1) {
			emotion 32;
			mes "[�L���P��]";
			mes "�܂��A���ׂ����Ƃ����Ȃ����B";
			close;
		}
		mes "[�L���P��]";
		mes "���̍��͎��̎������𓐂�";
		mes "����Ɏ������g���Ă����悤�ł��B";
		mes "�ł��A���������߂��Ă��Ă悩�����B";
		next;
		mes "[�L���P��]";
		mes "���āA���Ȃ��͂ǂ�ȗ��R��";
		mes "����K�˂Ă����̂ł����H";
		next;
		menu "�N��������ɋ�����ė��܂���",-;
		mes "[�L���P��]";
		mes "��͂�A�P���ȗ��R�ł�����";
		mes "�K�ꂽ�̂ł͂Ȃ������̂ł��ˁB";
		mes "�������ǂ�ȏꏊ���́A";
		mes "�����킩�����Ǝv���܂��B";
		next;
		mes "[�L���P��]";
		mes "�����́A���Ȃ��Ɠ����悤�ɁA";
		mes "�E�C���ؖ����A";
		mes "�I�΂ꂵ�҂ɂȂ낤�Ƃ���";
		mes "���s�����ҒB������ꏊ�B";
		mes "��ɂƌ������̕��B";
		next;
		mes "[�L���P��]";
		mes "�����āA���̊X�ɂ́A�S�Ă̎��҂�";
		mes "�������鎀�҂̎傪���܂��B";
		next;
		mes "[�L���P��]";
		mes "�ޏ��͊Z�őS�g���B���A���܂�A";
		mes "�����̂��߂Ɏp�������̂ł��B";
		mes "���̋����͑��ɗނ����܂���B";
		next;
		mes "[�L���P��]";
		mes "���Ȃ��́c�c";
		next;
		mes "[�L���P��]";
		mes "�c�c�ޏ������𓾂Ȃ����";
		mes "�Ȃ�܂���B";
		next;
		menu "��Ƃ͂Ȃ�ł����H",-;
		mes "[�L���P��]";
		mes "����́c�c";
		mes "�����鎀�҂̎�ł���ے��B";
		next;
		menu "�ǂ����Ă��ꂪ�K�v�Ȃ́H",-;
		mes "[�L���P��]";
		mes "����́A�܂�������킯�ɂ�";
		mes "�����܂���B���̈�������A���Ă���";
		mes "���ɋ����܂��傤�c�c";
		next;
		mes "[�L���P��]";
		mes "��̂��Ƃ́A��΂ɔ閧�ɂ���";
		mes "���������B";
		mes "���̈�͒N�ɂ��n���Ă�";
		mes "�Ȃ�Ȃ����̂ł�����B";
		next;
		if(select("�ǂ����āH","��𓾂���@�́H")==1) {
			mes "[�L���P��]";
			mes "����́A�܂�������킯�ɂ�";
			mes "�����܂���B";
			next;
			menu "��𓾂���@�́H",-;
		}
		mes "[�L���P��]";
		mes "��ԊȒP�Ȃ̂́A�͂Ŏ��҂̎傩��";
		mes "���̈��D�����Ƃł��B";
		mes "�������́A���镨��񋟂��A";
		mes "�����������邱�Ƃł��B";
		next;
		if(select("������܂���","�Ȃɂ�񋟂���΂����H")==1) {
			set SIGN_QUE,92;
			close;
		}
		mes "[�L���P��]";
		mes "�ޏ��ɂ́A�_�X�ɂ��ċւ��ꂽ";
		mes "�ꂪ����Ƃ����܂��B";
		next;
		mes "[�L���P��]";
		mes "���҂̎�́A��A�A���O���{�_��";
		mes "�T�������Ă��܂��B";
		delitem 7304,1;
		set SIGN_QUE,92;
		close;
	case 92:
		if(rand(10) < 8) {
			mes "[�L���P��]";
			mes "���҂̎�́A���������";
			mes "�T���Ă���Ƃ������𗬂��A";
			mes "�A���O���{�_�Ɋւ���\��b��";
			mes "�W�܂��Ă���̂�҂��Ă��܂��B";
			next;
			mes "[�L���P��]";
			mes "�����ł����B��ΒN�ɂ�";
			mes "���Ȃ������~���Ă����";
			mes "�����Ă͂����܂���B";
			next;
			mes "[�L���P��]";
			mes "���ɃZ�����ɂ͋C�����Ȃ����B";
			mes "���̐l�́A�K���~�߂Ȃ���΂����Ȃ�";
			mes "���݁B��΁A�C�t����Ă�";
			mes "�Ȃ�Ȃ��̂ł��A��΂ɁB";
			close;
		}
		mes "[�L���P��]";
		mes "�A���O���{�_�ɂ��ẮA";
		mes "�Z�����ƌ��������m���Ă��邩��";
		mes "����܂���B";
		mes "�ł��A�C�����Ă��������B";
		next;
		mes "[�L���P��]";
		mes "���̐l�́A�K���~�߂Ȃ���΂����Ȃ�";
		mes "���݁B��΁A�C�t����Ă�";
		mes "�Ȃ�Ȃ��̂ł��A��΂ɁB";
		close;
	case 118:
		mes "[�L���P��]";
		mes "�悭����������Ă��Ă���܂����B";
		mes "�N���T�����Ƃ��o���Ȃ�����";
		mes "�A���O���{�_��T���o�����Ƃ�";
		mes "�o�����̂ł��ˁB";
		mes "�ł́A���̈�����Ɂc�c";
		next;
		if(select("�n��","�n���Ȃ�")==2) {
			emotion 9;
			mes "[�L���P��]";
			mes "�Z�����ɉ��������܂������H";
			mes "�����ɒD�����Ƃ͂��܂���B�ł����A";
			mes "�ǂ��l���Ă��������B";
			close;
		}
		mes "[�L���P��]";
		mes "�ł́A���b���܂��傤�B";
		mes "���ꂩ��A���Ȃ��������˂΂Ȃ�Ȃ�";
		mes "�d�v�Ȃ��Ƃ������܂��B";
		next;
		mes "[�L���P��]";
		mes "������A���̈�ł��邱�Ƃ����܂��B";
		mes "�����āA���̂��߂ɂ�����A";
		mes "�ǂ����Ă��K�v�ȕ�������܂��B";
		mes "�Ȃ�ł������̂ŁA�Z�������g��";
		mes "�����Ă��������v��̂ł��B";
		next;
		mes "[�L���P��]";
		mes "�ޏ��͂������łɁA���̐g��";
		mes "�B���Ă��܂��܂����B";
		mes "����ł��傤���A�ǂ���";
		mes "���肢���܂��B";
		delitem 7305,1;
		set SIGN_QUE,119;
		close;
	case 119:
		if(countitem(2642)) {
			mes "[�L���P��]";
			mes "�����A�ޏ��̎w�ւ�������";
			mes "�����̂ł����B������܂����B";
			mes "����ŁA�ޏ����ǂ��ɉB�ꂽ��";
			mes "�T���o�����Ƃ��o���܂��B";
			delitem 2642,1;
			set SIGN_QUE,120;
			close;
		}
		mes "[�L���P��]";
		mes "�������Ă��Ă����������܂���ˁB";
		mes "�Z�����͊��ɐg���B���Ă��܂������A";
		mes "���̂悤�ȏ�ԂŔޏ���T���̂�";
		mes "�s�\�ɋ߂��c�c";
		mes "�����Ȃ�Ƃ����Ă݂܂��傤�B";
		set SIGN_QUE,121;
		close;
	case 120:
	case 121:
		mes "[�L���P��]";
		mes "�򂪊�������ԂɁA";
		mes "���b���܂��傤�B";
		next;
		mes "[�L���P��]";
		mes "�󂪕K�v�ȗ��R������Ȃ������̂�";
		mes "���Ȃ���ʂ��A�Z���������̈Ӑ}��";
		mes "�C�t���\��������������ł��B";
		mes "�C�����������ł��傤�H";
		mes "�ł��A��������l����ƁA�T�d�Ɏ���";
		mes "�^�΂�������Ȃ������̂ł��B";
		next;
		mes "[�L���P��]";
		mes "�Z�����́A���҂ł���ɂ��ւ�炸�A";
		mes "���Ɏ������邠�܂�A�����̎���";
		mes "�󂯓���邱�Ƃ��o�����ɂ��܂��B";
		next;
		mes "[�L���P��]";
		mes "�������A����Ȏ҂͂�����ł�";
		mes "���܂��B���ʂ͐�]�Ƌ�ɂ̒��A";
		mes "���߂��Ȃ����]�Ƃ�������";
		mes "�Y��Ă����܂��B";
		next;
		mes "[�L���P��]";
		mes "�������A�ޏ��͈Ⴄ�B";
		next;
		mes "[�L���P��]";
		mes "�ޏ��͐M�O�������A��]���̂Ă���";
		mes "���ւ̎�����ۂ��Ă����B";
		mes "�����炱���A�ޏ����ЂƍہA������";
		mes "�َ��Ɍ�����̂ł��傤�B";
		next;
		mes "[�L���P��]";
		mes "��]�Ƃ�������S�Ɏ����Ă��邾����";
		mes "�����ł͖��邷���鑶�݂ƂȂ�B";
		next;
		mes "[�L���P��]";
		mes "�������A�ޏ��͓����ԈႦ���B";
		mes "������A�~�߂Ȃ���΂Ȃ�Ȃ��c�c";
		while('@talk < 0x7) {
			next;
			switch(select("�ޏ��̊肢���āH","�ޏ��͉������悤�Ƃ��Ă���H","�������ׂ����Ƃ́H")) {
			case 1:
				mes "[�L���P��]";
				mes "�ޏ��͋���E�̏ے���~���Ă��܂��B";
				mes "�S�Ă̎��҂��x�z����w���l�̈��";
				mes "������΁A�j�u���w�C�����o�邱�Ƃ�";
				mes "�ł��邩��ł��B";
				next;
				mes "[�L���P��]";
				mes "�������A���Ȃ��������ė������ł�";
				mes "�ޏ��̊肢�������邱�Ƃ��o���܂���B";
				mes "�������߂��葱���͕��G������A";
				mes "1�񂾂��̌����ł́A���܂�ς��̂�";
				mes "����A�s�\�Ȃ̂ł��B";
				set '@talk,'@talk|0x1;
				break;
			case 2:
				mes "[�L���P��]";
				mes "���O�A�ޏ��͂ƂĂ��D�ꂽ";
				mes "�E�B�U�[�h�ł����B�ޏ��́A���̒m����";
				mes "�g���A��̐��E�̏ے��𗘗p���A";
				mes "���鑶�݂������ɌĂяo������";
				mes "���ł��܂��B";
				next;
				mes "[�L���P��]";
				mes "�����̉��A�_�[�N���[�h���c�c";
				next;
				mes "[�L���P��]";
				mes "���Ȃ��̐��E�~�b�h�K���h�́A����";
				mes "�����Ă��鐢�E�B����Ȑ��E��";
				mes "�����ɂ́A�_�[�N���[�h�Ƃĕ��S��";
				mes "�傫������̂ł��B";
				next;
				mes "[�L���P��]";
				mes "����́A�~�b�h�K���h�ł́A�����̗͂�";
				mes "�܂Ƃ��ɔ������邱�Ƃ��o������";
				mes "�ނ����肵�Ă��܂����c�c";
				mes "�����͈Ⴂ�܂��B";
				mes "�����͐��ł͂Ȃ��A����������";
				mes "���܂�����B";
				next;
				mes "[�L���P��]";
				mes "�_�[�N���[�h�ɂƂ��āA�j�u���w�C����";
				mes "�~�b�h�K���h��莩���̐��E�ɋ߂��B";
				mes "���̕��A�{���̗͂��g����ł��傤�B";
				next;
				mes "[�L���P��]";
				mes "�_�[�N���[�h���j�u���w�C���Ɏp��";
				mes "�����΁A���Ȃ��̐��E�͔ނ̋����";
				mes "�͂ɂ���ĖŖS���܂��B";
				next;
				mes "[�L���P��]";
				mes "�_�[�N���[�h������������A�Z������";
				mes "�����ƁA���������܂��B";
				mes "�����𐶂��Ԃ点�Ă���Ɓc�c";
				mes "�������_�[�N���[�h�Ȃ�A";
				mes "���̊肢���������܂��B";
				next;
				mes "[�L���P��]";
				mes "�����āA�w���l�ɂƂ���";
				mes "�~�b�h�K���h�͊֌W�̂Ȃ����E�B";
				mes "�����A�ނ���_�[�N���[�h�ɂ��";
				mes "�������̎��҂����܂�A�����̖���";
				mes "������Ɗ�Ԃ�������Ȃ��c�c";
				next;
				mes "[�L���P��]";
				mes "������A�w���l�̓Z�����̍s�ׂ�";
				mes "�m���Ă��Ȃ���A�������łƂ���";
				mes "���Ă��Ȃ��̂����m��Ȃ��B";
				set '@talk,'@talk|0x2;
				break;
			case 3:
				mes "[�L���P��]";
				mes "���Ȃ������ׂ����Ƃ́A";
				mes "���̖�������ăZ������T�����ƁB";
				next;
				mes "[�L���P��]";
				mes "���̖�͈�̗͂��g���A";
				mes "��̎��҂��]�킹��͂�";
				mes "�ޏ��̋L�������S�ɕ�����A";
				mes "��̗͂������Ă��܂��B";
				next;
				mes "[�L���P��]";
				mes "�ޏ��̋L���𕕈󂷂���";
				mes "�ȑO���珀�����Ă��܂����B�������A";
				mes "��ΓI�Ȗ��߂������˂΁A�ޏ��͖��";
				mes "�������Ƃ��Ȃ��ł��傤�B";
				next;
				mes "[�L���P��]";
				mes "������A���Ȃ��Ɉ�𓾂�悤";
				mes "���񂾂̂ł��B";
				set '@talk,'@talk|0x4;
				break;
			}
		}
		set SIGN_QUE,SIGN_QUE+2;
		close;
	case 122:
		mes "[�L���P��]";
		mes "�򂪊������܂����B";
		mes "����������ăZ������";
		mes "�ǂ��Ă��������B";
		next;
		mes "[�L���P��]";
		mes "�K���A���Ȃ��������Ă����w�ւ�";
		mes "�������Ŕޏ��̉B��ꏊ��";
		mes "������܂����B���ꂩ��A";
		mes "���̏ꏊ�ɑ���܂��傤�B";
		next;
		mes "[�L���P��]";
		mes "����ƁA����������Ă����Ȃ����B";
		mes "���Ȃ��Ƌ��ɁA�Z�����ɗ�����������";
		mes "����钇�Ԃɓn���Ȃ����B";
		next;
		mes "[�L���P��]";
		mes "�w�ւ́A���Ȃ��̖ړI��";
		mes "�B�������܂ł͎w�ɂ͂߂���";
		mes "�厖�Ɏ����Ă��Ȃ����ˁB";
		next;
		mes "[�L���P��]";
		mes "�ł́A�S�ďI�������A�܂�������";
		mes "�߂��Ă��Ă��������B";
		set SIGN_QUE,124;
		getitem 7308,1;
		getitem 2643,1;
		getitem 7313,5;
		close;
	case 123:
		mes "[�L���P��]";
		mes "�򂪊������܂����B";
		mes "����������ăZ������";
		mes "�ǂ��Ă��������B";
		next;
		mes "[�L���P��]";
		mes "�Z�����̉B��Ă����";
		mes "�v����ꏊ�������܂����B";
		mes "������A�����֑���܂��傤�B";
		mes "�K���A�ޏ�������";
		mes "�����Ď~�߂Ă��������B";
		next;
		mes "[�L���P��]";
		mes "����ƁA����������Ă����Ȃ����B";
		mes "���Ȃ��Ƌ��ɁA�Z�����ɗ�����������";
		mes "����钇�Ԃɓn���Ȃ����B";
		set SIGN_QUE,124;
		getitem 7308,1;
		getitem 7313,5;
		close;
	case 124:
	case 125:
	case 198:
		if(getnpctimer(1,"SignTimer#witch")) {
			mes "[�L���P��]";
			mes "���������҂��Ă��������B";
			close;
		}
		mes "[�L���P��]";
		mes "�����ޏ����~�߂Ȃ���΁B";
		mes "�����͂����ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�L���P��]";
			mes "���܂莞�Ԃ͂���܂���c�c";
			close;
		}
		close2;
		if(countitem(2643)) {
			initnpctimer "SignTimer#witch";
			warp "que_sign01.gat",195,189;
		}
		else
			warp "que_sign02.gat",35,313;
		end;
	case 127:
	case 128:
		if(countitem(7313) < 5) {
			mes "[�L���P��]";
			mes "�����̈�͂ǂ����܂����H";
			mes "�S�������Ă��Ă��������B";
			close;
		}
		mes "[�L���P��]";
		mes "�c�c����ꂳ�܂ł����B";
		mes "���Ȃ��Ȃ炫���Ƃł���Ǝv����";
		mes "���܂����B�ޏ�������ŁA�S�Ă�Y��";
		mes "�����Ő����čs����ł��傤�B";
		next;
		mes "[�L���P��]";
		mes "���ւ̎������A";
		mes "�~�b�h�K���h�ւ̎������A";
		mes "���Ȃ��̋L�����S�āc�c";
		next;
		if(countitem(2643)) {
			mes "[�L���P��]";
			mes "���܂�ς�邱�Ƃ��o�����Ƃ��A";
			mes "�ޏ��͍K���������ł��傤�B";
			mes "���Ȃ��Əo��܂�������B";
			next;
			mes "[�L���P��]";
			mes "���Ƃ́A�ċz���A�S��������̂�";
			mes "�����Ƃł͂���܂���B";
			mes "�����ȊO�̑��݂ƒ��a���A�������钆��";
			mes "�������݂��邱�Ƃł��B";
			next;
			mes "[�L���P��]";
			mes "�ޏ��́A�j�u���w�C���̏Z�l�B";
			mes "�����ő��݂��Ă����Ȃ���΂Ȃ�Ȃ��B";
		}
		else {
			mes "[�L���P��]";
			mes "���ǁA�ޏ��̐��ɑ΂��鎷���͔ߌ���";
			mes "�I����Ă��܂��܂����B���܂�A�㖡��";
			mes "�ǂ����̂ł͂���܂���ˁc�c";
			next;
			mes "[�L���P��]";
			mes "�ł��A�ޏ��̓j�u���w�C����";
			mes "�Z�l������A�����ő��݂���";
			mes "�����Ȃ���΂Ȃ�܂���B";
		}
		next;
		mes "[�L���P��]";
		mes "�Ƃɂ����A���肪�Ƃ��B";
		mes "���Ȃ��͌����A�����̂��ׂ����Ƃ�";
		mes "���������܂����B";
		next;
		mes "[�L���P��]";
		mes "�����A�s���Ȃ����B";
		mes "�����āA�S�Ă��I�������A�܂�";
		mes "�w���l��K�˂�Ƃ����ł��傤�B";
		delitem 7313,5;
		if(countitem(2643)) {
			set SIGN_QUE,129;
			if(checkre())
				getexp 50000,0;
			else
				getexp 500000,0;
		}
		else {
			set SIGN_QUE,130;
			if(checkre())
				getexp 30000,0;
			else
				getexp 300000,0;
		}
		close;
	case 131:
	case 132:
	case 133:
	case 134:
		mes "[�L���P��]";
		mes "�ޏ����~�߂Ȃ���΁B";
		mes "�����I";
		close;
	case 135:
	case 136:
		mes "[�L���P��]";
		mes "�c�c����ꂳ�܂ł����B";
		mes "���Ȃ��Ȃ炫���Ƃł���Ǝv����";
		mes "���܂����B�ޏ�������ŁA�S�Ă�Y��";
		mes "�����Ő����čs����ł��傤�B";
		next;
		mes "[�L���P��]";
		mes "���ւ̎������A";
		mes "�~�b�h�K���h�ւ̎������A";
		mes "���Ȃ��̋L�����S�āc�c";
		next;
		mes "[�L���P��]";
		mes "���ǁA�ޏ��̐��ɑ΂��鎷���͔ߌ���";
		mes "�I����Ă��܂��܂����B���܂�A�㖡��";
		mes "�ǂ����̂ł͂���܂���ˁc�c";
		next;
		mes "[�L���P��]";
		mes "�ł��A�ޏ��̓j�u���w�C����";
		mes "�Z�l������A�����ő��݂���";
		mes "�����Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�L���P��]";
		mes "�Ƃɂ����A���肪�Ƃ��B";
		mes "���Ȃ��͌����A�����̂��ׂ����Ƃ�";
		mes "���������܂����B";
		next;
		mes "[�L���P��]";
		mes "�����A�s���Ȃ����B";
		mes "�����āA�S�Ă��I�������A�܂�";
		mes "�w���l��K�˂�Ƃ����ł��傤�B";
		if(countitem(2643))
			set SIGN_QUE,129;
		else
			set SIGN_QUE,130;
		if(checkre())
			getexp 30000,0;
		else
			getexp 300000,0;
		close;
	case 200:
		mes "[�L���P��]";
		mes "���Ȃ��ɔC�����̂��ԈႢ�ł����B";
		mes "�Z�����̓_�[�N���[�h�̏�����";
		mes "���݂܂������A�K���ɂ��A�ʂ̕��ɂ��";
		mes "�j�~����܂����B";
		next;
		mes "[�L���P��]";
		mes "���ꂪ�N���ł����H";
		mes "������܂��񂩁H�@���Ȃ��Ɠ����悤��";
		mes "�I�΂ꂵ�҂̎����ŁA�����ɗ��Ă���";
		mes "����1�l�ł��B";
		next;
		mes "[�L���P��]";
		mes "�Z�����𖳎��~�߂邱�Ƃ��o�����҂�";
		mes "�_�ɑI�΂�A���@���n���֏���";
		mes "���𓾂�ł��傤�B";
		next;
		mes "[�L���P��]";
		mes "���Ȃ��͎��s�����̂ł��B";
		mes "��蒼�����ł��܂���B";
		mes "����ŏI���ł��B";
		next;
		mes "[�L���P��]";
		mes "�Z�������A�Ō�̗D�����ł��Ȃ���";
		mes "�~�b�h�K���h�ɑ���Ȃ���΁A���Ȃ���";
		mes "���̎��s�����҂Ɠ������A";
		mes "�j�u���w�C�����~���Ȃ����Ƃ���";
		mes "�f�r�����ƂɂȂ��Ă����ł��傤�B";
		next;
		mes "[�L���P��]";
		mes "�ޏ��Ɋ��ӂ��邱�Ƃł��ˁB";
		delitem 7308,countitem(7308);
		delitem 2642,countitem(2642);
		set SIGN_QUE,201;
		if(checkre())
			getexp 20000,0;
		else
			getexp 200000,0;
		close;
	default:
		if(SIGN_QUE < 118) {
			mes "[�L���P��]";
			mes "��𓾂�̂́A�ƂĂ����";
			mes "���Ƃł��傤�B�������A�K��";
			mes "��ɓ���Ȃ���΂Ȃ�Ȃ��̂ł��B";
			mes "����͎������ł͂Ȃ��A���Ȃ��ɂ�";
			mes "�K�v�ȕi�Ȃ̂ł��B";
			close;
		}
		if(SIGN_QUE > 200) {
			mes "[�L���P��]";
			mes "����ȏ㌾�����Ƃ͂���܂���B";
			close;
		}
		mes "[�L���P��]";
		mes "�܂������H";
		mes "�����Ă���҂́A������҂̐��E��";
		mes "�A��ׂ��ł��B";
		close;
	}
}

niflheim.gat,102,54,4	script	�Ј����̂���j	739,{
	if(SIGN_QUE < 82) {
		mes "[���C�L��]";
		mes "�ȂɁH�@�ǂ����Ō������Ƃ�����āH";
		mes "���̒��ɂ͎����Ƃ�������Ȑl����";
		mes "3�l����ƌ������낤�B�������ȁA";
		mes "�l�Ɍ��炸�����X�^�[����������";
		mes "3�̈ȏア�邩���ȁB";
		close;
	}
	if(SIGN_QUE < 96) {
		mes "[���C�L��]";
		mes "�����������͂Ȃ��B";
		mes "�_�X����炷�A�X�K���h��";
		mes "�������ɔ�ׂ�΁A";
		mes "�j�u���w�C���͂����Ǝ��R���B";
		next;
		mes "[���C�L��]";
		mes "�_�X�ɒǕ�����Ă����ɗ������A";
		mes "�ނ��늴�ӂ��������炢���B";
		close;
	}
	switch(SIGN_QUE) {
	case 96:
		mes "[���C�L��]";
		mes "�A���O���{�_�H";
		mes "�����A���l���̏����B";
		mes "�_�X�ɂ���ĕ߂��ꂽ��A";
		mes "����5�ɂ킯���āA�~�b�h�K���h��";
		mes "��Ԑ[���ꏊ�ɕ��󂳂ꂽ�񂾁B";
		next;
		mes "[���C�L��]";
		mes "�_�X�̍Ђ��ƂȂ�A���L��3�l�̎q��";
		mes "�Y�񂾂���Ƃ͌����A�ߍ��ȏ������B";
		mes "����ł������������Ȃ��񂾂���ȁB";
		next;
		menu "�~�b�h�K���h�ň�Ԑ[���ꏊ�H",-;
		mes "[���C�L��]";
		mes "�����A��Ԑ[���A�댯�ȏꏊ���B";
		mes "�����ȃ����X�^�[���A";
		mes "�����Ⴄ���Ⴂ����Ęb���B";
		next;
		mes "[���C�L��]";
		mes "�ǂ���������Ȃ��H";
		mes "���������A�m�肽�����H";
		next;
		mes "[���C�L��]";
		mes "�����Əڂ�������������΁c�c";
		mes "�������ȁA40,000zeny����B";
		next;
		if(select("������","�����Ȃ�")==2) {
			mes "[���C�L��]";
			mes "�܁A�撣���B";
			close;
		}
		if(Zeny < 40000) {
			emotion 32;
			mes "[���C�L��]";
			mes "���A�Ȃ�����Ȃ����B";
			mes "��₩�����H";
			close;
		}
		mes "[���C�L��]";
		mes "�悵�A�����Ă�낤�B";
		mes "����̓O���X�g�w�C���̍ŉ��w�B";
		mes "�����Łc�c";
		next;
		set '@rand,rand(1,4);
		mes "[���C�L��]";
		switch('@rand) {
		case 1:
			mes "^0000FF�u�傫��1���v�u�傫��5���v";
			mes "�u�傫��7���v�u������6���v^000000��";
			break;
		case 2:
			mes "^0000FF�u�傫��4���v�u�傫��10���v";
			mes "�u������6���v�u�ƂĂ�������11���v^000000��";
			break;
		case 3:
			mes "^0000FF�u�傫��5���v�u������11���v";
			mes "�u������6���v�u�ƂĂ�������11���v^000000��";
			break;
		case 4:
			mes "^0000FF�u�傫��4���v�u�傫��5���v";
			mes "�u�傫��10���v�u������11���v^000000��";
			break;
		}
		mes "�T���Ă݂ȁB";
		next;
		mes "[���C�L��]";
		mes "���������ꏊ�ɁA�Ȃ�炩�̍��Ղ�";
		mes "�c����Ă���͂����B";
		next;
		mes "[���C�L��]";
		mes "�������A���l�ɂ͐�΂ɋ�����Ȃ�B";
		next;
		if(select("������܂���","�傫�ȁA�����Ȃ��Ăǂ������Ӗ��H")==1) {
			mes "[���C�L��]";
			mes "�悵�c�c";
			set Zeny,Zeny-40000;
			set SIGN_QUE,SIGN_QUE+'@rand;
			close;
		}
		mes "[���C�L��]";
		mes "���̒��A������荂������͂Ȃ��B";
		mes "�������ȁA����20,000zeny���ꂽ��";
		mes "�����Ă�낤�B";
		next;
		if(select("�����Ȃ�","������")==1) {
			emotion 32;
			mes "[���C�L��]";
			mes "�������B";
			set Zeny,Zeny-40000;
			set SIGN_QUE,SIGN_QUE+'@rand;
			close;
		}
		if(Zeny < 40000) {
			emotion 32;
			mes "[���C�L��]";
			mes "���A�Ȃ�����Ȃ����B";
			mes "��₩�����H";
			close;
		}
		mes "[���C�L��]";
		mes "�u�傫�ȁv�u�����ȁv�͒��������";
		mes "�������w���Ă���B";
		next;
		mes "[���C�L��]";
		mes "�u�傫�ȁv�͈�ԊO���A";
		mes "�u�����ȁv�͊O����肿����Ɠ����A";
		mes "�u�ƂĂ������ȁv�͒����ɋ߂���������";
		mes "�v���Ă���B�킩�����ȁB";
		set Zeny,Zeny-60000;
		set SIGN_QUE,SIGN_QUE+'@rand+4;
		close;
	case 97:
	case 98:
	case 99:
	case 100:
		mes "[���C�L��]";
		mes "�܂�������Ȃ����Ƃ�����H";
		mes "20,000zeny�����Ȃ狳���Ă�낤�B";
		next;
		if(select("�����Ȃ�","������")==1) {
			emotion 32;
			mes "[���C�L��]";
			mes "�����A�����B";
			close;
		}
		if(Zeny < 40000) {
			mes "[���C�L��]";
			mes "���A�Ȃ�����Ȃ����B";
			mes "��₩�����H";
			close;
		}
		mes "[���C�L��]";
		mes "�u�傫�ȁv�u�����ȁv�͒��������";
		mes "�������w���Ă���B";
		next;
		mes "[���C�L��]";
		mes "�u�傫�ȁv�͈�ԊO���A";
		mes "�u�����ȁv�͊O����肿����Ɠ����A";
		mes "�u�ƂĂ������ȁv�͒����ɋ߂���������";
		mes "�v���Ă���B�킩�����ȁB";
		set Zeny,Zeny-20000;
		set SIGN_QUE,SIGN_QUE+4;
		close;
	case 101:
	case 102:
	case 103:
	case 104:
		mes "[���C�L��]";
		mes "�悵�A�{�[�i�X��񂾁B";
		mes "���̕���Ƃ����̂́A�������";
		mes "�_��������B";
		mes "������A�����ȗ͂ł�";
		mes "�����Ĕj�邱�Ƃ��o���Ȃ��B";
		next;
		mes "[���C�L��]";
		mes "�����ďd���A�����đ傫�ȗ͂�������";
		mes "���킾���������j�邱�Ƃ��ł���B";
		next;
		mes "[���C�L��]";
		mes "�����ȁc�c";
		mes "�_������������j��Ƃ����̂��A";
		mes "�ǂ������Ӗ����ǂ��l���邱�Ƃ��B";
		next;
		mes "[���C�L��]";
		mes "�����āA����ɂ�";
		mes "^FF0000����̖@��^000000�������";
		mes "�o���Ă����Ƃ����B";
		close;
	default:
		if(SIGN_QUE < 150) {
			mes "[���C�L��]";
			mes "�����������͂Ȃ��B";
			mes "�_�X����炷�A�X�K���h��";
			mes "�������ɔ�ׂ�΁A";
			mes "�S�{����{���}�V���B";
			close;
		}
		mes "[���C�L��]";
		mes "�c�c�c�c�c�c";
		mes "���c�c";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		close;
	}
}

gl_dun02.gat,262,265,0	script	�_��I�ȋC�z#1	111,{
	set '@num,strnpcinfo(2);
	switch('@num) {
		case 1: set '@flag,101; break;
		case 2: setarray '@flag,102,104; break;
		case 3: setarray '@flag,103,105,108; break;
		case 4: set '@flag,109; break;
		case 5: setarray '@flag,106,112; break;
		case 6: setarray '@flag,107,116; break;
		case 7: setarray '@flag,110,111,113; break;
		case 8: setarray '@flag,114,115; break;
	}
	set '@len,getarraysize('@flag);
	for(set '@i,0; '@i<'@len; set '@i,'@i+1) {
		if(SIGN_QUE == '@flag['@i])
			break;
	}
	if('@i == '@len) {
		mes "�_��I�ȋC�z��������B";
		mes "�����������ɉA�T�ȋC�z����������B";
		close;
	}
	if(countitem(1530)) set '@power,50;
	else if(countitem(1363)) set '@power,66;
	else if(countitem(1722) || countitem(1471)) set '@power,68;
	else if(countitem(1369) || countitem(1470)) set '@power,70;
	else if(countitem(1367) || countitem(1368) || countitem(1466) || countitem(1469)) set '@power,72;
	else if(countitem(1365) || countitem(1366) || countitem(1473)) set '@power,74;
	else if(countitem(1170) || countitem(1468) || countitem(1168) || countitem(1169)) set '@power,76;
	else if(countitem(1364) || countitem(1913)) set '@power,78;
	else if(countitem(1261) || countitem(1528) || countitem(1167)) set '@power,80;
	else if(countitem(1305) || countitem(1720) || countitem(1136) || countitem(1137) || countitem(1166)) set '@power,82;
	else if(countitem(1164) || countitem(1165) || countitem(1467) || countitem(1138) || countitem(1139) || countitem(1224) || countitem(1225) || countitem(1416) || countitem(1526)) set '@power,84;
	else if(countitem(1135) || countitem(1140) || countitem(1141) || countitem(1527)) set '@power,86;
	else if(countitem(1237) || countitem(1524) || countitem(1525) || countitem(1557) || countitem(1415) || countitem(1964)) set '@power,88;
	else if(countitem(1132) || countitem(1134) || countitem(1233) || countitem(1234) || countitem(1235) || countitem(1414) || countitem(1523) || countitem(1236)) set '@power,90;
	else if(countitem(1131) || countitem(1230) || countitem(1232)) set '@power,92;
	else if(countitem(1719) || countitem(1130) || countitem(1133) || countitem(1223) || countitem(1229) || countitem(1231) || countitem(1413) || countitem(1814) || countitem(1242)) set '@power,94;
	else if(countitem(1227) || countitem(1228) || countitem(1240) || countitem(1241) || countitem(1962) || countitem(1813)) set '@power,96;
	else if(countitem(1558) || countitem(1963)) set '@power,98;
	else {
		mes "-���݃A�C�e���E�B���h�E��";
		mes "�������Ă��镐��ł�";
		mes "������������Ƃ͂ł��܂���-";
		close;
	}
	if(rand(100) < '@power) {
		mes "-����𐨂��悭�@���Ă݂����A";
		mes "�܂������������Ȃ�-";
		mes "-�����Ƌ����Ռ���^���Ȃ����";
		mes "�Ȃ�Ȃ��悤��-";
		close;
	}
	if((SIGN_QUE == 116 && '@num == 6) || (SIGN_QUE == 113 && '@num == 7) || '@num == 8) {
		mes "�Ō�̍��̂�����𓾂��u�ԁA";
		mes "4�̂����炪���ɕ����яオ��A";
		mes "���X�Ɍ����܂񂾁A��̓�����";
		mes "��΂ƂȂ����B";
		next;
		mes "�Â��ɂ��Ȃ��̎�ɗ�����";
		mes "���̕�΂��A���Ȃ��̓��̒���";
		mes "���ژb�������Ă����B";
		next;
		mes "���̍����N�ɗa���悤�B";
		mes "�������҂̎�ɓ����Ă���c�c";
		delitem 7306,3;
		set SIGN_QUE,117;
		getitem 7307,1;
		close;
	}
	mes "-�����U�艺�낵���u�ԁA";
	mes "���󂪉����A�_��I�Ȍ�������o����-";
	mes "-�_��I�Ȍ��𔭂��Ă��鉽����";
	mes "�������I-";
	next;
	mes "-���̂�������݂���-";
	set SIGN_QUE,SIGN_QUE+4;
	getitem 7306,1;
	close;
}

gl_dun02.gat,271,100,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#2	111
gl_dun02.gat,268,32,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#3	111
gl_dun02.gat,16,26,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#4	111
gl_dun02.gat,42,251,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#5	111
gl_dun02.gat,123,234,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#6	111
gl_dun02.gat,140,72,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#7	111
gl_dun02.gat,119,182,0	duplicate(�_��I�ȋC�z#1)	�_��I�ȋC�z#8	111

que_sign01.gat,45,227,4	script	���҂̎�	856,{
	if(SIGN_QUE < 117) {
		mes "[�w��]";
		mes "�ʂ��͏��҂���Ă��Ȃ��g��";
		mes "���̉�Ɖ�ɗ����Ɛ\���̂��H";
		mes "����҂߁I";
		mes "�ʂ��̐��E�֋A�邪�悢�I";
		close2;
		percentheal -100,0;
		end;
	}
	switch(SIGN_QUE) {
	case 117:
		mes "[�w��]";
		mes "���ҒB���犽�}����ʂ��́A������";
		mes "����܂ŁA�萔�������Ă��܂����ȁB";
		mes "�K���O�����e�B����A�ʂ���";
		mes "�A���O���{�_�̍��������Ă�����";
		mes "�������B";
		next;
		mes "[�w��]";
		mes "��͒����ԁA�A���O���{�_��";
		mes "�T���Ă����B�������˂΂Ȃ�܂��B";
		mes "�����肢������Ȃ�A�����Ă݂�B";
		next;
		menu "���Ȃ��̈����������",-;
		mes "[�w��]";
		mes "��𓾂����ƁH";
		mes "�܂��ɁA��̑S���Ђ��񂱂���";
		mes "�����Ă���悤�Ȃ��́B";
		next;
		mes "[�w��]";
		mes "�A���O���{�_�̍������߂���";
		mes "���ꂽ���͊��ӂ���B";
		mes "�������A����ł���Ȗ����ȗv����";
		mes "�ʂ�Ǝv�����B";
		next;
		menu "�ł́A�ǂ�����Έ�𓾂��܂����H",-;
		mes "[�w��]";
		mes "�����܂Ŋ肤�̂Ȃ�A1�񂾂��A";
		mes "��̌��Ђ��g�����Ƃ��������B";
		next;
		mes "[�w��]";
		mes "�S�Ă̎��҂����߁A�x�z���鎑�i�Ƃ���";
		mes "�ǂ�Ȗ��߂ł��������Ƃ��ł���B";
		mes "�������A�̂ɖ����邪�悢�B";
		mes "1�񂾂����ƂȁB";
		next;
		mes "-^FF0000��̐��E�̏ے�^000000���l������-";
		delitem 7307,1;
		set SIGN_QUE,118;
		getitem 7305,1;
		close;
	case 142:
		mes "[�w��]";
		mes "�����A�������c�c";
		next;
		mes "[�w��]";
		mes "��͂�A�ʂ�����s�v�c�ȋC�z��";
		mes "��������B��ɋ߂��悤�ȁc�c";
		mes "����ȋC�z���ȁB";
		next;
		mes "[�w��]";
		mes "�ʂ��A�����������C�z�̂���i��";
		mes "��ɂ������Ƃ͂Ȃ����H";
		next;
		if(select("The Sign","�X�^�[�W���G��")==1) {
			mes "[�w��]";
			mes "����A����ł͂Ȃ��c�c";
			mes "�C�z�̊������炵�āA�����ƑO��";
			mes "�G��Ă���͂��B";
			close;
		}
		mes "[�w��]";
		mes "�������c�c";
		mes "�܂����A����������Ă���Ƃ͂ȁc�c";
		next;
		mes "[�w��]";
		mes "���΂炭���ɑ݂��Ă͂���񂩁B";
		mes "�ʔ������̂������Ă�낤�B";
		next;
		if(select("�͂�","������")==2) {
			mes "[�w��]";
			mes "�͂́A�ʔ����B";
			mes "���̉�̗��݂�^��������";
			mes "�f��Ƃ͂ȁB";
			next;
			mes "[�w��]";
			mes "�ǂ��A���񂾂��͓��ʂɋ������B";
			mes "�������A���͍l���������ǂ��B";
			close2;
			warp "niflheim.gat",29,154;
			end;
		}
		mes "[�w��]";
		mes "�ł́A������ցB";
		mes "���A�����I���";
		delitem 7178,1;
		set SIGN_QUE,143;
		close;
	case 143:
		mes "[�w��]";
		mes "�c�c�c�c";
		next;
		misceffect 13;
		next;
		misceffect 32;
		next;
		misceffect 183;
		next;
		misceffect 90;
		next;
		mes "[�w��]";
		mes "�v���Ă��������肱���������B";
		mes "�ق�A����o���B";
		next;
		set SIGN_QUE,144;
		getitem 7025,1;
		mes "[�w��]";
		mes "��A����͉����ƂȁH";
		mes "���ꂱ���A�_�̗܂ƌĂ΂�Ă���";
		mes "���̖̂{���̎p�B";
		next;
		mes "[�w��]";
		mes "�ʂ������m���Ă���Ǝv���Ă���";
		mes "�ߋ���j���́A���ۂɂ͈Ⴄ���Ƃ�";
		mes "����̂��ƁA�Y���łȂ��B�^���́A";
		mes "�ق�̂ЂƂ����炵���Ȃ��B";
		next;
		mes "[�w��]";
		mes "����������Ȃ�A�_�X�̖�ځA";
		mes "�����̖�ڂƂ͉����A";
		mes "���ׂĂ݂�Ƃ����B";
		next;
		mes "[�w��]";
		mes "�䂪��������̂͂����܂ŁB";
		mes "���Ƃ́A�����Œ��ׂ邪�����B";
		close;
	default:
		if(SIGN_QUE < 142) {
			mes "[�w��]";
			mes "�ʂ���������A�ǂ̂悤�Ɏg������";
			mes "���R�B�������A���̌��ʂ͎���ӔC��";
			mes "�������悢�B";
			close;
		}
		mes "[�w��]";
		mes "�܂������p���H";
		close;
	}
}

que_sign01.gat,46,56,0	script	������	111,{
	if(SIGN_QUE < 118) {
		mes "�������B";
		mes "���ӂ�o���Ă��鐅��";
		mes "�ƂĂ����ꂢ�Ɍ�����B";
		next;
		if(select("��������ł݂�","�������܂Ȃ�")==2) {
			mes "�c�c�c�c";
			close;
		}
		mes "�c�c�c�c�c�c";
		close2;
		percentheal -100,0;
		end;
	}
	mes "�������B";
	mes "�����󂫃r���ɓ���悤���H";
	next;
	if(select("�����","����Ȃ�")==2) {
		mes "�c�c�c�c";
		close;
	}
	if(countitem(713) < 1) {
		mes "�󂫃r�����Ȃ��B";
		close;
	}
	delitem 713,1;
	getitem 12020,1;
	close;
}

que_sign02.gat,378,235,0	script	signwarp	45,1,1,{
	if(countitem(7313) == 1 && (SIGN_QUE < 124 || SIGN_QUE > 126)) {
		warp "que_sign01.gat",197,190;
		end;
	}
	if(getnpctimer(1,"SignTimer#witch")) {
		mes "�������i����j��ł���B";
		close;
	}
	initnpctimer "SignTimer#witch";
	warp "que_sign01.gat",197,190;
	end;
}

que_sign01.gat,0,0,0	script	SignTimer#witch	-1,{
OnTimer600000:
	areawarp "que_sign01.gat",166,162,229,227,"niflheim.gat",30,156;
	end;
OnTimer620000:
	killmonster "que_sign01.gat","SignTimer#witch::OnKilled";
	hideoffnpc "�Z����#witch";
	set 'mob,0;
	stopnpctimer;
	end;
OnKilled:
	set 'mob,'mob-1;
	if('mob < 1)
		hideoffnpc "�Z����#witch";
	end;
}

que_sign01.gat,197,195,4	script	�Z����#witch	90,{
	if(SIGN_QUE < 124) {
		emotion 9;
		mes "[�Z����]";
		mes "�c�c�c�c";
		close;
	}
	switch(SIGN_QUE) {
	case 124:
		mes "[�Z����]";
		mes "�Ƃ��Ƃ������܂ł��炵��";
		mes "���܂����̂ł��ˁB";
		mes "�����������悤�Ƃ��Ă������A";
		mes "�������畷�����̂ł��傤�B";
		next;
		mes "[�Z����]";
		mes "�ޏ��́A���������l���Ă����̂�";
		mes "�m���Ă��܂����B";
		mes "������A�����Ď����Ă����̂ł��B";
		next;
		menu "�ǂ����Ă���Ȏ����c�c",-;
		mes "[�Z����]";
		mes "�������畷���Ēm���Ă���Ǝv���܂���";
		mes "���͐l�ԂɂȂ肽���̂ł��B";
		next;
		mes "[�Z����]";
		mes "�j�u���w�C���ɗ��܂�A���Ƃ�������";
		mes "��C���ċz���A��]�Ƃ������̐H����";
		mes "�H�ׂĕ�炵���������Ȃ��̂ł��B";
		next;
		menu "����Ń_�[�N���[�h���c�c",-;
		mes "[�Z����]";
		mes "���Ȃ����w���l���炢��������������";
		mes "1�񂵂��g���܂���B";
		mes "����ł́A���𐶂̐��E�A";
		mes "�~�b�h�K���h�ɓ����͕̂s�\�ł��B";
		next;
		mes "[�Z����]";
		mes "�����Ȃ�ƁA";
		mes "���̊肢�����Ȃ�����̂�";
		mes "�_�[�N���[�h�����B";
		next;
		menu "�_�[�N���[�h���������ꂽ��I",-;
		mes "[�Z����]";
		mes "�������A�_�[�N���[�h�����̐��E��";
		mes "������΁A�ǂ��Ȃ��Ă��܂���";
		mes "�������Ă��܂��B";
		mes "�_�[�N���[�h�̓~�b�h�K���h��j�󂵁A";
		mes "�����̎��������炷�ł��傤�B";
		next;
		menu "���ꂶ�Ⴀ�A���܂�ς���Ă��I",-;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes "���Ȃ��̌��t�ǂ���A�j�󂳂ꂽ";
		mes "�~�b�h�K���h�ɐ����Ԃ��Ă��Ӗ���";
		mes "�Ȃ��̂ł��傤�c�c";
		next;
		mes "[�Z����]";
		mes "�ł��A�j�u���w�C���ł̋�ɂƟ��߂���";
		mes "�����Ƒς��Ă�����A�����Ƃ����B";
		next;
		mes "[�Z����]";
		mes "���̊肢�́u���v�B";
		mes "�����A���ꂾ���B";
		mes "�����Ă���Ƃ������̏؋���";
		mes "����������ł��B";
		next;
		mes "[�Z����]";
		mes "������A���E���ǂ��Ȃ邩��";
		mes "�֌W����܂���B";
		next;
		mes "[�Z����]";
		mes "�Â���C���z�������B";
		mes "�S�����h�L�h�L����̂����������B";
		mes "�̉������������̂��~�����c�c";
		next;
		mes "[�Z����]";
		mes "����Ȏ�������Ɏv���Ȃ�";
		mes "�������Ă��������c�c";
		mes "���肢�c�c";
		mes "�ǂ����A�ז����Ȃ��Łc�c";
		next;
		if(select("�ޏ����~�߂�","�ޏ���������")==1) {
			set SIGN_QUE,125;
			close;
		}
		mes "[�Z����]";
		mes "�c�c���肪�Ƃ��������܂��B";
		mes "�������A���Ȃ��͐_�̎�����";
		mes "�p�X�ł��Ȃ��Ȃ邩������܂���B";
		next;
		mes "[�Z����]";
		mes "�����A�����Ɛ_�͋����Ȃ��ł��傤�B";
		mes "���Ȃ��́A�E�C���������߂ɁA�����܂�";
		mes "�ꂵ����������Ă��܂����B";
		mes "�����S�ē����o���̂ł���B";
		next;
		mes "[�Z����]";
		mes "�{���Ɂc�c�ǂ��̂ł����H";
		next;
		if(select("��͂�~�b�h�K���h�̂��߁c�c","����c�c")==1) {
			set SIGN_QUE,125;
			close;
		}
		mes "[�Z����]";
		mes "�c�c�Ō�̗͂ŁA���Ȃ���";
		mes "�~�b�h�K���h�ɑ���܂��傤�B";
		next;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		set SIGN_QUE,200;
		if(checkre())
			getexp 20000,0;
		else
			getexp 200000,0;
		stopnpctimer "SignTimer#witch";
		close2;
		warp "umbala.gat",132,203;
		end;
	case 125:
		mes "[�Z����]";
		mes "�c�c�_�[�N���[�h�������ł��Ȃ��ȏ�";
		mes "���Ȃ��ɒ�R����͖̂��ʂł��傤�B";
		mes "�ł��c�c�c�c";
		next;
		mes "[�Z����]";
		mes "���͖�����̂��߁A�����ɕK�v�ȗ́A";
		mes "���Ȃ킿�A��������̎��҂̐�]��";
		mes "�W�߂Ă��܂����B";
		next;
		if(countitem(2643)) {
			mes "[�Z����]";
			mes "���̗��݂ŁA���Ȃ�����`���Ă��ꂽ";
			mes "�������̂��Ɓc�c";
			mes "���ʂ͂ǂ��ł����H";
			mes "���ǁA�~�ς��ꂽ�͂��̍����A";
			mes "��]����E���邱�Ƃ��ł����ɂ���B";
			next;
			mes "[�Z����]";
			mes "�j�u���w�C���ɋ���A���L�i�́A";
			mes "���������񂾂��Ƃ�m��Ȃ��B";
			mes "�Ƃ֋A���Ƃ�����]��������̂�";
			mes "���ǂ͋A�ꂸ�A����ɑ傫�Ȑ�]��";
			mes "��������B";
		}
		else {
			mes "[�Z����]";
			mes "���̍ŏ��̗��݂�f�������ƂŁA";
			mes "�����𓾂��Ȃ��������͐�]��";
			mes "�߂���A�j�u���w�C���ɗ��܂���";
			mes "���܂��B";
		}
		next;
		mes "[�Z����]";
		mes "���Ȃ����������Ƃ́A���ʂƂ���";
		mes "��ɂɂ����Ă΂Ȃ������B";
		mes "�����A���͍ŏ����炻���Ȃ�Ǝv��";
		mes "���Ȃ��ɂ��̂悤�Ȃ��肢��";
		mes "�����̂ł��B";
		next;
		if(countitem(2643)) {
			mes "[�Z����]";
			mes "�����āA���ۂ��̒ʂ�ɂȂ����B";
			mes "���Ȃ��̂������ŁA�ޏ��̐�]�͑���";
			mes "���̐�]�͎��̗͂ƂȂ����c�c";
			next;
		}
		mes "[�Z����]";
		mes "�_�[�N���[�h�ɔ��鎄�̍��́A";
		mes "����ȗ͂����������߂Ă����c�c";
		mes "�ނ��������邽�߂Ɂc�c";
		next;
		mes "[�Z����]";
		mes "�{���́A���Ȃ��Ƒ��������Ȃ��c�c";
		next;
		mes "[�Z����]";
		mes "�������A���ꂵ�����@���Ȃ��Ȃ�c�c";
		mes "�������܂�ς��ɂ�";
		mes "���ꂵ���Ȃ��Ȃ�c�c";
		mes "���͕����Ȃ��A��΂ɕ����Ȃ��I";
		mes "�킢�܂��A���Ȃ��ƁI";
		close2;
		set SIGN_QUE,126;
		set getvariableofnpc('mob,"SignTimer#witch"),10;
		monster "que_sign01.gat",196,195,"�_�[�N���[�h�̕��g",1605,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",180,180,"�G���V�F���g�}�~�[",1522,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",210,210,"�G���V�F���g�}�~�[",1522,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",200,200,"�G���V�F���g���C�X",1475,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",200,180,"�G���V�F���g���C�X",1475,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",180,200,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",205,205,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",190,190,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",205,190,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",190,205,"����������",1423,1,"SignTimer#witch::OnKilled";
		hideonnpc;
		end;
	case 126:
		mes "[�Z����]";
		mes "�c�c���ꂪ�A���̂��悤��";
		mes "���Ă������ɑ΂��铚���Ȃ̂ł��ˁB";
		next;
		mes "[�Z����]";
		mes "�������ɂ́A�S�Ă̋L���������A";
		mes "�j�u���w�C���Ƃ������̎��̒���";
		mes "�����Ă��������A�I����";
		mes "�Ȃ��̂ł��ˁc�c";
		next;
		mes "[�Z����]";
		mes "1�����A�����Ă��ǂ��ł����H";
		mes "�ǂ����āA���Ȃ��͈�������Ă��Ȃ���";
		mes "���̖�����߂ƁA���߂��Ȃ�������";
		mes "�ł����H";
		next;
		mes "[�Z����]";
		mes "���̈���g���΁c�c�����܂�";
		mes "�����鎀�҂ɁA�ǂ�Ȗ��߂ł�";
		mes "�������Ƃ��o�����̂Ɂc�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�����ł��ˁc�c";
		mes "���Ȃ��̖ڂ�����΁A";
		mes "������C�����܂��B";
		next;
		mes "[�Z����]";
		mes "�Ō�̍Ō�܂Ŏ��ɁA�@���";
		mes "�^���Ă���Ă����̂ł��ˁc�c";
		mes "�����āA����𓊂��̂Ă��̂́A";
		mes "�����g�c�c";
		next;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "�󋕂ȍ������̎������ǁA";
		mes "���Ȃ��̂悤�Ȑl�ɉ�Ă悩�����B";
		next;
		mes "[�Z����]";
		mes "�܂�Ŗ��𓾂��悤�ȁc�c";
		mes "��؂Łc�c";
		mes "�g�����c�c";
		mes "����ȏo�������āA";
		mes "�{���ɂ��肪�Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "���ׂĂ̋L���������Ă��A";
		mes "�o����΁c�c���Ȃ��Ɋւ���L����";
		mes "���������Ȃ��c�c";
		next;
		mes "[�Z����]";
		mes "�������A�����ƖY��܂���B";
		mes "����Əo����A���̉����肾����c�c";
		next;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		mes "���Ȃ��̖����ɍK����񂱂Ƃ��c�c";
		delitem 7308,1;
		set SIGN_QUE,127;
		close;
	case 127:
		mes "-���Ȃ��͓|�ꂽ�Z���������������";
		mes "�j�u���w�C���ւƋA���čs����-";
		close2;
		set SIGN_QUE,128;
		stopnpctimer "SignTimer#witch";
		warp "que_sign01.gat",117,137;
		close;
	case 198:
		mes "[�Z����]";
		mes "�܂����߂��Ȃ��̂ł����H";
		mes "�c�c�c�c�c�c";
		mes "���肢�A����ȏ�A���̎ז���";
		mes "���Ȃ��ŁI";
		close2;
		set SIGN_QUE,126;
		set getvariableofnpc('mob,"SignTimer#witch"),10;
		monster "que_sign01.gat",196,195,"�_�[�N���[�h�̕��g",1605,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",180,180,"�G���V�F���g�}�~�[",1522,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",210,210,"�G���V�F���g�}�~�[",1522,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",200,200,"�G���V�F���g���C�X",1475,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",200,180,"�G���V�F���g���C�X",1475,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",180,200,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",205,205,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",190,190,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",205,190,"����������",1423,1,"SignTimer#witch::OnKilled";
		monster "que_sign01.gat",190,205,"����������",1423,1,"SignTimer#witch::OnKilled";
		hideonnpc;
		end;
	case 200:
		mes "[�Z����]";
		mes "�c�c�Ō�̗͂ŁA���Ȃ���";
		mes "�~�b�h�K���h�ɑ���܂��傤�B";
		close2;
		stopnpctimer "SignTimer#witch";
		warp "umbala.gat",132,203;
		end;
	default:
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		close;
	}
}

que_sign01.gat,0,0,0	script	SignTimer#serin	-1,{
OnTimer600000:
	areawarp "que_sign01.gat",166,12,229,77,"niflheim.gat",30,156;
	end;
OnTimer620000:
	killmonster "que_sign01.gat","SignTimer#serin::OnKilled";
	hideoffnpc "�Z����#serin";
	hideonnpc "�Z����#dummy";
	hideonnpc "�_�[�N���[�h#serin";
	stopnpctimer;
	end;
OnKilled:
	hideoffnpc "�Z����#serin";
	end;
}

que_sign01.gat,196,39,4	script	�Z����#serin	90,{
	if(SIGN_QUE < 132) {
		mes "[�Z����]";
		mes "�c�c�H";
		close;
	}
	switch(SIGN_QUE) {
	case 132:
		mes "[�Z����]";
		mes "���̖��͂́c�c�ǂ����A";
		mes "�����w�͊������Ă���悤�ł��B";
		mes "���Ԃ񂻂̈󂪁A�Ō�ɕK�v��";
		mes "�ޗ��Ȃ̂ł��傤�B";
		next;
		mes "[�Z����]";
		mes "�����w��j�󂵂܂��傤�B";
		mes "���́A���̈�����ɂ���܂��񂩁H";
		mes "���̖����w�����S�ɏ������邽�߁A";
		mes "�ǂ����Ă��K�v�Ȃ̂ł��B";
		next;
		menu "�n��",-;
		mes "[�Z����]";
		mes "��Ȃ����痣��Ă��������I";
		delitem 7305,1;
		set SIGN_QUE,133;
		hideoffnpc "�Z����#dummy";
		initnpctimer "�Z����#dummy";
		hideonnpc;
		close;
	case 133:
		mes "[�Z����]";
		mes "�c�c���߂�Ȃ����B";
		mes "�_�[�N���[�h����������ɂ́A";
		mes "���̕��@�����Ȃ�������ł��B";
		next;
		menu "�c�c�ǂ�����?!",-;
		mes "[�Z����]";
		mes "�c�c�c�c";
		mes "�_�[�N���[�h��������������";
		mes "�肢�����Ȃ��ė~���������̂́A";
		mes "�����ł͂���܂���B";
		mes "���ł��c�c";
		next;
		menu "�Ȃ��c�c",-;
		mes "[�Z����]";
		mes "�c�c���́A�l�ԂɂȂ肽���̂ł��B";
		mes "�j�u���w�C���ɗ��܂�A";
		mes "���Ƃ������̋�C���ċz���A";
		mes "��]�Ƃ������̐H����H�ׂ�";
		mes "��炵���������Ȃ��̂ł��B";
		next;
		menu "����Ń_�[�N���[�h���c�c",-;
		mes "[�Z����]";
		mes "���Ȃ����w���l���炢��������������";
		mes "1�񂵂��g���܂���B";
		mes "����ł́A���𐶂̐��E�A";
		mes "�~�b�h�K���h�ɓ����͕̂s�\�ł��B";
		next;
		mes "[�Z����]";
		mes "�����Ȃ�ƁA";
		mes "���̊肢�����Ȃ�����̂�";
		mes "�_�[�N���[�h�����B";
		next;
		menu "�_�[�N���[�h���������ꂽ��I",-;
		mes "[�Z����]";
		mes "�������A�_�[�N���[�h�����̐��E��";
		mes "������΁A�ǂ��Ȃ��Ă��܂���";
		mes "�������Ă��܂��B�_�[�N���[�h�́A";
		mes "�~�b�h�K���h��j�󂵁A�����̎���";
		mes "�����炷�ł��傤�B";
		next;
		menu "���ꂶ�Ⴀ�A���܂�ς���Ă��I",-;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		mes "���Ȃ��̌��t�ǂ���A�r��ƂȂ���";
		mes "�~�b�h�K���h�ɐ����Ԃ��Ă��Ӗ���";
		mes "�Ȃ��̂ł��傤�c�c";
		mes "�ł��A�j�u���w�C���ł̋�ɂƎS�߂���";
		mes "�����Ƒς��Ă�����A�����Ƃ����B";
		next;
		mes "[�Z����]";
		mes "���̊肢�́u���v�B";
		mes "�����A���ꂾ���B";
		mes "�����Ă���Ƃ������̏؂�";
		mes "����������ł��B";
		next;
		mes "[�Z����]";
		mes "������A���E���ǂ��Ȃ邩��";
		mes "�֌W����܂���B";
		next;
		mes "[�Z����]";
		mes "�Â���C���z�������B";
		mes "�S�����h�L�h�L����̂����������B";
		mes "�̉������������̂��~�����c�c";
		next;
		mes "[�Z����]";
		mes "����Ȏ�������Ɏv���Ȃ�";
		mes "�������Ă��������c�c";
		mes "���肢�c�c";
		mes "�ǂ����A�ז����Ȃ��Łc�c";
		next;
		if(select("�ޏ���������","�ޏ����~�߂�")==1) {
			mes "[�Z����]";
			mes "�c�c���肪�Ƃ��������܂��B";
			mes "�������A���Ȃ��͐_�̎�����";
			mes "�p�X�ł��Ȃ��Ȃ邩������܂���B";
			next;
			mes "[�Z����]";
			mes "�����A�����Ɛ_�͋����Ȃ��ł��傤�B";
			mes "���Ȃ��́A�E�C���������߂ɁA�����܂�";
			mes "�ꂵ����������Ă��܂����B";
			mes "�����S�ē����o���̂ł���B";
			next;
			mes "[�Z����]";
			mes "�{���Ɂc�c�ǂ��̂ł����H";
			next;
			if(select("��͂�~�b�h�K���h�̂��߁c�c","����c�c")==2) {
				mes "[�Z����]";
				mes "�c�c�Ō�̗͂ŁA���Ȃ���";
				mes "�~�b�h�K���h�ɑ���܂��傤�B";
				next;
				mes "[�Z����]";
				mes "���肪�Ƃ��c�c";
				set SIGN_QUE,200;
				if(checkre())
					getexp 20000,0;
				else
					getexp 200000,0;
				stopnpctimer "SignTimer#serin";
				close2;
				warp "umbala.gat",132,203;
				end;
			}
		}
		mes "[�Z����]";
		mes "�{���́A���Ȃ��Ƒ��������Ȃ��c�c";
		mes "�������A���ꂵ�����@���Ȃ��Ȃ�c�c";
		mes "�������܂�ς��ɂ�";
		mes "���ꂵ���Ȃ��Ȃ�c�c";
		mes "���͕����Ȃ��A��΂ɕ����Ȃ��I";
		mes "�킢�܂��A���Ȃ��ƁI";
		next;
		emotion 29,"�_�[�N���[�h#serin";
		mes "[�_�[�N���[�h]";
		mes "���ɗ����������ƌ����̂��B";
		mes "�������l�Ԃ̂����ɁA���ӋC�ȁB";
		mes "����Ȃ�A�܂����O����";
		mes "���Ղ�ɏグ�Ă���悤�I";
		close2;
		set SIGN_QUE,134;
		hideonnpc;
		hideonnpc "�_�[�N���[�h#serin";
		monster "que_sign01.gat",196,44,"�_�[�N���[�h�̕��g",1605,1,"SignTimer#serin::OnKilled";
		end;
	case 134:
		mes "[�Z����]";
		mes "�c�c���ꂪ�A���̂��悤��";
		mes "���Ă������ɑ΂��铚���Ȃ̂ł��ˁB";
		next;
		mes "[�Z����]";
		mes "�������ɂ́A�S�Ă̋L���������A";
		mes "�j�u���w�C���Ƃ������̎��̒���";
		mes "�����Ă��������A�I����";
		mes "�Ȃ��̂ł��ˁc�c";
		next;
		mes "[�Z����]";
		mes "1�����A�����Ă��ǂ��ł����H";
		mes "�ǂ����āA���Ȃ��͈�������Ă��Ȃ���";
		mes "���Ɏ~�߂�Ɩ��߂��Ȃ�������";
		mes "�ł����H";
		next;
		mes "[�Z����]";
		mes "���̈���g���΁c�c�����܂�";
		mes "�����鎀�҂ɁA�ǂ�Ȗ��߂ł�";
		mes "�������Ƃ��o�����̂Ɂc�c";
		next;
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�Z����]";
		mes "�����ł��ˁc�c";
		mes "���Ȃ��̖ڂ�����΁A";
		mes "������C�����܂��B";
		next;
		mes "[�Z����]";
		mes "�Ō�̍Ō�܂Ŏ��ɁA�@���";
		mes "�^���Ă���Ă����̂ł��ˁc�c";
		mes "�����āA����𓊂��̂Ă��̂́A";
		mes "�����g�c�c";
		next;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "�󋕂ȍ������̎������ǁA";
		mes "���Ȃ��̂悤�Ȑl�ɉ�Ă悩�����B";
		next;
		mes "[�Z����]";
		mes "�܂�Ŗ��𓾂��悤�ȁc�c";
		mes "��؂Łc�c";
		mes "�g�����c�c";
		mes "����ȏo�������āA";
		mes "�{���ɂ��肪�Ƃ��c�c";
		next;
		mes "[�Z����]";
		mes "���ׂĂ̋L���������Ă��A";
		mes "�o����΁c�c���Ȃ��Ɋւ���L����";
		mes "���������Ȃ��c�c";
		next;
		mes "[�Z����]";
		mes "�������A�����ƖY��܂���B";
		mes "����Əo����A���̉����肾����c�c";
		next;
		mes "[�Z����]";
		mes "���肪�Ƃ��c�c";
		mes "���Ȃ��̖����ɍK����񂱂Ƃ��c�c";
		set SIGN_QUE,135;
		close;
	case 135:
		mes "-���Ȃ��͓|�ꂽ�Z���������������";
		mes "�j�u���w�C���ւƋA���čs����-";
		close2;
		set SIGN_QUE,136;
		stopnpctimer "SignTimer#serin";
		warp "que_sign01.gat",117,137;
		close;
	case 199:
		mes "[�Z����]";
		mes "�܂����߂��Ȃ��̂ł����H";
		mes "�c�c�c�c�c�c";
		mes "���肢�A����ȏ�A���̎ז���";
		mes "���Ȃ��ŁI";
		close2;
		set SIGN_QUE,134;
		hideonnpc;
		hideonnpc "�_�[�N���[�h#serin";
		monster "que_sign01.gat",196,44,"�_�[�N���[�h�̕��g",1605,1,"SignTimer#serin::OnKilled";
		end;
	case 200:
		mes "[�Z����]";
		mes "�c�c�Ō�̗͂ŁA���Ȃ���";
		mes "�~�b�h�K���h�ɑ���܂��傤�B";
		close2;
		stopnpctimer "SignTimer#serin";
		warp "umbala.gat",132,203;
		end;
	default:
		mes "[�Z����]";
		mes "�c�c�c�c�c�c";
		close;
	}
}

que_sign01.gat,196,39,4	script	�Z����#dummy	90,{
	end;
OnInit:
	hideonnpc;
	end;
OnTimer3000:
	misceffect 13;
	end;
OnTimer6000:
	misceffect 8;
	end;
OnTimer9000:
	misceffect 90;
	end;
OnTimer13000:
	hideonnpc;
	hideoffnpc "�_�[�N���[�h#serin";
	hideoffnpc "�Z����#serin";
	stopnpctimer;
	end;
}

que_sign01.gat,196,44,4	script	�_�[�N���[�h#serin	737,{
	end;
OnInit:
	hideonnpc;
	end;
}

geffen.gat,119,48,0	script	������	111,{
	if(countitem(7025) < 1) {
		mes "�����䂪����B";
		close;
	}
	mes "�u�����̒Q���v���s�v�c�Ȍ���";
	mes "�����n�߂��B������̈ꕔ���A";
	mes "���̌��Ɍĉ�����悤��";
	mes "��������Ă���B";
	misceffect 200;
	misceffect 200,"";
	next;
	if(select("�����̒Q����������","��������")==2) {
		mes "�c�c�c�c";
		close;
	}
	announce "���Ƌ��ɃQ�t�F�j�A�ւ̖傪�J���ꂽ",9,0x9CFF00;
	mes "�����̗܂𕬐���̌��ւ�������";
	mes "�����䂪�X�Ɍ���A�������Ƃ̂Ȃ�";
	mes "�傪�J�����B";
	misceffect 247;
	donpcevent "GefeniaWarp::OnStart";
	close;
}

geffen.gat,119,55,0	script	GefeniaWarp	45,1,1,{
OnTouch:
	//switch(rand(4)) { //���d�l
	switch('rand) {
		case 0: warp "gefenia01.gat",58,169; break;
		case 1: warp "gefenia02.gat",116,115; break;
		case 2: warp "gefenia03.gat",130,206; break;
		case 3: warp "gefenia04.gat",133,88; break;
	}
	end;
OnInit:
	hideonnpc;
	end;
OnStart:
	set 'rand,rand(4);
	hideoffnpc;
	initnpctimer;
OnTimer10000:
OnTimer20000:
OnTimer30000:
OnTimer40000:
	misceffect 247;
	end;
OnTimer45000:
	hideonnpc;
	announce "�Q�t�F�j�A�ւ̖傪�܂�܂�",9,0x9CFF00;
	stopnpctimer;
	end;
}