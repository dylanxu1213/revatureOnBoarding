/*function sortArray(array)
{
	if(array.length == 1)
	{
		return array;
	}
	const arr1 = sortArray(array.slice(0,array.length/2));
	const arr2 = sortArray(array.slice(array.length/2,array.length));
	const ret = [];
	let i = 0;
	let j = 0;
	let k = 0;
	while((i<arr1.length)&&(j<arr2.length))
	{
		if(arr1[i]<arr2[j])
		{
			ret[k] = arr1[i];
			i++;
		}
		else
		{
			ret[k] = arr2[j];
			j++;
		}
		k++;
	}
	if(i<arr1.length)
	{
		ret.push(arr1.slice(i,arr1.length));
	}
	if(j<arr2.length)
	{
		ret.push(arr2.slice(j,arr2.length));
	}
	return ret;
}*/

function isVowel(ch)
{
	let c = ch.toLowerCase();
	return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
}

function getVowelSubstrings(str)
{
	const indicies = [];
	const words = [];
	let i = 0;
	let j = 0;
	for(;i<str.length;i++)
	{
		if(isVowel(str.charAt(i)))
		{
			indicies[j] = i;
			j++;
		}
	}
	for(i = 0; i<indicies.length;i++)
	{
		for(j=i; j<indicies.length; j++)
		{
			if(!words.includes(str.substring(indicies[i],indicies[j]+1)))
			{
				words.push(str.substring(indicies[i],indicies[j]+1));
			}
		}
	}
	words.sort();
	return words;
}

function getConsonantSubstrings(str)
{
	const indicies = [];
	const words = [];
	let i = 0;
	let j = 0;
	for(;i<str.length;i++)
	{
		if(!isVowel(str.charAt(i)))
		{
			indicies[j] = i;
			j++;
		}
	}
	for(i = 0; i<indicies.length;i++)
	{
		for(j=i; j<indicies.length; j++)
		{
			if(!words.includes(str.substring(indicies[i],indicies[j]+1)))
			{
				words.push(str.substring(indicies[i],indicies[j]+1));
			}
		}
	}
	words.sort();
	return words.sort();
}