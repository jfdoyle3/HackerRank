# Enter your code here. Read input from STDIN. Print output to STDOUT
if __FILE__ ==$0
    test_cases=gets.chomp().to_i
    test_cases.times do |test_cases|
        word=gets.chomp()
        word.length().times do |index|
             word.split("")
            if index%2==0
                print word[index]
                end    
            end
        

        # print " "
        # if test%2!=0
        #    len1=s.length()
        #    len1.times do |len1|
        #     if len1%2!=0
        #         print s[len1] 
        #     end
        #    end 
        # end
    end
end