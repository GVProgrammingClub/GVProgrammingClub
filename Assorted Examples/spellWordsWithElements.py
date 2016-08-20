# This is a python program that takes a list of strings as input and returns those
# strings as a combination of elemental symbols
input = ["Nate",]
index = 0
def findSymbols(string, found=[]):
	symbols = ["Ac","Al","Am","Sb","Ar","As","At","Ba","Bk","Be","Bi","Bh","B","Br","Cd","Ca","C","Ce","Cs","Cl","Cr","Co","Cu","Cm","Ds","Db","Dy","Es","Er","Eu","Fm","F","Fr","Gd","Ga","Ge","Au","Hf","Hs","He","Ho","H","In","I","Ir","Fe","Kr","La","Lr","Pb","Li","Lu","Mg","Mn","Mt","Md","Hg","Mo","Nd","Ne","Np","Ni","Nb","N","No","Os","O","Pd","P","Pt","Pu","Po","K","Pr","Pm","Pa","Ra","Rn","Re","Rh","Rg","Rb","Ru","Rf","Sm","Sc","Sg","Se","Si","Ag","Na","Sr","S","Ta","Tc","Te","Tb","Tl","Th","Tm","Sn","Ti","W","Uub","Uuh","Uuo","Uup","Uuq","Uus","Uut","Uuu","U","V","Xe","Yb","Y","Zn","Zr",]
	for s in symbols:
		if s.lower() == (string[0:len(s)]).lower():
			found.append(s)
			if s.lower() == string.lower():
				return found
			output = findSymbols(string[len(s):],found)
			if output != None:
				return output
			found.pop()
	return None



for i in input:
	symbols = findSymbols(i, [])
	if symbols != None:
		print("Input: " + i + "; Symbols: " + ", ".join(symbols) + ";")
