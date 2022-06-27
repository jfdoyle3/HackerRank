# Enter your code here. Read input from STDIN. Print output to STDOUT
if __FILE__ ==$0
    test_case=gets.chomp.to_i
    for test in 0..test_case
        word=gets.chomp()
		#word_array=word.split("")
        #print word_array
        if i%2==0
            len=s.length()
            len.times do |len|
             if len%2==0
                 print s[len]
             end
            end    
        end
        print " "
        if i%2!=0
           len1=s.length()
           len1.times do |len1|
            if len1%2!=0
                print s[len1] 
            end
           end 
        end
    end
end