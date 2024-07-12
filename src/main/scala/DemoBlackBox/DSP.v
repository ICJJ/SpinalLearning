module DSP(
    input a,
    inout b,
    output p
);

    assign p = a ^ b;
endmodule
