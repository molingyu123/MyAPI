//����������ʽ��ȡ��ַ��������-- ���Խ�������а�������
//����������ʹ�����·�ʽ����:"xxx.do?name ="+ encodeURIComponent(name);
function getURIParams(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = decodeURIComponent(window.location.search).substr(1).match(reg);
	if(r != null) return unescape(r[2]);
	return null;
}

//����������ʽ��ȡ��ַ��������-- �����в��ܰ�������
function getUrlParams(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r != null) return unescape(r[2]);
	return null;
}

//��ѯĳ����ֵΪ�ƶ����������
function queryArrObj(_arr,proName,value) {
	var obj = null;
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][proName] == value) {
			obj = _arr[i];
			break;
		}
	}
	return obj;
}

/**
 * //��������Ԫ��
 * @param {Object} _arr ���޸ĵ�����
 * @param {Object} eqProName ��Ϊ�Ƚ���������������
 * @param {Object} eqValue ��Ϊ�Ƚ����������������Ӧ��ֵ
 * @param {Object} upProName ��Ҫ�޸ĵ�������
 * @param {Object} upValue ��Ҫ�޸����Զ�Ӧ��ֵ
 */
function updateArrElement(_arr,eqProName,eqValue,upProName,upValue){
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][eqProName] == eqValue) {
			_arr[i][upProName]=upValue;
			return _arr;
		}
	}
}

//������������Ӧ��ֵ�Ƴ�����
function removerArrObjByProName(_arr,proName,value){
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][proName] == value) {
			if(i == 0) {
				return _arr.shift(); //ɾ������������ĵ�һ��Ԫ��
			} else if(i == length - 1) {
				return _arr.pop(); //ɾ����������������һ��Ԫ��
			} else {
				return _arr.splice(i, 1); //ɾ���±�Ϊi��Ԫ��
			}
		}
	}
}

//�Ƴ��������--����������
function removeArrObjProName(_arr, _obj,proName) {
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i]["'"+proName+"'"] == _obj["'"+proName+"'"]) {
			if(i == 0) {
				_arr.shift(); //ɾ������������ĵ�һ��Ԫ��
				return;
			} else if(i == length - 1) {
				_arr.pop(); //ɾ����������������һ��Ԫ��
				return;
			} else {
				_arr.splice(i, 1); //ɾ���±�Ϊi��Ԫ��
				return;
			}
		}
	}
}

//�Ƴ��������
function removeArrObj(_arr, _obj) {
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i] == _obj) {
			if(i == 0) {
				_arr.shift(); //ɾ������������ĵ�һ��Ԫ��
				return;
			} else if(i == length - 1) {
				_arr.pop(); //ɾ����������������һ��Ԫ��
				return;
			} else {
				_arr.splice(i, 1); //ɾ���±�Ϊi��Ԫ��
				return;
			}
		}
	}
}