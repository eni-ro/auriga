-- ID,MOB_ID,{Slot,OptID,{OptVal_min,OptVal_max},Rate}

ItemRandoptTBL = 
{
	{--�n���E�B���W���b�N => �J�{�`���w�b�h
		ID = 19175,
		MOB_ID = 1722,
		Option = {{1,148,{7,35},5000},{1,152,{1,13},5000},{2,170,{1,10},10000},},
	},
};

function main()
	for k,v in pairs(ItemRandoptTBL) do
		result,msg = addrandopt(v.ID,v.MOB_ID,v.Option);
		if(result) then
			return true,"Success";
		end
	end

	return false,msg;
end

main()
